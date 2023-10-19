package classes;

public class App {
    public static void main(String[] args) throws Exception {
        Cat cat1 = new Cat("Kitty", "cat", "calico", "Henry", "Eggrolls", (byte) 4);
        Cat cat2 = new Cat("smelly", "cool_kitty", "red", "Bartholomeow", "Steak", (byte)3);
        Dog dog = new Dog("Rowdy", "ottoman", "blue", "Smeller", "hamburoger", (byte)5);
        Bird bird1 = new Bird("parrot", "irish", "rainbow", "Loudmouth", "Danibles", (byte)2);
        Bird bird2 = new Bird("Weird", "northern", "green", "Avacado", "sour cream", (byte)3 );
        Fish fish1 = new Fish("Catfish", "Missourian", "grey", "Homie", "sewage", (byte)8);
        cat1.makeSound();
        cat1.eat();
        cat1.sleep();
        System.out.println();
        cat2.makeSound();
        cat2.eat();
        cat2.sleep();
        System.out.println();
        dog.makeSound();
        dog.eat();
        dog.sleep();
        System.out.println();
        bird1.makeSound();
        bird1.eat();
        bird1.sleep();
        System.out.println();
        bird2.makeSound();
        bird2.eat();
        bird2.sleep();
        System.out.println();
        fish1.makeSound();
        fish1.eat();
        fish1.sleep();
    }
}