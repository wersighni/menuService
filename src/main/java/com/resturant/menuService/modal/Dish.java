package com.resturant.menuService.modal;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

// Dish.java
@Entity
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dishPhoto;
    private String description;
    private Double price;
    private Boolean isAvailable=true;
    private Boolean deleted=false;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;




}
