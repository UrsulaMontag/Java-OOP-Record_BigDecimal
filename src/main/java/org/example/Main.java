package org.example;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Simon", 18, "Germany");
        Owner owner2 = new Owner("Bob", 20, "Germany");
        Owner owner3 = new Owner("John", 21, "Germany");
        Owner owner4 = new Owner("Jane", 22, "Germany");

        Animal animal1 = new Animal(0, "Django", "Cat", 4, owner1);
        Animal animal2 = new Animal(1, "Baghira", "Cat", 6, owner1);
        Animal animal3 = new Animal(2, "Stupsi", "Bunny", 2, owner4);
        Animal animal4 = new Animal(3, "Peter", "Bunny", 2, owner4);
        Animal animal5 = new Animal(4, "Franz", "Bunny", 2, owner4);
        Animal animal6 = new Animal(5, "Wum", "Dog", 12, owner2);
        Animal animal7 = new Animal(6, "Dubbl", "Fish", 20, owner3);
        Animal animal8 = new Animal(7, "Daisy", "Goose", 15, owner3);

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.name());
    }
}