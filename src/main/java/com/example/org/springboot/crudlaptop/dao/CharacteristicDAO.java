package com.example.org.springboot.crudlaptop.dao;

import com.example.org.springboot.crudlaptop.entity.Characteristic;

import java.util.List;

public interface CharacteristicDAO {
    List<Characteristic> findAll();

    Characteristic findById(int id);

    void save(Characteristic characteristic);

    void delete(int id);
}
