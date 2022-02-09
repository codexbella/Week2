package de.codexbella.day3;

public class AnimalListItem {
    private Animal value = new Animal("");
    private AnimalListItem next;

    public Animal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public AnimalListItem(Animal value) {
        this.value = value;
    }
}
