package com.resturant.menuService.controller;

import com.resturant.menuService.modal.Category;
import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.service.CategoryService;
import com.resturant.menuService.service.DishService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu/categories")
public class CategoryController {
    private final CategoryService categoryService;
    @GetMapping("/")

    public List<Category> getAllCategories() {

        return categoryService.getAllCategories();
    }
    @PostMapping("/")

    public ResponseEntity<Category> saveCategory(@RequestBody Category category ) {
        return ResponseEntity.status(200).body(categoryService.createcategory(category));
    }
}
