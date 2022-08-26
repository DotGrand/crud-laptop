package com.example.org.springboot.crudlaptop.controller;

import com.example.org.springboot.crudlaptop.entity.Laptop;
import com.example.org.springboot.crudlaptop.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/laptops")
    public List<Laptop> findAll() {
        return laptopService.findAll();
    }

    @GetMapping("/laptops/{laptopId}")
    public Laptop findById(@PathVariable int laptopId) {
        Laptop laptop = laptopService.findById(laptopId);

        if (laptop == null) {
            throw new RuntimeException("Laptop id not found - " + laptopId);
        }

        return laptop;
    }

    @PostMapping("/laptops")
    public Laptop save(@RequestBody Laptop laptop) {
        laptop.setId(0);
        laptopService.save(laptop);

        return laptop;
    }

    @PutMapping("/laptops")
    public Laptop update(@RequestBody Laptop laptop) {
        laptopService.save(laptop);

        return laptop;
    }

    @DeleteMapping("/laptops/{laptopId}")
    public String delete(@PathVariable int laptopId) {
        Laptop laptop = laptopService.findById(laptopId);

        if (laptop == null) {
            throw new RuntimeException("Laptop id not found - " + laptopId);
        }

        laptopService.delete(laptopId);

        return "Deleted laptop with id = " + laptopId;
    }
}
