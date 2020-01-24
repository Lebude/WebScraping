package com.scrap.jsoup;
import com.scrap.model.PhoneAndTablet;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class JsoupEx {
    public static void main(String[] args) throws IOException {

//        Map<String, String> phones;
//        List<PhoneAndTablet> phoneAndTabletList = new ArrayList<>();

        Document document1 = Jsoup.connect("http://www.irtelecom.az").get();
//        String keywords = document1.select("meta[name=keywords]").first().attr("content");
//        System.out.println("Meta keyword:" + keywords);
//        String description = document1.select("meta[name=description]").get(0).attr("content");
//        System.out.println("Meta description : " + description);
//
//        Document document3=Jsoup.connect("http://www.irtelecom.az").get();
//        String title1=document3.title();
//        System.out.println("title:" + title1);
//
//        Document document4 = Jsoup.connect("https://www.irtelecom.az/az/phones-and-tablets/mobile-phones/samsung/").get();
//        String title = document4.title();
////        System.out.println("title:" + title);
//
//        Document document= Jsoup.connect("https://irtelecom.az/az/phones-and-tablets/mobile-phones/").get();
//        Elements elements=document.select("p_list_column");
//
//
//        Elements links = document.select("a[href]");
//        for (Element link : links) {
//            System.out.println("\nlink:" + link.attr("href"));
//            System.out.println(link.getElementsByClass("products_grid"));
//            System.out.println("text:" + link.text());
//        }


//        for (Element element:elements.select("pr_self")){
//            String img_url=element.select("full_link ").attr("src");
////            System.out.println(img_url);
////            String title=element.select("pro_desc").text();
////            System.out.println(title);
//        }
        try {
            Document document2 = Jsoup.connect("https://irtelecom.az/az/products/samsung-galaxy-j2-core-2018-8-gb-gold/").get();
            Elements phone = document2.getElementsByClass("main_wrapper");
            for (Element element : phone) {
                PhoneAndTablet phoneAndTablet = new PhoneAndTablet();
                phoneAndTablet.setName(element.getElementsByClass("product_block").get(0).getElementsByClass("product_main").get(0).getElementsByClass("info_checker").text());
                phoneAndTablet.setUrl(element.getElementsByClass("product_block").get(0).text());
                phoneAndTablet.setPrice(element.getElementsByClass("buy_block").get(0).getElementsByClass("l_side").get(0).getElementsByClass("price").text());
                phoneAndTablet.setData(element.getElementsByClass("product_info").get(0).getElementsByClass("info_checker").text());
                phoneAndTablet.setImage("product_gallery");


                System.out.println("Name : " + phoneAndTablet.getName());
                System.out.println("Image :" + phoneAndTablet.getImage());
                System.out.println("Url :" + phoneAndTablet.getUrl());
                System.out.println("Price :" + phoneAndTablet.getPrice());
                System.out.println("Data :" + phoneAndTablet.getData());
                System.out.println("-------------------------------------");
            }
        } catch (HttpStatusException ex){
        }
    }
}
