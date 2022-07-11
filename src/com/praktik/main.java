package com.praktik;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) throws IOException {
        System.out.println("Подключение к RSS каналу...");
        List<Post> posts = new ArrayList<>();

        Document doc = Jsoup.connect("https://news.google.com/rss?hl=ru&gl=RU&ceid=RU:ru").get();
        Elements postTitleElements = doc.getElementsByTag("item");
        for (Element postTitleElement : postTitleElements) {
            Post post = new Post();
            post.setTitle(postTitleElement.getElementsByTag("title").text());

            try {
                Elements authorElement = postTitleElement.getElementsByTag("source");
                Elements DateOfCreated = postTitleElement.getElementsByTag("pubDate");
                post.setAuthor(authorElement.text());
                post.setDateOfCreated(DateOfCreated.text());
            } catch (NullPointerException e) {
                post.setAuthor("Автора нет");
                post.setDateOfCreated("Даты создания нет");
            }
            posts.add(post);
        }
        posts.forEach(System.out::println);

        }
    }
