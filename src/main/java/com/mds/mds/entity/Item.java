package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Item.TABLE_NAME, schema = Item.SCHEMA)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idtem")
    private int iditem;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name="description")
    private String description;


//    @OneToMany(
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    @JoinColumn(name = "itemid")
//    private List<ItemPicture> pictures = new ArrayList<>(); //ids
//    @OneToMany(
//            cascade = CascadeType.ALL,
//            orphanRemoval = true
//    )
//    @JoinColumn(name = "itemid")
//    private List<ItemTag> tags = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idpost", referencedColumnName = "idpost")
    private Post idpost;

    public static final String TABLE_NAME= "Item";
    public static final String SCHEMA="greendress";

    public Item() {
    }

    public Item(int iditem, String name, double price, String description, Post idpost/*, List<ItemPicture> pictures, List<ItemTag> tags*/) {
        this.iditem = iditem;
        this.name = name;
        this.price = price;
        this.description = description;
        this.idpost=idpost;
//        this.pictures = pictures;
//        this.tags = tags;
    }

    public Item(String name, double pret, String description, Post idpost/*, List<ItemPicture> pictures, List<ItemTag> tags*/) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.idpost=idpost;
        //this.pictures = pictures;
        //this.tags = tags;
    }

    public int getId() {
        return iditem;
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

    public Post getIdpost() {
        return idpost;
    }

    //    public List<ItemPicture> getPictures() {
//        return pictures;
//    }
//
//    public List<ItemTag> getTags() {
//        return tags;
//    }

    public void setId(int iditem) {
        this.iditem = iditem;
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

    public void setIdpost(Post idpost) {
        this.idpost = idpost;
    }

    //    public void setPictures(List<ItemPicture> pictures) {
//        this.pictures = pictures;
//    }
//
//    public void setTags(List<ItemTag> tags) {
//        this.tags = tags;
//    }
}
