package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ApiService {

    List<Laptop> laptops = new ArrayList<>();

    public Laptop addLaptop(Laptop laptop) {
        // Implement logic to add a laptop to the list
        // Return true if successful, false otherwise
        return laptop;
    }

    public Laptop getLaptop(int laptopId) {
        // Implement logic to retrieve a laptop by ID
        Optional<Laptop> laptop = laptops.stream()
                .filter(l -> l.getLaptopId() == laptopId)
                .findFirst();
        return laptop.orElse(null);
    }

    public List<Laptop> getAllLaptops() {
        // Implement logic to retrieve all laptops
        return laptops;
    }
}
