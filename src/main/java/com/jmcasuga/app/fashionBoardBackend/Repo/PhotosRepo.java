package com.jmcasuga.app.fashionBoardBackend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jmcasuga.app.fashionBoardBackend.Models.Photos;

public interface PhotosRepo extends JpaRepository<Photos, Long>{
    
}
