package com.jmcasuga.app.fashionBoardBackend.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

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

    @Column(name = "headwear_photo_id")
    private long headwearID;

    @Column(name = "top_photo_id")
    private long topID;

    @Column(name = "bottoms_photo_id")
    private long bottomsID;

    @Column(name = "shoes_photo_id")
    private long shoesID;

    public void setHeadwearID(Photos headwearPhoto){
        headwearID = headwearPhoto.getPhotoID();
    }

    public long getHeadwearID(){
        return headwearID;
    }

    public void setTopID(Photos topPhoto){
        topID = topPhoto.getPhotoID();
    }

    public long getTopID(){
        return topID;
    }

    public void setBottomsID(Photos bottomsPhoto){
        bottomsID = bottomsPhoto.getPhotoID();
    }

    public long getBottomsID(){
        return bottomsID;
    }

    public void setShoesID(Photos shoesPhoto){
        shoesID = shoesPhoto.getPhotoID();
    }

    public long getShoesID(){
        return shoesID;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public long getAccountId(){
        return account.getID();
    }
}
