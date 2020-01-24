package com.scrap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class ScrapApplication {
       public static void main(String[] args) throws IOException {
//              String fileName = "path/to/file.html";
//              Document document = Jsoup.parse(new File(fileName), "utf-8");
//              Element divTag = document.getElementById("phoneDiv");
//              System.out.println(divTag.text());
//
//              String webPage = "http://www/irtelecom.az";
//              String html = Jsoup.connect(webPage).get().html();
//              System.out.println(html);
              SpringApplication.run(ScrapApplication.class,args);
       }

}
