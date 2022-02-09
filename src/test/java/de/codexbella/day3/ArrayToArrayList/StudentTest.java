package de.codexbella.day3.ArrayToArrayList;

import de.codexbella.day1.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testSetAndGetFirstName() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        student1.setFirstName("Karla");
        assertEquals("Karla", student1.getFirstName());
    }
    @Test
    void testSetAndGetLastName() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        student1.setLastName("Musterfrau");
        assertEquals("Musterfrau", student1.getLastName());
    }
    @Test
    void testSetAndGetStudentNumber() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        student1.setStudentNumber("80907060");
        assertEquals("80907060", student1.getStudentNumber());
    }
    @Test
    void testSetAndGetCurrentSemester() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        student1.setCurrentSemester(3);
        assertEquals(3, student1.getCurrentSemester());
    }
    @Test
    void testGetStudentInfo() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3", student1.toString());
    }
    @Test
    void testCopy() {
        var testStudent = new de.codexbella.day1.Student("Schreck", "André", "50406030", 11);
        var result = new de.codexbella.day1.Student(testStudent);

        assertEquals("André", result.getFirstName());
        assertEquals("Schreck", result.getLastName());
        assertEquals("50406030", result.getStudentNumber());
        assertEquals(11, result.getCurrentSemester());
    }
    @Test
    void testEqualsShouldBeDifferent() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        de.codexbella.day1.Student student2 = new de.codexbella.day1.Student("Mustermensch", "Karl", "80907061", 1);
        assertEquals(false, student1.equals(student2));
    }
    @Test
    void testEqualsShouldBeTheSame() {
        de.codexbella.day1.Student student1 = new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3);
        de.codexbella.day1.Student student2 = new Student("Musterfrau", "Karla", "80907060", 3);
        assertEquals(true, student1.equals(student2));
    }
}