package com.resturant.menuService.service;

import com.resturant.menuService.modal.Category;
import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.repository.CategoryRepository;
import com.resturant.menuService.repository.DishRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

   public List<Category> getAllCategories()
    {
        return (List<Category>) categoryRepository.findAll();
    }
    public Category createcategory(Category category){
        return categoryRepository.save(category);
    }
}
