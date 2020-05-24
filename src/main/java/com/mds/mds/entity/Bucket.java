package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Bucket.TABLE_NAME, schema = Bucket.SCHEMA)
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idbucket")
    private int idbucket;
    //@OneToOne(mappedBy="iduser", orphanRemoval=true, cascade=CascadeType.PERSIST)
    //@JoinColumn(name = "iduser", nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bucket_owner", referencedColumnName = "iduser")
    private User bucket_owner;


//    @OneToMany(
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    @JoinColumn(name = "idpost")
//    private List<Post> posts = new ArrayList<>();

    @Column(name="delivery_address")
    private String delivery_address;
    @Column(name="total_price")
    private Double total_price;


    public static final String TABLE_NAME = "Bucket";
    public static final String SCHEMA="greendress";

    public Bucket() {
    }

    public Bucket(int idbucket, User bucket_owner, String delivery_address, Double totalPrice) {
        this.idbucket = idbucket;
        this.bucket_owner = bucket_owner;
        this.delivery_address = delivery_address;
        this.total_price = total_price;
    }

    public Bucket(User bucket_owner, String delivery_address, Double totalPrice) {
        this.bucket_owner = bucket_owner;
        this.delivery_address = delivery_address;
        this.total_price = total_price;
    }

    public int getId() {
        return idbucket;
    }

    public User getBucketOwner() {
        return bucket_owner;
    }

    public String getDeliveryAddress() {
        return delivery_address;
    }

    public Double getTotalPrice() {
        return total_price;
    }

    public void setId(int idbucket) {
        this.idbucket = idbucket;
    }

    public void setBucketOwner(User bucket_owner) {
        this.bucket_owner = bucket_owner;
    }

    public void setDeliveryAddress(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public void setTotalPrice(Double total_price) {
        this.total_price = total_price;
    }
}