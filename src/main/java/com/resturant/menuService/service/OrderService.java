package com.resturant.menuService.service;

import com.resturant.menuService.modal.OrderRes;
import com.resturant.menuService.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository recommendationRepository;

    public List<OrderRes> getAllRecommendationByUserId(String userId)
    {
        return (List<OrderRes>) recommendationRepository.findAllByUserId(userId);
    }
    public OrderRes createRecommendation(OrderRes recommendation){
        return recommendationRepository.save(recommendation);
    }
    public void deleteOrder(Long  id){
         recommendationRepository.deleteById(id);
    }

}
