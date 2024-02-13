package com.jdc.cruddemo.service.impl;

import com.jdc.cruddemo.model.Users;
import com.jdc.cruddemo.repo.UsersRepo;
import com.jdc.cruddemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepo usersRepo;

    @Override
    public void save(Users users) {
        usersRepo.save(users);
    }

    @Override
    public List<Users> findAll() {
        return usersRepo.findAll();
    }
}
