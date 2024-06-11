package com.resturant.menuService.service;

import com.resturant.menuService.modal.Dish;
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
public class DishService {

    private final DishRepository dishRepository;

   public List<Dish> getAllDish()
    {
        return (List<Dish>) dishRepository.findAll();
    }
    public Dish createDish(Dish dish){
        return dishRepository.save(dish);
    }
    public boolean deleteDish(Long id){
        dishRepository.deleteById(id);
        return  true;
    }
    public Dish updateisAvailable(Dish dish)
    {
        dish.setIsAvailable(!dish.getIsAvailable());
        return dishRepository.save(dish);
    }
}
