package org.example.zoo;

public record Animal(int id, String name, Species species, int age, Owner owner) {
}
