package com.crud.library.domain.user;

import com.crud.library.domain.Rent;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
public class UserDto {
    private int id;
    private String firstName;
    private String lastName;
    private Date dateCreated;
    private List<Rent> rents;
}
