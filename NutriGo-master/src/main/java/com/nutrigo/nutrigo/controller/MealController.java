package com.nutrigo.nutrigo.controller;

import com.nutrigo.nutrigo.model.Meal;
import com.nutrigo.nutrigo.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    @Autowired
    private MealService mealService;

    @GetMapping("/filter")
    public List<Meal> getFilteredMeals(@RequestParam String mealType,
                                       @RequestParam String aim,
                                       @RequestParam String healthTags) {
        return mealService.getFilteredMeals(mealType, aim, healthTags);
    }

    @PostMapping("/add")
    public Meal addMeal(@RequestBody Meal meal) {
        return mealService.saveMeal(meal);
    }
}
