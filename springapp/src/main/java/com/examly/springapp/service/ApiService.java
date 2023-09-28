package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {
    private List<Laptop> laptopList = new ArrayList<>();

    public boolean addLaptop(Laptop laptop) {
        // Implement the logic to add a laptop to the list
        // Return true if successful, false otherwise
        // You can use laptopList.add(laptop) here
        // Implement your logic as per your requirements
        return false;
    }

    public Laptop getLaptopById(int laptopId) {
        // Implement the logic to retrieve a laptop by ID
        // You can use a loop to iterate through laptopList
        // Return the laptop object if found, null otherwise
        return null;
    }

    public List<Laptop> getAllLaptops() {
        // Implement the logic to retrieve all laptops
        // Return the list of all laptops
        return laptopList;
    }
}
