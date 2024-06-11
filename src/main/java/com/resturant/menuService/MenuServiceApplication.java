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

	@Bean
	CommandLineRunner createMenu( DishRepository dishRepository, CategoryRepository categoryRepository) {
		return args -> {
			// Créer des catégories
			Category category1 = new Category();
			category1.setName("Starter");

			Category category2 = new Category();
			category2.setName("Main Course");

			Category category3 = new Category();
			category3.setName("Dessert");

			categoryRepository.saveAll(Arrays.asList(category1, category2, category3));



			// Créer des plats
			Dish dish1 = new Dish();
			dish1.setName("Pasta");
			dish1.setDescription("Delicious pasta with tomato sauce");
			dish1.setPrice(10.99);
			dish1.setCategory(category2);

			Dish dish2 = new Dish();
			dish2.setName("Salad");
			dish2.setDescription("Fresh salad with mixed greens and dressing");
			dish2.setPrice(8.99);
			dish2.setCategory(category1);
			dishRepository.saveAll(Arrays.asList(dish1,dish2));
		};
	}

}
