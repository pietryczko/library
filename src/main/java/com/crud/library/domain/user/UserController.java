package com.crud.library.domain.user;

import com.crud.library.domain.user.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @GetMapping
    public List<UserDto> getUsers() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{userId}")
    public UserDto getUser(@PathVariable int userId) {
        return new UserDto(1, "test name", "test last_name", new Date(), null);
    }

    @DeleteMapping
    public void deleteUser(int userId) {

    }

    @PutMapping
    public UserDto updateUser() {
        return new UserDto(1, "test name", "test last_name", new Date(), null);
    }

    @PostMapping
    public void createUser(UserDto userDto) {

    }
}
