package com.resturant.menuService;

import com.resturant.menuService.modal.Category;
import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.repository.CategoryRepository;
import com.resturant.menuService.repository.DishRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class MenuServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuServiceApplication.class, args);
	}



}
