package com.jmcasuga.app.fashionBoardBackend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jmcasuga.app.fashionBoardBackend.Models.Account;
import com.jmcasuga.app.fashionBoardBackend.Repo.AccountRepo;

@SpringBootTest
@AutoConfigureMockMvc
public class FashionBoardApplicationTests {

	private final String userEmail = "test@gmail.com";
	private final String userFirstName = "Joshua";
	private final String userLastName = "Casuga";

	@Autowired
	private AccountRepo accountRepo;

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

		Account savedUserInfo = accountRepo.save(user1);
	}

	@Test
	void contextLoads() {
	}

	void cleanUpDatabase() {
		accountRepo.deleteAll();
		jdbcTemplate.execute("ALTER TABLE user AUTO_INCREMENT = 1");
	}
}
