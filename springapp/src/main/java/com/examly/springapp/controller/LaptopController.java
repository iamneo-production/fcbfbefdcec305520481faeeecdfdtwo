package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/laptops")
public class LaptopController {

@Autowired
    ApiService apiService;

    
    public LaptopController(ApiService apiService) {
        this.apiService = apiService;
    }

    @PostMapping("/")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return apiService.addLaptop(laptop);
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptop(@PathVariable int laptopId) {
        return apiService.getLaptop(laptopId);
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        return apiService.getAllLaptops();
    }
}
