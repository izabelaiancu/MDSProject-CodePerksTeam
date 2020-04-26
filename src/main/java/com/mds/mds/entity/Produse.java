package com.mds.mds.entity;

import javax.persistence.*;


@Entity(name = "Produse")
@Table(name = Produse.TABLE_NAME)
public class Produse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nume;
    private double pret;
    public static final String TABLE_NAME= "produse";

    public Produse() {
    }

    public Produse(int id, String nume, double pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;

    }

    public Produse( String nume, double pret) {
        this.nume = nume;
        this.pret = pret;

    }
    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
}
