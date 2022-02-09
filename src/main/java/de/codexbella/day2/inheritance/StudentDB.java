package de.codexbella.day2.inheritance;

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
        return null;
    }
}

/*
import java.util.Objects;

 public class Student {

     private int id;
     private String name;

     public Student(int id, String name) {
         this.id = id;
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public String getName() {
         return name;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Student student = (Student) o;
         return id == student.id && Objects.equals(name, student.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(id, name);
     }

     @Override
     public String toString() {
         return "{id: " + id + ", name: " + name + "}";
     }
 }
 */
