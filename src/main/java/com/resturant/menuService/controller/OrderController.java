package com.resturant.menuService.controller;

import com.resturant.menuService.modal.OrderRes;
import com.resturant.menuService.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class OrderController {
    private final OrderService orderService;
    @GetMapping("/recommendation/{userId}")
    public List<OrderRes> getOrder(@PathVariable String userId) {

        return orderService.getAllRecommendationByUserId(userId);
    }
    @PostMapping("/recommendation/")

    public OrderRes createOrder(@RequestBody OrderRes order) {
        log.info("Order{}",order);

        return orderService.createRecommendation(order);
    }
    @DeleteMapping("/recommendation/{id}")

    public void createOrder(@PathVariable Long id) {

         orderService.deleteOrder(id);
    }
}
