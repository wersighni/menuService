package com.resturant.menuService.controller;

import com.resturant.menuService.modal.DeliveryOrder;
import com.resturant.menuService.service.DeliveryOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/menu")
public class DeliveryOrderController {

    private final DeliveryOrderService deliveryOrderService;
    @GetMapping("/delivery/{userId}")
    public List<DeliveryOrder> getDeliveryOrder(@PathVariable String userId) {

        return deliveryOrderService.getAllDeliveryOrderByUserId(userId);
    }
    @GetMapping("/delivery/")
    public List<DeliveryOrder> getAllDeliveryOrder() {

        return deliveryOrderService.getAllDeliveryOrder();
    }
    @PostMapping("/delivery/")

    public DeliveryOrder createDeliveryOrder(@RequestBody DeliveryOrder deliveryOrder) {
        log.info("delivery{}",deliveryOrder);

        return deliveryOrderService.createDeliveryOrder(deliveryOrder);
    }
}
