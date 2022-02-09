package de.codexbella.day2.interfaces;

public interface Student {
    String getFirstName();
    String getLastName();
    String getStudentNumber();
    int getCurrentSemester();

    void setFirstName(String firstNameInput);
    void setLastName(String lastNameInput);
    void setStudentNumber(String studentNumberInput);
    void setCurrentSemester(int currentSemesterInput);

    String getMajor();
}
