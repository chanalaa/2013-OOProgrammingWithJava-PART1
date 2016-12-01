
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    
    public void addMeal(String meal) {
        if (meals.contains(meal)) {
        
        } else {
        meals.add(meal);
        }
    }
    
    public void printMeals() {
        for (String n: meals) {
            System.out.println(n);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
    // add the methods here
}
