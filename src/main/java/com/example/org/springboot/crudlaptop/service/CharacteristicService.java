package com.example.org.springboot.crudlaptop.service;

import com.example.org.springboot.crudlaptop.entity.Characteristic;

import java.util.List;

public interface CharacteristicService {
    List<Characteristic> findAll();

    Characteristic findById(int characteristicId);

    void save(Characteristic characteristic);

    void delete(int characteristicId);
}
