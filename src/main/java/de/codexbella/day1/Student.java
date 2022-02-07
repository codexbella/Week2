package de.codexbella.day1;

public class Student {
    private String firstName = "";//oder: private String firstName; (ohne Initialisierung, aber dann wird bei Strings kein Wert, also null, gesetzt.)
    private String lastName = "";//oder: private String lastName;
    private String studentNumber = "00000000";//oder: private String studentNumber;
    private int currentSemester = 1;//oder: private in currentSemester;

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
}
