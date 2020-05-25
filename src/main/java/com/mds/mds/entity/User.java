package com.mds.mds.entity;

import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME, schema=User.SCHEMA)
public class User {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="iduser")
    private int iduser;
    @Column(name="lastName")
    private String lastName;
    @Column(name="firstName")
    private String firstName;
    @Column(name="email")
    private String email;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="phoneNumber")
    private Long phoneNumber;
    @Column(name="address")
    private String address;

    public static final String TABLE_NAME= "user";
    public static final String SCHEMA="greendress";

    public User() {
    }

    public User(int iduser, String lastName, String firstName, String email, String username, String password, Long phoneNumber, String address) {
        this.iduser = iduser;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.username=username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address=address;
    }

    public User(String lastName, String firstName, String email, String username, String password, Long phoneNumber, String address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.username=username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address=address;
    }

    public int getId() {
        return iduser;
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

    public String getAddress() {
        return address;
    }

    public void setId(int iduser) {
        this.iduser = iduser;
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

    public void setAddress(String address) {
        this.address = address;
    }
}
