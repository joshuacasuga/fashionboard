package com.jmcasuga.app.fashionBoardBackend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import com.jmcasuga.app.fashionBoardBackend.Models.Photos;

public interface PhotosRepo extends JpaRepository<Photos, Long>{
    /*
     * SQL query to find photos by account ID
     * @param accountId: account ID of the photos to be found
     * @return list of photos uploaded by given account ID
     */
    @Query(value = "SELECT * FROM photos WHERE accountid = ?1")
    List<Photos> findByAccountID(Long accountID);
}
