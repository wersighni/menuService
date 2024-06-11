package com.resturant.menuService.repository;
import com.resturant.menuService.modal.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
