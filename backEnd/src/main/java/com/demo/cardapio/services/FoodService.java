package com.demo.cardapio.services;

import com.demo.cardapio.dto.FoodDTO;
import com.demo.cardapio.entities.Food;
import com.demo.cardapio.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<FoodDTO> findAll(){
        List<Food> list = foodRepository.findAll();
        return list.stream().map(x -> new FoodDTO(x)).toList();
    }

    public void saveFood(@RequestBody Food food){
        foodRepository.save(food);
    }
}
