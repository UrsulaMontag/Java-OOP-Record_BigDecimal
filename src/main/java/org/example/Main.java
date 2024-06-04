package org.example;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Simon", 18, "Germany");
        Owner owner2 = new Owner("Bob", 20, "Germany");
        Owner owner3 = new Owner("John", 21, "Germany");
        Owner owner4 = new Owner("Jane", 22, "Germany");

        Species cat = new Species("Cat", 250);
        Species dog = new Species("Dog", 300);
        Species bunny = new Species("Bunny", 90);
        Species fish = new Species("Fish", 5);
        Species goose = new Species("Goose", 10);

        Animal animal1 = new Animal(0, "Django", cat, 4, owner1);
        Animal animal2 = new Animal(1, "Baghira", cat, 6, owner1);
        Animal animal3 = new Animal(2, "Stupsi", bunny, 2, owner4);
        Animal animal4 = new Animal(3, "Peter", bunny, 2, owner4);
        Animal animal5 = new Animal(4, "Franz", bunny, 2, owner4);
        Animal animal6 = new Animal(5, "Wum", dog, 12, owner2);
        Animal animal7 = new Animal(6, "Dubbl", fish, 20, owner3);
        Animal animal8 = new Animal(7, "Daisy", goose, 15, owner3);

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.name());

    }
}