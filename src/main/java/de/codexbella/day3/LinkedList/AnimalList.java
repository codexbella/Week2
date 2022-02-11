package de.codexbella.day3.LinkedList;

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

    public void remove(Animal animalName) {
        if (head.getValue() == animalName) {
            if (head.getNext() != null) {
                head = head.getNext();
            } else {
                head = null;
            }
        } else {
            AnimalListItem currentItem = head.getNext();
            AnimalListItem itemBefore = head;
            AnimalListItem itemAfter;
            while (currentItem != null) {
                itemAfter = currentItem.getNext();
                if (currentItem.getValue() == animalName) {
                    itemBefore.setNext(itemAfter);
                    currentItem = itemAfter;
                } else {
                    itemBefore = currentItem;
                    currentItem = itemAfter;
                }
            }
        }
    }
}
