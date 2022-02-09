package de.codexbella.day3;

public class AnimalList {
    private AnimalListItem head;

    @Override
    public String toString() {
        if (head == null) {
            return "";
        } else {
            AnimalListItem currentItem = head;
            String result = currentItem.toString();
            while (currentItem.getNext() != null){
                currentItem = currentItem.getNext();
                result = result + " -> " + currentItem.toString();
            }
            return result;
        }
    }

    public void add(Animal animalName) {
        AnimalListItem listItemToAdd = new AnimalListItem(animalName);
        if (head == null) {
            head = listItemToAdd;
        } else {
            AnimalListItem currentItem = head;
            while (currentItem.getNext() != null){
            currentItem = currentItem.getNext();
            }
            currentItem.setNext(listItemToAdd);
        }
    }

}
