class Anmimal{
    String color;
    String bride;
    public Anmimal(String color, String bride) {
        this.color = color;
        this.bride = bride;
    }
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    
}
class Dog extends Anmimal {
    public Dog(String color, String bride) {
        super(color, bride);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
    
    @Override
    public void eat() {
        System.out.println("Dog eats dog food");
    }
}
class Cat extends Anmimal {
    public Cat(String color, String bride) {
        super(color, bride);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
    
    @Override
    public void eat() {
        System.out.println("Cat eats cat food");
    }
}
class Cow extends Anmimal {
    public Cow(String color, String bride) {
        super(color, bride);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Cow moos");
    }
    
    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }
}   
public class AnimalSound {
    public static void main(String[] args) {
        Anmimal[] anmimals= {
            new Dog("Brown", "Labrador"),
            new Cat("Back", "Persian"),
            new Cow("Black", "Garsi")
        };
        for(Anmimal action : anmimals) // for each array loop  until the end of array
         {
            System.out.println("Animal Color: " + action.color + ", Breed: " + action.bride);
            action.makeSound(); //polymorphism in action
            action.eat(); 
            System.out.println(); // for one enter
        }
    }
    
}
