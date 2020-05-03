package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Item.TABLE_NAME)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;
    private String description;
    private int[] pictures; //ids
    private String[] tags;

    public static final String TABLE_NAME= "Item";

    public Item() {
    }

    public Item(int id, String name, double price, String description, int[] pictures, String[] tags) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.pictures = pictures;
        this.tags = tags;
    }

    public Item(String name, double pret, String description, int[] pictures, String[] tags) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.pictures = pictures;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int[] getPictures() {
        return pictures;
    }

    public String[] getTags() {
        return tags;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPictures(int[] pictures) {
        this.pictures = pictures;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
