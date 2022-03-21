package com.example.phandinhphuong_19505081;

public class Products {
    private int image;
    private String name;
    private String cast1;
    private String cast2;

    public Products(int image, String name, String cast1, String cast2) {
        this.image = image;
        this.name = name;
        this.cast1 = cast1;
        this.cast2 = cast2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCast1() {
        return cast1;
    }

    public void setCast1(String cast1) {
        this.cast1 = cast1;
    }

    public String getCast2() {
        return cast2;
    }

    public void setCast2(String cast2) {
        this.cast2 = cast2;
    }
}
