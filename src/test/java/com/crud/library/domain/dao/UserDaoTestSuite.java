package com.crud.library.domain.dao;

import com.crud.library.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int id = user.getId();

        //When
        List<User> resultList = userDao.findByName("Damian");

        //Then
        assertEquals(1, resultList.size());
    }
}
