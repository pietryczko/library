package com.crud.library.domain.dao;

import com.crud.library.domain.user.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserDaoTestSuite {

    @Autowired
    private UserDao userDao;

    @Test
    void testFindBy() {
        //Given
        User user = new User("Damian", "Pietryczko");
        userDao.save(user);

        //When
        int id = user.getId();

        //Then
        Optional<User> readUser = userDao.findById(id);
        assertTrue(readUser.isPresent());

        //CleanUp
        userDao.deleteById(id);
    }
}
