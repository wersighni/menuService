package com.resturant.menuService.repository;
import com.resturant.menuService.modal.BookTable;
import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.modal.TableR;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TableRepository extends CrudRepository<TableR,Long> {
    List<TableR> findAllByDeleted(boolean deleted);

}
