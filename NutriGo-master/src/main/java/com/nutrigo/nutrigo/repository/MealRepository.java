package com.nutrigo.nutrigo.repository;

import com.nutrigo.nutrigo.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository extends JpaRepository<Meal, Integer> {
    List<Meal> findByMealTypeAndAimContainingIgnoreCaseAndHealthTagsContainingIgnoreCase(String mealType, String aim, String healthTags);
}
