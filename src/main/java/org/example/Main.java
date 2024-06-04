package org.example;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal(0, "Django", "Cat", 4);
        Animal animal2 = new Animal(1, "Baghira", "Cat", 6);
        Animal animal3 = new Animal(2, "Stupsi", "Bunny", 2);
        Animal animal4 = new Animal(3, "Peter", "Bunny", 2);
        Animal animal5 = new Animal(4, "Franz", "Bunny", 2);
        Animal animal6 = new Animal(5, "Wum", "Dog", 12);
        Animal animal7 = new Animal(6, "Dubbl", "Fish", 20);
        Animal animal8 = new Animal(7, "Daisy", "Goose", 15);

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.name());
    }
}