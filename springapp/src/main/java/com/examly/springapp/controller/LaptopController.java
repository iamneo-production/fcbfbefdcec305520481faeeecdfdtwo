package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public ResponseEntity<Boolean> createLaptop(@RequestBody Laptop laptop) {
        boolean isCreated = apiService.createLaptop(laptop);
        return new ResponseEntity<>(isCreated, HttpStatus.OK);
    }

    @GetMapping("/{laptopId}")
    public ResponseEntity<Laptop> getLaptopById(@PathVariable int laptopId) {
        Laptop laptop = apiService.getLaptopById(laptopId);
        if (laptop == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(laptop, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Laptop>> getAllLaptops() {
        List<Laptop> laptops = apiService.getAllLaptops();
        return new ResponseEntity<>(laptops, HttpStatus.OK);
    }
}
