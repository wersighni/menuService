package com.resturant.menuService.controller;

import com.resturant.menuService.modal.BookTable;
import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.modal.TableR;
import com.resturant.menuService.repository.BookTableRepository;
import com.resturant.menuService.service.DishService;
import com.resturant.menuService.service.TableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class TableController {
    private final TableService tableService;

    @GetMapping("/tables/")

    public List<TableR> getAllTables() {

        return tableService.getAllTable();
    }
    @PostMapping("/tables/")

    public TableR createTable(@RequestBody TableR tableR) {

        return tableService.createTable(tableR);
    }
    @PostMapping("/tables/bookTable")

    public BookTable createBookTable(@RequestBody BookTable bookTable) {

        return tableService.create(bookTable);
    }
    @GetMapping("/tables/bookTable")

    public List<BookTable> getAllBookTable() {

        return tableService.getAllBookTable();
    }
    @PutMapping("/tables/")
    public ResponseEntity<TableR> update(@RequestBody TableR tableR ) {
        return ResponseEntity.status(200).body(tableService.updateIsAvailable(tableR));
    }
    @DeleteMapping("/tables/{id}")

    public ResponseEntity<Boolean>deleteDish(@PathVariable Long id ) {
        return ResponseEntity.status(200).body(tableService.deleteDish(id));
    }
}
