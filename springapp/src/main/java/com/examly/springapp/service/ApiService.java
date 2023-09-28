package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface ApiService1 {

    boolean createLaptop(Laptop laptop);

    Laptop getLaptopById(int laptopId);

    List<Laptop> getAllLaptops();
}

@Service
public class ApiService implements ApiService1 {

    private Map<Integer, Laptop> laptops = new HashMap<>();

    @Override
    public boolean createLaptop(Laptop laptop) {
        int laptopId = laptops.size() + 1;
        laptop.setLaptopId(laptopId);
        laptops.put(laptopId, laptop);
        return true;
    }

    @Override
    public Laptop getLaptopById(int laptopId) {
        return laptops.get(laptopId);
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return new ArrayList<>(laptops.values());
    }
}
