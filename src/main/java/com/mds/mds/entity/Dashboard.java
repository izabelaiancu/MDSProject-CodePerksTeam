package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Dashboard.TABLE_NAME)
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private User dashboardOwner;
    private Post[] posts;
    private MainFilter mainFilter;
    private String tags[];

    public static final String TABLE_NAME = "Dashboard";

    public Dashboard() {
    }

    public Dashboard(int id, User dashboardOwner, Post[] posts, MainFilter mainFilter, String[] tags) {
        this.id = id;
        this.dashboardOwner = dashboardOwner;
        this.posts = posts;
        this.mainFilter = mainFilter;
        this.tags = tags;
    }

    public Dashboard(User dashboardOwner, Post[] posts, MainFilter mainFilter, String[] tags) {
        this.dashboardOwner = dashboardOwner;
        this.posts = posts;
        this.mainFilter = mainFilter;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public User getDashboardOwner() {
        return dashboardOwner;
    }

    public Post[] getPosts() {
        return posts;
    }

    public MainFilter getMainFilter() {
        return mainFilter;
    }

    public String[] getTags() {
        return tags;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDashboardOwner(User dashboardOwner) {
        this.dashboardOwner = dashboardOwner;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public void setMainFilter(MainFilter mainFilter) {
        this.mainFilter = mainFilter;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}