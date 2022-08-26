package com.example.org.springboot.crudlaptop.service;

import com.example.org.springboot.crudlaptop.dao.CharacteristicDAO;
import com.example.org.springboot.crudlaptop.entity.Characteristic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CharacteristicServiceImpl implements CharacteristicService {

    @Autowired
    private CharacteristicDAO characteristicDAO;

    @Override
    @Transactional
    public List<Characteristic> findAll() {
        return characteristicDAO.findAll();
    }

    @Override
    @Transactional
    public Characteristic findById(int id) {
        return characteristicDAO.findById(id);
    }

    @Override
    @Transactional
    public void save(Characteristic characteristic) {
        characteristicDAO.save(characteristic);
    }

    @Override
    @Transactional
    public void delete(int id) {
        characteristicDAO.delete(id);
    }
}
