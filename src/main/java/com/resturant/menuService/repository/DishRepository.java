package com.resturant.menuService.repository;

import com.resturant.menuService.modal.Dish;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DishRepository extends CrudRepository<Dish,Long> {
    List<Dish> findAllByDeleted(boolean deleted);
}
