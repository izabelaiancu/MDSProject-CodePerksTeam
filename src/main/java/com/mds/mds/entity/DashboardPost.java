package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = DashboardPost.TABLE_NAME, schema = DashboardPost.SCHEMA)
public class DashboardPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="iddashboard_posts")
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dashboard_owner", referencedColumnName = "iduser")
    private User dashboardOwner;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id", referencedColumnName = "idpost")
    private Post post;
//    @OneToOne
//    @JoinColumn(name = "filterid", nullable = false)
//    private MainFilter mainFilter; //filters applied

    public static final String TABLE_NAME = "dashboard_posts";
    public static final String SCHEMA="greendress";

    public DashboardPost() {
    }

    public DashboardPost(int id, User dashboardOwner, Post post/*, MainFilter mainFilter*/) {
        this.id = id;
        this.dashboardOwner = dashboardOwner;
        this.post = post;
        //this.mainFilter = mainFilter;
    }

    public DashboardPost(User dashboardOwner, Post post/*, MainFilter mainFilter*/) {
        this.dashboardOwner = dashboardOwner;
        this.post = post;
        //this.mainFilter = mainFilter;
    }

    public int getId() {
        return id;
    }

    public User getDashboardOwner() {
        return dashboardOwner;
    }

    public Post getPosts() {
        return post;
    }

//    public MainFilter getMainFilter() {
//        return mainFilter;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDashboardOwner(User dashboardOwner) {
        this.dashboardOwner = dashboardOwner;
    }

    public void setPosts(Post post) {
        this.post = post;
    }

//    public void setMainFilter(MainFilter mainFilter) {
//        this.mainFilter = mainFilter;
//    }
}