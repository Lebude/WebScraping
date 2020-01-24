//package com.scrap.jsoup;
//
//import com.scrap.model.PhoneAndTablet;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JsoupSc {
//    public static void main(String[] args) throws IOException {
//        List<PhoneAndTablet> phoneAndTabletList = new ArrayList<>();
//
//        Document document1 = Jsoup.connect("http://www.irtelecom.az").get();
//        String keywords = document1.select("meta[name=keywords]").first().attr("content");
//        System.out.println("Meta keyword:" + keywords);
//        String description = document1.select("meta[name=description]").get(0).attr("content");
//        System.out.println("Meta description : " + description);
//
//        Document document2=Jsoup.connect("http://www.irtelecom.az").get();
//        String title1=document2.title();
//        System.out.println("title:" + title1);
//        Elements products=document2.getElementsByTag("product");
//        Elements tablet=document1.getElementsByClass("product_block");
//
////        for (Element product : products){
////            System.out.println(product.getElementsByClass("product_block"));
////            System.out.println(product.getElementsByClass("product_side"));
////            System.out.println(product.getElementsByClass("lSSlideWrapper"));
////        }
//
//
//        Document document = Jsoup.connect("https://www.irtelecom.az/az/phones-and-tablets/mobile-phones/samsung/").get();
//        String title = document.title();
//        System.out.println("title:" + title);
//
//        Elements links = document.select("a[href]");
//
//        for (Element link : links) {
//
//            System.out.println("\nlink:" + link.attr("href"));
//            System.out.println(link.getElementsByClass("products_grid"));
//            System.out.println("text:" + link.text());
//        }
//
//        System.out.println("Getting image all..");
//
//        Elements image = document.getElementsByTag("img");
//        for (Element src : image) {
//            System.out.println("src:" + src.attr("abs:src"));
//            System.out.println("src:" + image.attr("src"));
//            System.out.println("height:" + image.attr("height"));
//            System.out.println("width" + image.attr("width"));
//            System.out.println("alt" + image.attr("alt"));
//
//        }
////        try {
////            Document document = Jsoup.connect("http://www/irtelecom.az").get();
////            Elements phones = document.select("");
////            Elements phone = phones.select("p_list_column ");
////            System.out.println("param_list");
////            for (Element element : phone) {
////                PhoneAndTablet phoneAndTablet = new PhoneAndTablet();
////                phoneAndTablet.setName(element.getElementsByClass("product_block").text());
////                String tempText = element.select("img").first().toString();
////                tempText = tempText.replace("", "");
////                tempText = tempText.substring(0, tempText.indexOf("\""));
////                phoneAndTablet.setName(tempText);
////                phoneAndTablet.setCurrency(element.baseUri());
////                phoneAndTabletList.add(phoneAndTablet);
////
////                int scanner = 0;
////                System.out.println("------PhoneAndTablet " + scanner + " --------------");
////                System.out.println("Name : " + phoneAndTablet.getName());
////                System.out.println("Currency : " + phoneAndTablet.getCurrency());
////                System.out.println("Image :" + phoneAndTablet.getImage());
////                System.out.println("Url :" + phoneAndTablet.getUrl());
////                System.out.println("Price :" + phoneAndTablet.getPrice());
////                System.out.println("-------------------------------------");
////            }
////
////        } catch (HttpStatusException ex) {
////        }
////        for (PhoneAndTablet phoneAndTablet : phoneAndTabletList) {
////
////        }
//
//    }
//}
