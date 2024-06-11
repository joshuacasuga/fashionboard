package com.jmcasuga.app.fashionBoardBackend.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

/*
@Entity
@Table(name="outfits")
public class Outfit {
    
    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long outfitID;

    // FK
    @ManyToOne
    @JoinColumn(name = "accountID")
    @JsonBackReference
    private Account account;

    @Column(name="headwear")
    private Photos headwear;

    @Column(name="top")
    private Photos top;

    @Column(name="bottoms")
    private Photos bottoms;

    @Column(name="shoes")
    private Photos shoes;

    public long getOutfitID() {
        return outfitID;
    }

    public Photos getHeadwear(){
        return headwear;
    }

    public void setHeadwear(Photos headwear){
        this.headwear = headwear;
    }

    public Photos getTop(){
        return top;
    }

    public void setTop(Photos top){
        this.top = top;
    }

    public Photos getBottoms(){
        return bottoms;
    }

    public void setBottoms(Photos bottoms){
        this.bottoms = bottoms;
    }

    public Photos getShoes(){
        return shoes;
    }

    public void setShoes(Photos shoes){
        this.shoes = shoes;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public long getAccountId(){
        return account.getID();
    }
}
*/