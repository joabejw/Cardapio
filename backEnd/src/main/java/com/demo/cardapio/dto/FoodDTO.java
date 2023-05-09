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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
