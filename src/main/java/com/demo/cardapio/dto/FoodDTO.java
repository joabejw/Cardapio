package com.demo.cardapio.dto;

import com.demo.cardapio.entities.Food;

public class FoodDTO {
    private Long id;
    private String title;
    private String image;
    private Double price;

    public FoodDTO(){
    }

    public FoodDTO(Food entity){
        id = entity.getId();
        title = entity.getTitle();
        image = entity.getImage();
        price = entity.getPrice();
    }
}
