package com.jdc.cruddemo.service;

import com.jdc.cruddemo.model.Shops;

import java.util.List;

public interface ShopsService {
    void save(Shops shops);

    List<Shops> findAll();
}
