package de.codexbella.day3;

public class AnimalList {
    private AnimalListItem head;

    @Override
    public String toString() {
        return head.getValue().toString();
        //return head.toString();
    }

    public void add(Animal name) {
        AnimalListItem toAdd = new AnimalListItem(name);
        if (head == null) {
            head = toAdd;
        } else if (head.getNext() == null) {
            AnimalListItem animal1 = toAdd;
        }
        //über next zu dem Item hangeln, wo next == null,
        // André würde mit while-Schleife arbeiten
    }

}
