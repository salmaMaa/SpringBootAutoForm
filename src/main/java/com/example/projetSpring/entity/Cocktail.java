package com.example.projetSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "cocktail")
public class Cocktail implements Serializable {

    //Properties
    @Id
    @Column(name = "numco")
    private int numco;
    @Column
    private String nomco;
    @Column
    private String datecreationco;
    @Column
    private String explicationco;

    @Column
    private String image;

    @ManyToOne
    @JoinColumn(name = "codecat")
    private Categorie uneCat;

    @OneToMany(mappedBy = "primaryKey.cocktail",
            cascade = CascadeType.ALL)
    private List<Necessiter> necessiterList;

    //constructeur
    public Cocktail() {
    }

    public Cocktail(int numco, String nomco, String datecreationco, String explicationco, String image, Categorie uneCat) {
        this.numco = numco;
        this.nomco = nomco;
        this.datecreationco = datecreationco;
        this.explicationco = explicationco;
        this.image = image;
        this.uneCat = uneCat;
    }

    public Cocktail(int numco, String nomco, String datecreationco, String explicationco, Categorie uneCat) {
        this.numco = numco;
        this.nomco = nomco;
        this.datecreationco = datecreationco;
        this.explicationco = explicationco;
        this.uneCat = uneCat;
    }

    //getter et setter

    public int getNumco() {
        return numco;
    }

    public void setNumco(int numco) {
        this.numco = numco;
    }

    public String getNomco() {
        return nomco;
    }

    public void setNomco(String nomco) {
        this.nomco = nomco;
    }

    public String getDatecreationco() {
        return datecreationco;
    }

    public void setDatecreationco(String datecreationco) {
        this.datecreationco = datecreationco;
    }

    public String getExplicationco() {
        return explicationco;
    }

    public void setExplicationco(String explicationco) {
        this.explicationco = explicationco;
    }

    public Categorie getUneCat() {
        return uneCat;
    }

    public void setUneCat(Categorie uneCat) {
        this.uneCat = uneCat;
    }

    @JsonIgnore
    public List<Necessiter> getNecessiterList() {
        return necessiterList;
    }

    public void setNecessiterList(List<Necessiter> necessiterList) {
        this.necessiterList = necessiterList;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    //méthodes

}
