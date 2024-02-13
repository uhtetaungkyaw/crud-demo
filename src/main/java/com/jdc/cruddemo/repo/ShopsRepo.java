package com.jdc.cruddemo.repo;

import com.jdc.cruddemo.model.Shops;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopsRepo extends JpaRepository<Shops, Integer> {

}
