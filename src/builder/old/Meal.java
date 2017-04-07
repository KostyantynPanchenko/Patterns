package builder.old;

import java.util.List;
import java.util.LinkedList;

public class Meal {

    private List<Food> meals = new LinkedList<>();
    
    public boolean addMeal(Food food) {
        return meals.add(food);
    }
    
    public double getCost() {
        return meals.stream().map(food -> food.getPrice()).reduce((double) 0, (a, b) -> a + b);
    }
    
    public void showMeals() {
        meals.forEach(meal -> {
            System.out.print("Name: " + meal.getName());
            System.out.print(", Packing: " + meal.getPacking());
            System.out.println(", Price: " + meal.getPrice());
        });
    }
    
    public static class Builder {
        Meal meal = new Meal();
    }
}
