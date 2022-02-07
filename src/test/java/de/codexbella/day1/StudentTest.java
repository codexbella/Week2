package de.codexbella.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student1 = new Student();
    @Test
    void testSetAndGetFirstName() {
        student1.setFirstName("Karla");
        assertEquals("Karla", student1.getFirstName());
    }
    @Test
    void testSetAndGetLastName() {
        student1.setLastName("Musterfrau");
        assertEquals("Musterfrau", student1.getLastName());
    }
    @Test
    void testSetAndGetStudentNumber() {
        student1.setStudentNumber("80907060");
        assertEquals("80907060", student1.getStudentNumber());
    }
    @Test
    void testSetAndGetCurrentSemester() {
        student1.setCurrentSemester(3);
        assertEquals(3, student1.getCurrentSemester());
    }
}