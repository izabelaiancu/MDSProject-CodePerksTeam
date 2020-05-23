//package com.mds.mds.entity;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = BucketPost.TABLE_NAME)
//public class BucketPost {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//
//    private int id;
//
//    @OneToOne
//    @JoinColumn(name = "bucket_id", nullable = false)
//    private Bucket bucket;
//
//    @OneToOne
//    @JoinColumn(name = "post_id", nullable = false)
//    private Post post;
//
//    public static final String TABLE_NAME = "bucket_posts";
//
//    public BucketPost(int id, Bucket bucket, Post post) {
//        this.id = id;
//        this.bucket = bucket;
//        this.post = post;
//    }
//
//    public BucketPost(Bucket bucket, Post post) {
//        this.bucket = bucket;
//        this.post = post;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public Bucket getBucket() {
//        return bucket;
//    }
//
//    public Post getPost() {
//        return post;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setBucket(Bucket bucket) {
//        this.bucket = bucket;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }
//}
