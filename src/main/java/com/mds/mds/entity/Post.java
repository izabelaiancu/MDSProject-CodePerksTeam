package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Post.TABLE_NAME,schema = Post.SCHEMA)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idpost")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_owner", referencedColumnName = "iduser")
    private User postOwner;

    @Column(name="date")
    private String date; //has to be converted to date in MYSQL
    @Column(name="is_available")
    private Boolean isAvailable;

    public static final String TABLE_NAME = "Post";
    public static final String SCHEMA="greendress";

    public Post() {
    }

    public Post(int id, User postOwner, String date, Boolean isAvailable) {
        this.id = id;
        this.postOwner=postOwner;
        this.date = date;
        this.isAvailable = isAvailable;
    }

    public Post(User postOwner, String date, Boolean isAvailable) {
        this.postOwner=postOwner;
        this.date = date;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public User getPostOwner() {
        return postOwner;
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }
}