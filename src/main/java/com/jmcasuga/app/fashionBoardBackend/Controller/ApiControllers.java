package com.jmcasuga.app.fashionBoardBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.jmcasuga.app.fashionBoardBackend.Models.Account;
import com.jmcasuga.app.fashionBoardBackend.Repo.AccountRepo;
import com.jmcasuga.app.fashionBoardBackend.Models.Photos;
import com.jmcasuga.app.fashionBoardBackend.Repo.PhotosRepo;

@RestController
public class ApiControllers {
    
    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private PhotosRepo photosRepo;

    @GetMapping("/")
    public String getPage() {
        return "Welcome";
    }

    @GetMapping("/users")
    public List<Account> getUsers() {
        return accountRepo.findAll();
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody Account account){
        accountRepo.save(account);
        return "Saved";
    }

    @PutMapping("/update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody Account account){
        Account updatedUser = accountRepo.findById(id).get();
        updatedUser.setEmail(account.getEmail());
        updatedUser.setFirstName(account.getFirstName());
        updatedUser.setLastName(account.getLastName());
        accountRepo.save(updatedUser);
        return "Updated";
    }

}
