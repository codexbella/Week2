package de.codexbella.day2.inheritance;

abstract public class Student {
    abstract String getFirstName();
    abstract String getLastName();
    abstract String getStudentNumber();
    abstract int getCurrentSemester();

    abstract void setFirstName(String firstNameInput);
    abstract void setLastName(String lastNameInput);
    abstract void setStudentNumber(String studentNumberInput);
    abstract void setCurrentSemester(int currentSemesterInput);

    String getMajor() {
        return null;
    }

    abstract int anzahlModule();
}
