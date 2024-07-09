package com.resturant.menuService.service;

import com.resturant.menuService.modal.DeliveryOrder;
import com.resturant.menuService.repository.DeliveryOrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class DeliveryOrderService {
    private final DeliveryOrderRepository deliveryOrderRepository;

    public List<DeliveryOrder> getAllDeliveryOrderByUserId(String userId)
    {
        return (List<DeliveryOrder>) deliveryOrderRepository.findAllByUserId(userId);
    }
    public List<DeliveryOrder> getAllDeliveryOrder()
    {
        return (List<DeliveryOrder>) deliveryOrderRepository.findAll();
    }
    public DeliveryOrder createDeliveryOrder(DeliveryOrder deliveryOrder){
        return deliveryOrderRepository.save(deliveryOrder);
    }



}
