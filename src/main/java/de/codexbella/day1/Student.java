package de.codexbella.day1;

import java.util.Objects;

public class Student {
    private String lastName = "";//oder: private String lastName; (ohne Initialisierung, aber dann wird bei Strings kein Wert, also null, gesetzt.)
    private String firstName = "";//oder: private String firstName;
    private String studentNumber = "00000000";//oder: private String studentNumber;
    private int currentSemester = 1;//oder: private in currentSemester;

    //Konstruktor:
    Student(String lastName, String firstName, String studentNumber, int currentSemester){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.currentSemester = currentSemester;
    }

    //Häufiger Konstruktor ist einer zum sich selbst Kopieren:
    Student(Student toCopy) {
        this.firstName = toCopy.getFirstName();
        this.lastName = toCopy.getLastName();
        this.studentNumber = toCopy.getStudentNumber();
        this.currentSemester = toCopy.getCurrentSemester();
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstNameInput) {
        this.firstName = firstNameInput;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastNameInput) {
        this.lastName = lastNameInput;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumberInput) {
        this.studentNumber = studentNumberInput;
    }
    public int getCurrentSemester() {
        return currentSemester;
    }
    public void setCurrentSemester(int currentSemesterInput) {
        this.currentSemester = currentSemesterInput;
    }

    @Override
    public String toString() {
        return getLastName() + ", " + getFirstName() + " - Student number: " + getStudentNumber() + ", current semester: " + getCurrentSemester();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return currentSemester == student.currentSemester && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects.equals(studentNumber, student.studentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, studentNumber, currentSemester);
    }
}
