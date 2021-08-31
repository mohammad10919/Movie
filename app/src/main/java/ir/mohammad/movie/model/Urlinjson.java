package ir.mohammad.movie.model;

import java.util.List;

import ir.mohammad.movie.Webimagemodel;

public class Urlinjson {
    private String title;
    private  String description ;
    private int price ;
    private String date;
    private String city ;
    private List<Webimagemodel> web_image;
    private String thumbnail;
    private int latitude;
    private int longitude;

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Webimagemodel> getWeb_image() {
        return web_image;
    }

    public void setWeb_image(List<Webimagemodel> web_image) {
        this.web_image = web_image;
    }
}
