package org.Registration;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class userRepositoryTests {
	
	@Autowired
	private userRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void textCreateUser() {
		user user = new user();
		user.setEmail("zidi.wahranip@tnaket.ma");
		user.setPassword("zid45.2020");
		user.setFullname("Zidann1 B3abe3");
		
		user saveduser = repo.save(user);
		
		user existUser = entityManager.find(user.class, saveduser.getId());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
	}
}
