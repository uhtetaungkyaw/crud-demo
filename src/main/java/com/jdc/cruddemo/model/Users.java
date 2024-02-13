package com.jdc.cruddemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Users {

    @Id
    private int id;
    private String name;
    private String address;

}
