package classes;

public class Fish extends Animal {
    public Fish(String type, String breed, String color, String name, String favoriteFood, byte numLegs)
    {
        // the super line calls the constructor of the superclass
        super(type, breed, color, name, favoriteFood, numLegs);
    }
    public void makeSound() {
        System.out.println(this.name + " goes sploosh");
    }
}