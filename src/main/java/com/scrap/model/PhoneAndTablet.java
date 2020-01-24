package com.scrap.model;

public class PhoneAndTablet {

    private String name;
    private String url;
    private String price;
    private String currency;
    private String image;
    private String data;


    public PhoneAndTablet(String name, String url, String price, String currency, String image, String data) {
        this.name = name;
        this.url = url;
        this.price = price;
        this.currency = currency;
        this.image = image;
        this.data = data;
    }

    public PhoneAndTablet() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
