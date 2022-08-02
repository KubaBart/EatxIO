package com.example.eatx;

import com.example.eatx.user.User;
import com.example.eatx.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository myRepo;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void testCreateUser()
    {
        User user = new User();
        user.setEmail("kubaaa@o2.pl");
        user.setPassword("123");
        user.setFirstName("Kuba");
        user.setNumber("880221222");
        user.setLastName("Bartus");
        User savedUser = myRepo.save(user);
        User existUser = entityManager.find(User.class,savedUser.getId());
        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }

}
