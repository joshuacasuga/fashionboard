package com.jmcasuga.app.fashionBoardBackend.Models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name = "photos")
public class Photos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long photoID;

    @Column(name="upload_date")
    private Date uploadDate;

    @Column(name="image_size")
    private double imageSize;

    @Column(name="category")
    private String category;

    @Column(name="type")
    private String type;

    @Column(name="brand")
    private String brand;

    @Column(name="image_path")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "accountID")
    @JsonBackReference
    private Account account;

    public long getPhotoID(){
        return photoID;
    }

    public Date getUploadDate(){
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate){
        this.uploadDate = uploadDate;
    }

    public double getImageSize() {
        return imageSize;
    }

    public void setImageSize(double imageSize){
        this.imageSize = imageSize;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getImagePath(){
        return imagePath;
    }

    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }
}
