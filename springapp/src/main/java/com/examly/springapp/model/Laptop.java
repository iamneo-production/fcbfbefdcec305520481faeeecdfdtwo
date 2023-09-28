package com.examly.springapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop {

    private int laptopId;
    private String laptopBrand;
    private int laptopPrice;
}
