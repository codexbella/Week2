package de.codexbella.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testSetAndGetFirstName() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        student1.setFirstName("Karla");
        assertEquals("Karla", student1.getFirstName());
    }
    @Test
    void testSetAndGetLastName() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        student1.setLastName("Musterfrau");
        assertEquals("Musterfrau", student1.getLastName());
    }
    @Test
    void testSetAndGetStudentNumber() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        student1.setStudentNumber("80907060");
        assertEquals("80907060", student1.getStudentNumber());
    }
    @Test
    void testSetAndGetCurrentSemester() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        student1.setCurrentSemester(3);
        assertEquals(3, student1.getCurrentSemester());
    }
    @Test
    void testGetStudentInfo() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3", student1.toString());
    }
    @Test
    void testCopy() {
        var student = new Student("Schreck", "André", "50406030", 11);
        var result = new Student(student);

        assertEquals("André", result.getFirstName());
        assertEquals("Schreck", result.getLastName());
        assertEquals("50406030", result.getStudentNumber());
        assertEquals(11, result.getCurrentSemester());
    }
    @Test
    void testEqualsShouldBeDifferent() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        Student student2 = new Student("Mustermensch", "Karl", "80907061", 1);
        assertEquals(false, student1.equals(student2));
    }
    @Test
    void testEqualsShouldBeTheSame() {
        Student student1 = new Student("Musterfrau", "Karla", "80907060", 3);
        Student student2 = new Student("Musterfrau", "Karla", "80907060", 3);
        assertEquals(true, student1.equals(student2));
    }
}