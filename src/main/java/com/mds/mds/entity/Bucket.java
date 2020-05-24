package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Bucket.TABLE_NAME, schema = Bucket.SCHEMA)
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idbucket")
    private int id;
    //@OneToOne(mappedBy="iduser", orphanRemoval=true, cascade=CascadeType.PERSIST)
    //@JoinColumn(name = "iduser", nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bucket_owner", referencedColumnName = "iduser")
    private User bucketOwner;


//    @OneToMany(
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    @JoinColumn(name = "idpost")
//    private List<Post> posts = new ArrayList<>();

    @Column(name="delivery_address")
    private String deliveryAddress;
    @Column(name="total_price")
    private Double totalPrice;


    public static final String TABLE_NAME = "Bucket";
    public static final String SCHEMA="greendress";

    public Bucket() {
    }

    public Bucket(int id, User bucketOwner, String deliveryAddress, Double totalPrice) {
        this.id = id;
        this.bucketOwner = bucketOwner;
        this.deliveryAddress = deliveryAddress;
        this.totalPrice = totalPrice;
    }

    public Bucket(User bucketOwner, String deliveryAddress, Double totalPrice) {
        this.bucketOwner = bucketOwner;
        this.deliveryAddress = deliveryAddress;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public User getBucketOwner() {
        return bucketOwner;
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

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}