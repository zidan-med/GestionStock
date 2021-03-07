package org.Registration;

import static org.assertj.core.api.Assertions.assertThat;

import org.Mus.Repository.UserRepository;
import org.Mus.entities.User;
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
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void textCreateUser() {
		User user = new User();
		user.setEmail("zidi.wahranip@tnaket.ma");
		user.setPassword("zid45.2020");
		user.setFullname("Zidann1 B3abe3");
		
		User saveduser = repo.save(user);
		
		User existUser = entityManager.find(User.class, saveduser.getId());
		
		assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
	}
}
