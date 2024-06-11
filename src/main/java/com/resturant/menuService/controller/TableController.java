package com.resturant.menuService.controller;

import com.resturant.menuService.modal.Dish;
import com.resturant.menuService.modal.TableR;
import com.resturant.menuService.service.DishService;
import com.resturant.menuService.service.TableService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class TableController {
    private final TableService tableService;

    @GetMapping("/tables")

    public List<TableR> getMenu() {

        return tableService.getAllTable();
    }
}
