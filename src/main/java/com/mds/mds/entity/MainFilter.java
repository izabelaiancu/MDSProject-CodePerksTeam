package com.mds.mds.entity;

import com.mds.mds.Filters.*;

import javax.persistence.*;

@Entity
@Table(name = MainFilter.TABLE_NAME)
public class MainFilter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String county;
    private Price price;
    private Brand[] brands;
    private Category[] categories;
    private Gender[] genders;
    private Style[] styles;
    private Age[] ages;

    public static final String TABLE_NAME= "MainFilter";

    public MainFilter() {
    }

    public MainFilter(int id, String county, Price price, Brand[] brands, Category[] categories, Gender[] genders, Style[] styles, Age[] ages) {
        this.id = id;
        this.county = county;
        this.price = price;
        this.brands = brands;
        this.categories = categories;
        this.genders = genders;
        this.styles = styles;
        this.ages = ages;
    }

    public MainFilter(String county, Price price, Brand[] brands, Category[] categories, Gender[] genders, Style[] styles, Age[] ages) {
        this.county = county;
        this.price = price;
        this.brands = brands;
        this.categories = categories;
        this.genders = genders;
        this.styles = styles;
        this.ages = ages;
    }

    public int getId() {
        return id;
    }

    public String getCounty() {
        return county;
    }

    public Price getPrice() {
        return price;
    }

    public Brand[] getBrands() {
        return brands;
    }

    public Category[] getCategories() {
        return categories;
    }

    public Gender[] getGenders() {
        return genders;
    }

    public Style[] getStyles() {
        return styles;
    }

    public Age[] getAges() {
        return ages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void setBrands(Brand[] brands) {
        this.brands = brands;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public void setGenders(Gender[] genders) {
        this.genders = genders;
    }

    public void setStyles(Style[] styles) {
        this.styles = styles;
    }

    public void setAges(Age[] ages) {
        this.ages = ages;
    }
}

