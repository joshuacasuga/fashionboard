package com.jmcasuga.app.fashionBoardBackend;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jmcasuga.app.fashionBoardBackend.Models.Account;
//import com.jmcasuga.app.fashionBoardBackend.Models.Outfit;
import com.jmcasuga.app.fashionBoardBackend.Models.Photos;
import com.jmcasuga.app.fashionBoardBackend.Repo.AccountRepo;
//import com.jmcasuga.app.fashionBoardBackend.Repo.OutfitRepo;
import com.jmcasuga.app.fashionBoardBackend.Repo.PhotosRepo;

@SpringBootTest
@AutoConfigureMockMvc
public class FashionBoardApplicationTests {

	// Mock data for account
	private final String userEmail = "test@gmail.com";
	private final String userFirstName = "Joshua";
	private final String userLastName = "Casuga";
	private final String phoneNum = "(123)-456-7890";

	// Mock data for photos
	private final String uploadDate = "6/10";
	private final double imageSize = 3.00;
	private final String category = "Top";
	private final String type = "Jacket";
	private final String brand = "Nike";
	private final String imagePath = "./src/main/resources/static/image.jpg";

	// Mock data for outfits
	

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private PhotosRepo photosRepo;

	//@Autowired
	//private OutfitRepo outfitRepo;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private MockHttpSession session;

	@BeforeEach
	void setUp() {
		cleanUpDatabase();
		Account user1 = new Account();
		user1.setEmail(userEmail);
		user1.setFirstName(userFirstName);
		user1.setLastName(userLastName);
		user1.setPhoneNum(phoneNum);

		Account user1AccountInfo = accountRepo.save(user1);

		Account user2 = new Account();
		user2.setEmail(userEmail);
		user2.setFirstName(userFirstName);
		user2.setLastName(userLastName);
		user2.setPhoneNum(phoneNum);

		Account user2AccountInfo = accountRepo.save(user2);

		Photos image1 = new Photos();
		image1.setUploadDate(uploadDate);
		image1.setImageSize(imageSize);
		image1.setCategory(category);
		image1.setType(type);
		image1.setBrand(brand);
		image1.setImagePath(imagePath);
		image1.setAccount(user1AccountInfo);

		photosRepo.save(image1);

		Photos image2 = new Photos();
		image2.setUploadDate(uploadDate);
		image2.setImageSize(imageSize);
		image2.setCategory(category);
		image2.setType(type);
		image2.setBrand(brand);
		image2.setImagePath(imagePath);
		image2.setAccount(user1AccountInfo);

		photosRepo.save(image2);

		Photos image3 = new Photos();
		image3.setUploadDate(uploadDate);
		image3.setImageSize(imageSize);
		image3.setCategory(category);
		image3.setType(type);
		image3.setBrand(brand);
		image3.setImagePath(imagePath);
		image3.setAccount(user2AccountInfo);

		photosRepo.save(image3);

		/* 
		Outfit outfit1 = new Outfit();
		outfit1.setHeadwear(null);
		outfit1.setTop(image1);
		outfit1.setBottoms(image2);
		outfit1.setShoes(image3);
		outfit1.setAccount(user1AccountInfo);

		outfitRepo.save(outfit1);
		*/
	}

	@Test
	void contextLoads() {
	}

	void cleanUpDatabase() {
		accountRepo.deleteAll();
		jdbcTemplate.execute("ALTER TABLE accounts AUTO_INCREMENT = 1");
		jdbcTemplate.execute("ALTER TABLE photos AUTO_INCREMENT = 1");
	}
}
