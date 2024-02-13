package com.jdc.cruddemo.service.impl;

import com.jdc.cruddemo.model.Shops;
import com.jdc.cruddemo.repo.ShopsRepo;
import com.jdc.cruddemo.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopsServiceImpl implements ShopsService {
    @Autowired
    private ShopsRepo shopsRepo;

    @Override
    public void save(Shops shops){
        shopsRepo.save(shops);
    }

    public List<Shops> findAll() {
        return shopsRepo.findAll();
    }
}
