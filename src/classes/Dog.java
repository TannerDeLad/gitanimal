package classes;

public class Dog extends Animal {
    public Dog(String type, String breed, String color, String name, String favoriteFood, byte numLegs)
    {
        // the super line calls the constructor of the superclass
        super(type, breed, color, name, favoriteFood, numLegs);
    }
    public void makeSound() {
        System.out.println(this.name + " goes roof");
    }
}
