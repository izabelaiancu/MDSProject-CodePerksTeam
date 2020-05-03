package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String username;
    private String password;
    private Long phoneNumber;

    public static final String TABLE_NAME= "User";

    public User() {
    }

    public User(int id, String lastName, String firstName, String email, String username, String password, Long phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.username=username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User(String lastName, String firstName, String email, String username, String password, Long phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.username=username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
