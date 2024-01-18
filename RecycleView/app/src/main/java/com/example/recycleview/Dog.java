package com.example.recycleview;

public class Dog {
    private String name;
    private int imageId;

    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Dog(String name, int imageId, String price) {
        this.name = name;
        this.imageId = imageId;
        this.price = price;
    }
}
