package com.resturant.menuService.modal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderRes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
    private String userId;
    private float price;
    private int numberOfDishes;

}