class product{
    private String name;
    private double price;
public product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Product Name: " + name + ", Price: " + price);
    }
}
class electronics extends product {
    private int warrantyPeriod; // in months

    public electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}
class clothing extends product {
    private String size;
    private String material;
    public clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size + ", Material: " + material);
    }
}
class grocery extends product {
    private String expirationDate;

    public grocery(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiration Date: " + expirationDate);
    }
}

public class productcatalog {
    public static void main(String[] args) {
        product[] products = new product[5];
        products[0] = new electronics("Laptop", 1200.00, 24);
        products[1] = new clothing("T-Shirt", 25.00, "L", "Cotton");
        products[2] = new grocery("Milk", 2.50, "2024-12-31");
        products[3] = new electronics("Smartphone", 800.00, 12);
        products[4] = new clothing("Jeans", 40.00, "M", "Denim");

        for (product p : products) {
            p.displayDetails(); 
            System.out.println(); // display all the details of the product
        }
    }
    
}
