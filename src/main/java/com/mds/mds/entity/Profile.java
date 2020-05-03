package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = Profile.TABLE_NAME)
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //user,profile pic, descriere, adresa, tags[] following[], followers[], anunturi[]
    private int id;
    private User profileOwner;
    private int profilePic;
    private String description;
    private String address;
    private String[] tags;
    private User[] following;
    private User[] followers;
    private Post[] posts;

    public static final String TABLE_NAME = "Profile";

    public Profile() {
    }

    public Profile(int id, User profileOwner, int profilePic, String description, String address, String[] tags, User[] following, User[] followers) {
        this.id = id;
        this.profileOwner = profileOwner;
        this.profilePic = profilePic;
        this.description = description;
        this.address = address;
        this.tags = tags;
        this.following = following;
        this.followers = followers;
    }

    public Profile(User profileOwner, int profilePic, String description, String address, String[] tags, User[] following, User[] followers, Post[] posts) {
        this.profileOwner = profileOwner;
        this.profilePic = profilePic;
        this.description = description;
        this.address = address;
        this.tags = tags;
        this.following = following;
        this.followers = followers;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public User getProfileOwner() {
        return profileOwner;
    }

    public int getProfilePic() {
        return profilePic;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String[] getTags() {
        return tags;
    }

    public User[] getFollowing() {
        return following;
    }

    public User[] getFollowers() {
        return followers;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProfileOwner(User profileOwner) {
        this.profileOwner = profileOwner;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setFollowing(User[] following) {
        this.following = following;
    }

    public void setFollowers(User[] followers) {
        this.followers = followers;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    //cand initializam o postare noua la nivel de profil, vom initializa automat postOwner cu this
}
