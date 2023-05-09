package com.demo.cardapio.controllers;

import com.demo.cardapio.dto.FoodDTO;
import com.demo.cardapio.entities.Food;
import com.demo.cardapio.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody Food food){
        foodService.saveFood(food);
    }
}
