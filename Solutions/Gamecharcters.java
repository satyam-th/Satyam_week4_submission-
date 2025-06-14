class GameCharcters{
    String name;

    public GameCharcters(String name) {
        this.name = name;
    }   
    public String attack() {
        return name + " attacks!";
    }

}
class Warrior extends GameCharcters {
    private String weapon;

    public Warrior(String name, String weapon) {
        super(name);
        this.weapon = weapon;
    }

    @Override
    public String attack() {
        return super.attack() + " with " + weapon;
    }
    public String attack(int damage) { // same function name with different parameters is called method overloading also known as compile time polymorphism
        return super.attack() + " with " + weapon + " causing " + damage + " damage";
    }
}
class Archers extends GameCharcters {
    private String arrowCount;

    public Archers(String name, String arrowCount) {
        super(name);
        this.arrowCount = arrowCount;
    }
    @Override
    public String attack() {
        return super.attack() + " with " + arrowCount + " arrows";
    }
}
class Mage extends GameCharcters {
    private String mana;

    public Mage(String name, String mana) {
        super(name);
        this.mana = mana;
    }
    @Override
    public String attack() {
        return super.attack() + " using " + mana + " mana";
    }

}

public class Gamecharcters {
    public static void main(String[] args) {
        GameCharcters warrior = new Warrior("pubg", "m416");
        GameCharcters archer = new Archers("Legolas", "20");
        GameCharcters mage = new Mage("Gandalf", "100");

        System.out.println(warrior.attack());
        System.out.println(archer.attack());
        System.out.println(mage.attack());

        // Demonstrating method overloading
        Warrior warriorWithDamage = (Warrior) warrior; // tring some this new by referencing warrior as Warrior not making new object  copy as warrior to warriorwithdmage
        // function overloading is done by changing the parameters of the function
        System.out.println(warriorWithDamage.attack(50));   

    }
}
