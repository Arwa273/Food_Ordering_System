import java.io.Serializable;
import java.util.ArrayList;

public class Restaurant implements Serializable {
    String name;
    String location;
    String category;
    ArrayList<Food> menu;

    // Restaurants
    public Restaurant(String name, String location, String category)
    {
        this.name = name;
        this.location = location;
        this.category = category;
        this.menu = new ArrayList<>();
    }

    // add items of restaurant's menu
    void addMenuItem(String itemName, String itemType , double itemPrice)
    {
        menu.add(new Food(itemName, itemType, itemPrice));
    }

    // displays menu for a specific restaurant
    void displayMenu()
    {
        System.out.println("Menu for " + name + ":");
        for(Food item : menu)
        {
            System.out.println(item.name + "(" + item.type + ") " + ": " + item.price + " EGP");
        }
    }

}
