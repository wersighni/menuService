package com.resturant.menuService.modal;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class DeliveryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float total;
    private String name;
    private String address;
    private long phoneNumber;
    private String userId;

    @ElementCollection
    @CollectionTable(name = "delivery_order_orders", joinColumns = @JoinColumn(name = "delivery_order_id"))
    @Column(name = "order_id")
    private List<Long> orderIds;
}
