package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Post.TABLE_NAME)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private User postOwner;
    private Item[] items;
    private String date; //has to be converted to date in MYSQL
    private Boolean isAvailable;

    public static final String TABLE_NAME = "Post";

    public Post() {
    }

    public Post(int id, User postOwner, Item[] items, String date, Boolean isAvailable) {
        this.id = id;
        this.postOwner=postOwner;
        this.items = items;
        this.date = date;
        this.isAvailable = isAvailable;
    }

    public Post(User postOwner, Item[] items, String date, Boolean isAvailable) {
        this.postOwner=postOwner;
        this.items = items;
        this.date = date;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public User getPostOwner() {
        return postOwner;
    }

    public Item[] getItems() {
        return items;
    }

    public String getDate() {
        return date;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPostOwner(User postOwner) {
        this.postOwner = postOwner;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}