package com.example.org.springboot.crudlaptop.dao;

import com.example.org.springboot.crudlaptop.entity.Laptop;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LaptopDAOImpl implements LaptopDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Laptop> findAll() {
        Session session = entityManager.unwrap(Session.class);
        Query<Laptop> query = session.createQuery("from Laptop ", Laptop.class);

        return query.getResultList();
    }

    @Override
    public Laptop findById(int id) {
        Session session = entityManager.unwrap(Session.class);

        return session.get(Laptop.class, id);
    }

    @Override
    public void save(Laptop laptop) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(laptop);
    }

    @Override
    public void delete(int id) {
        Session session = entityManager.unwrap(Session.class);
        Laptop laptop = session.get(Laptop.class, id);
        session.delete(laptop);

    }
}
