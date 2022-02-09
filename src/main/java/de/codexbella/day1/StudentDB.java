package de.codexbella.day1;

import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < students.length; i++) {
            output += students[i];
            if (i < students.length - 1) {
                output += "; ";
            }
        }
        return output;
    }

    public Student[] list() {
        return students;
    }

    public Student randomStudent() {
        Student randomStudent = students[(int) (Math.random() * students.length)];
        return randomStudent;
    }

    /*    public void add(Student studentToAdd) {
            Student[] newStudents = new Student[students.length + 1];
            newStudents = Arrays.copyOf(students, students.length + 1);
            newStudents[newStudents.length - 1] = studentToAdd;
            this.students = newStudents;
        }*/
    public void add(Student studentToAdd) {
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = studentToAdd;
        this.students = newStudents;
    }


    public void remove(int i) {
        Student[] newStudents = Arrays.copyOf(students, students.length - 1);
        System.arraycopy(students, 0, newStudents, 0, i);
        System.arraycopy(students, i + 1, newStudents, i, students.length - (i + 1));
        this.students = newStudents;
    }
}
