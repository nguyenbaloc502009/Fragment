package com.example.myapplication;

public class Shoes {
    private int id;
    private String description;
    private int img;
    private String name;
    private String showText;

    public Shoes(int id, String description, int img, String name, String showText) {


        this.id = id;
        this.description = description;
        this.img = img;
        this.name = name;
        this.showText = showText;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShowText(String showText) {
        this.showText = showText;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getShowText() {
        return showText;
    }
}
