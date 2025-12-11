package com.nutrigo.nutrigo.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Meal meal;

    private String deliveryAddress;
    private String status;
}
