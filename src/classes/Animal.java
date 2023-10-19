package classes;

public abstract class Animal {
    public String type, breed, color, name, favoriteFood;
    public byte numLegs;

    public abstract void makeSound();

    public Animal(String Type, String Breed, String Color, String Name, String _favoriteFood, byte _numLegs) {
        type = Type;
        breed = Breed;
        color = Color;
        name = Name;
        favoriteFood = _favoriteFood;
        numLegs = _numLegs;
    }

    public void eat() {
        System.out.println(this.name + " is eating " + this.favoriteFood);
    }

    public void sleep() {
        System.out.println(this.name + " go night night");
    }
}
