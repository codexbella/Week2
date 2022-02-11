package de.codexbella.day3.LinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    @Test
    void shouldAddSixAnimals() {
        AnimalList testList = new AnimalList();
        testList.add(new Animal("Bird"));
        testList.add(new Animal("Dog"));
        testList.add(new Animal("Cat"));
        testList.add(new Animal("Horse"));
        testList.add(new Animal("Fish"));
        testList.add(new Animal("Snake"));
        Assertions.assertEquals("Bird -> Dog -> Cat -> Horse -> Fish -> Snake", testList.toString());
    }
    @Test
    void shouldRemoveHorse() {
        //TODO Test grün kriegen
        AnimalList testList = new AnimalList();
        Animal horse = new Animal("Horse");
        testList.add(new Animal("Bird"));
        testList.add(new Animal("Dog"));
        testList.add(new Animal("Cat"));
        testList.add(horse);
        testList.add(new Animal("Fish"));
        testList.add(new Animal("Snake"));
        testList.add(horse);
        testList.remove(horse);
        Assertions.assertEquals("Bird -> Dog -> Cat -> Fish -> Snake", testList.toString());
    }
    @Test
    void shouldRemoveHorseAndGiveABlankList() {
        AnimalList testList = new AnimalList();
        Animal horse = new Animal("Horse");
        testList.add(horse);
        testList.remove(horse);
        Assertions.assertEquals("", testList.toString());
    }
}