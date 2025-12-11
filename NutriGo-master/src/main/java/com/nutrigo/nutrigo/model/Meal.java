package com.nutrigo.nutrigo.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "meals")

public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String mealType;
    private String aim;
    private String healthTags;
    private int calories;
    private int protein;
    private int carbs;
    private int fat;
    private double price;
}
