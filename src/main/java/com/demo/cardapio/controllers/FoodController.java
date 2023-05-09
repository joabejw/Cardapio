package com.demo.cardapio.controllers;

import com.demo.cardapio.dto.FoodDTO;
import com.demo.cardapio.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/foods")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<FoodDTO> findAll(){
       return foodService.findAll();
    }
}
