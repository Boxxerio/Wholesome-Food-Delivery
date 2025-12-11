package com.nutrigo.nutrigo.service;

import com.nutrigo.nutrigo.model.Meal;
import com.nutrigo.nutrigo.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    public List<Meal> getFilteredMeals(String mealType, String aim, String healthTags) {
        return mealRepository.findByMealTypeAndAimContainingIgnoreCaseAndHealthTagsContainingIgnoreCase(mealType, aim, healthTags);
    }

    public Meal saveMeal(Meal meal) {
        return mealRepository.save(meal);
    }
}

