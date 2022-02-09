package de.codexbella.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {
    @Test
    void shouldAddOneAnimal() {
        AnimalList testList = new AnimalList();//generiert leere AnimalList
        Animal bird = new Animal("Bird");
        testList.add(bird);
        Assertions.assertEquals("Bird", testList.toString());
    }
    @Test
    void shouldAddThreeAnimals() {
        AnimalList testList = new AnimalList();
        testList.add(new Animal("Bird"));
        testList.add(new Animal("Dog"));
        testList.add(new Animal("Cat"));
        Assertions.assertEquals("Bird -> Dog -> Cat", testList.toString());
    }
}