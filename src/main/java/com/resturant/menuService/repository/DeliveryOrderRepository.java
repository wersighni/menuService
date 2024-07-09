package com.resturant.menuService.repository;

import com.resturant.menuService.modal.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder,Long> {
    List<DeliveryOrder> findAllByUserId(String userId);

}
