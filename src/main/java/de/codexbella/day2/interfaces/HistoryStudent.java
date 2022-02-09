package de.codexbella.day2.interfaces;

import java.util.Objects;

public class HistoryStudent implements Student{
    private String lastName = "";//oder: private String lastName; (ohne Initialisierung, aber dann wird bei Strings kein Wert, also null, gesetzt.)
    private String firstName = "";//oder: priv
    // ate String firstName;
    private String studentNumber = "00000000";//oder: private String studentNumber;
    private int currentSemester = 1;//oder: private in currentSemester;

    //Konstruktor:
    public HistoryStudent(String lastName, String firstName, String studentNumber, int currentSemester){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.currentSemester = currentSemester;
    }

    //Häufiger Konstruktor ist einer zum sich selbst Kopieren:
    public HistoryStudent(HistoryStudent toCopy) {
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
    public String getMajor() {
        return "History";
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
        HistoryStudent student = (HistoryStudent) o;
        return currentSemester == student.currentSemester && Objects.equals(lastName, student.lastName) && Objects.equals(firstName, student.firstName) && Objects.equals(studentNumber, student.studentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, studentNumber, currentSemester);
    }
}

/*
import java.util.Arrays;

 public class StudentDB {

     private Student[] students;

     public StudentDB(Student[] inseredStudents) {
         this.students = inseredStudents;
     }

     public Student[] list() {
         return students;
     }

     public Student randomStudent() {
         int maxIndex = students.length - 1;
         return students[(int) (Math.random() * maxIndex)];
     }

     @Override
     public String toString() {
         String result = "[";

         for (int i = 0; i < students.length; i++) {
             result += students[i];
             if (i < students.length -1)  {
                 result += ", ";
             }
         }

         result += "]";

         return result;
     }

     public void add(Student newStudent) {
         Student[] newStudents = Arrays.copyOf(students, students.length + 1);
         newStudents[newStudents.length - 1] = newStudent;
         this.students = newStudents;
     }

     public void remove(int i) {
         Student[] newStudents = Arrays.copyOf(students, students.length - 1);
         System.arraycopy(students, 0, newStudents, 0, i);
         System.arraycopy(students, i + 1, newStudents, i, students.length - (i + 1));
         this.students = newStudents;
     }
 }
 */