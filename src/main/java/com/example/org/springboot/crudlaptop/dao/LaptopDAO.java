package com.example.org.springboot.crudlaptop.dao;

import com.example.org.springboot.crudlaptop.entity.Laptop;

import java.util.List;

public interface LaptopDAO {
    List<Laptop> findAll();

    Laptop findById(int id);

    void save(Laptop laptop);

    void delete(int id);
}
