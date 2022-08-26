package com.example.org.springboot.crudlaptop.service;

import com.example.org.springboot.crudlaptop.dao.LaptopDAO;
import com.example.org.springboot.crudlaptop.entity.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopDAO laptopDAO;

    @Override
    @Transactional
    public List<Laptop> findAll() {
        return laptopDAO.findAll();
    }

    @Override
    @Transactional
    public Laptop findById(int id) {
        return laptopDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Laptop laptop) {
        laptopDAO.save(laptop);
    }

    @Override
    @Transactional
    public void delete(int id) {
        laptopDAO.delete(id);
    }
}
