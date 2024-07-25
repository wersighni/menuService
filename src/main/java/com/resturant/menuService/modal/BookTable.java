package com.resturant.menuService.modal;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class BookTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String clientName;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "table_id")
    private TableR tableR;
}
