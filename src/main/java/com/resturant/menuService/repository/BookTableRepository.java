package com.resturant.menuService.repository;

import com.resturant.menuService.modal.BookTable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookTableRepository  extends CrudRepository<BookTable,Long> {
    List<BookTable> findByUserId(String userId);
}
