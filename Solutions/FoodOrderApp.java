class FoodItem {
    private String name;
    private double price;

    protected FoodItem(String name, double price) { // use protected to allow subclass access 
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String displayMenuIteam() {
        return "Food Item: " + name + ", Price: Rs."  + price;
    }
}

class Piazza extends FoodItem {
    private String size;
    private String[] toppings; //use array but string[] insead of toppings[] to avoid confusion 

    public Piazza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public String displayMenuIteam() {
        StringBuilder toppingsList = new StringBuilder(); // Using StringBuilder for efficient string concatenation
        for (int i = 0; i < toppings.length; i++) {
            toppingsList.append(toppings[i]); //this is for displaying toppings
            if (i < toppings.length - 1) {
                toppingsList.append(", "); // add comma between toppings
            }
        }
        return super.displayMenuIteam() + ", Size: " + size + ", Toppings: " + toppingsList.toString();
    }
}
class Burger extends FoodItem {
    private boolean cheese;
    private String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }
    @Override
    public String displayMenuIteam() {
        return super.displayMenuIteam() + ", Cheese: " + (cheese ? "Yes" : "No") + ", Patty Type: " + pattyType; // boolean cheese is displayed as Yes or No


}}

class salad extends FoodItem {
    private String dressing;
    private String[] ingredients;

    public salad(String name, double price, String dressing, String[] ingredients) {
        super(name, price);
        this.dressing = dressing;
        this.ingredients = ingredients;
    


    }
    @Override
    public String displayMenuIteam() {
        StringBuilder ingredientsList = new StringBuilder();
        for (int i = 0; i < ingredients.length; i++) {
            ingredientsList.append(ingredients[i]);
            if (i < ingredients.length - 1) {
                ingredientsList.append(", ");
            }
        }
        return super.displayMenuIteam() + ", Dressing: " + dressing + ", Ingredients: " + ingredientsList.toString();

}}

public class FoodOrderApp {
    
    public static void main(String[] args) {
        FoodItem[] menu = new FoodItem[3];
        menu[0] = new Piazza("Pizza", 250.0, "Medium", new String[]{"Cheese", "Tomato"});
        menu[1] = new Burger("Cheese Burger", 150.0, true, "Beef");
        menu[2] = new salad("Caesar Salad", 100.0, "Caesar Dressing", new String[]{"Lettuce", "Croutons", "Parmesan"});

        for (FoodItem item : menu) {
            System.out.println(item.displayMenuIteam());
        }
    }

}
