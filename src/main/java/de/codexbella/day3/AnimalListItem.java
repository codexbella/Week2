package de.codexbella.day3;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

/*    public String toString() {
        return value.toString();
    }*/

    public Animal getValue() {
        return value;
    }
    public AnimalListItem getNext() {
        return next;
    }

}
