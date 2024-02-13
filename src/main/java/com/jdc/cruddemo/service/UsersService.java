package com.jdc.cruddemo.service;

import com.jdc.cruddemo.model.Users;

import java.util.List;

public interface UsersService {
    void save(Users users);

    List<Users> findAll();

}
