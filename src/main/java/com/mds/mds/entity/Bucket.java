package com.mds.mds.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = Bucket.TABLE_NAME)
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    @OneToOne
    private User bucketOwner;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Post> posts = new ArrayList<>();
    private String deliveryAddress;
    private Double totalPrice;

    public static final String TABLE_NAME = "Bucket";

    public Bucket() {
    }

    public Bucket(int id, User bucketOwner, List<Post> posts, String deliveryAddress, Double totalPrice) {
        this.id = id;
        this.bucketOwner = bucketOwner;
        this.posts = posts;
        this.deliveryAddress = deliveryAddress;
        this.totalPrice = totalPrice;
    }

    public Bucket(User bucketOwner, List<Post> posts, String deliveryAddress, Double totalPrice) {
        this.bucketOwner = bucketOwner;
        this.posts = posts;
        this.deliveryAddress = deliveryAddress;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public User getBucketOwner() {
        return bucketOwner;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBucketOwner(User bucketOwner) {
        this.bucketOwner = bucketOwner;
    }

    public void setPosts(List posts) {
        this.posts = posts;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}