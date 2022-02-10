package de.codexbella.day3.ArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    //TODO Komplette "Aufgabe: ArrayList" nochmal nach eigener Implementation der add-Methode
    //TODO Aufgabe: Map fehlt komplett
    private ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < students.size(); i++) {
            output += students.get(i);
            if (i < students.size() - 1) {
                output += "; ";
            }
        }
        return output;
    }

    public ArrayList<Student> list() {
        return students;
    }

    public Student randomStudent() {
        Student randomStudent = students.get((int) (Math.random() * students.size()));
        return randomStudent;
    }
}