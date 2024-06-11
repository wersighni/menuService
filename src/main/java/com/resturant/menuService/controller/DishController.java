package com.resturant.menuService.controller;

import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.service.DishService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class DishController {
    private final DishService dishService;

    @GetMapping("/")

    public List<Dish> getMenu() {

        return dishService.getAllDish();
    }
    @GetMapping("/dish/")

    public List<Dish> getAllMenu() {

        return dishService.getAllDish();
    }
    @PostMapping("/dish/")

    public ResponseEntity<Dish> create(@RequestBody Dish dish ) {
        return ResponseEntity.status(200).body(dishService.createDish(dish));
    }
    @PutMapping("/dish/")
    public ResponseEntity<Dish> update(@RequestBody Dish dish ) {
        return ResponseEntity.status(200).body(dishService.updateisAvailable(dish));
    }
    @DeleteMapping("/dish/{id}")

    public ResponseEntity<Boolean>deleteDish(@PathVariable Long id ) {
        return ResponseEntity.status(200).body(dishService.deleteDish(id));
    }
}
