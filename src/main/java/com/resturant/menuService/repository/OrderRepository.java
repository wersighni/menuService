package com.resturant.menuService.repository;

import com.resturant.menuService.modal.OrderRes;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<OrderRes,Long> {
    List<OrderRes> findAllByUserId(String userId);
}
