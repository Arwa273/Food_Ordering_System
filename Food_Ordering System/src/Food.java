import java.io.Serializable;

public class Food implements Serializable {
    String name;
    String type; // e.g., Main Meal, Side Dish, Drink, etc.
    double price;

    Food(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
