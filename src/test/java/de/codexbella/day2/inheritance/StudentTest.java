package de.codexbella.day2.inheritance;

import de.codexbella.day2.interfaces.ComputerScienceStudent;
import de.codexbella.day2.interfaces.HistoryStudent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    @Test
    void testGetMajorHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        assertEquals("History", student1.getMajor());
    }
    @Test
    void testSetAndGetFirstNameHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setFirstName("Karla");
        assertEquals("Karla", student1.getFirstName());
    }
    @Test
    void testSetAndGetLastNameHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setLastName("Musterfrau");
        assertEquals("Musterfrau", student1.getLastName());
    }
    @Test
    void testSetAndGetStudentNumberHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setStudentNumber("80907060");
        assertEquals("80907060", student1.getStudentNumber());
    }
    @Test
    void testSetAndGetCurrentSemesterHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setCurrentSemester(3);
        assertEquals(3, student1.getCurrentSemester());
    }
    @Test
    void testGetStudentInfoHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3", student1.toString());
    }
    @Test
    void testCopyHistory() {
        var testStudent = new HistoryStudent("Schreck", "André", "50406030", 11);
        var result = new HistoryStudent(testStudent);

        assertEquals("André", result.getFirstName());
        assertEquals("Schreck", result.getLastName());
        assertEquals("50406030", result.getStudentNumber());
        assertEquals(11, result.getCurrentSemester());
    }
    @Test
    void testEqualsShouldBeDifferentHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        HistoryStudent student2 = new HistoryStudent("Mustermensch", "Karl", "80907061", 1);
        assertEquals(false, student1.equals(student2));
    }
    @Test
    void testEqualsShouldBeTheSameHistory() {
        HistoryStudent student1 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        HistoryStudent student2 = new HistoryStudent("Musterfrau", "Karla", "80907060", 3);
        assertEquals(true, student1.equals(student2));
    }

    @Test
    void testGetMajorComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        assertEquals("Computer Science", student1.getMajor());
    }
    @Test
    void testSetAndGetFirstNameComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setFirstName("Karla");
        assertEquals("Karla", student1.getFirstName());
    }
    @Test
    void testSetAndGetLastNameComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setLastName("Musterfrau");
        assertEquals("Musterfrau", student1.getLastName());
    }
    @Test
    void testSetAndGetStudentNumberComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setStudentNumber("80907060");
        assertEquals("80907060", student1.getStudentNumber());
    }
    @Test
    void testSetAndGetCurrentSemesterComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        student1.setCurrentSemester(3);
        assertEquals(3, student1.getCurrentSemester());
    }
    @Test
    void testGetStudentInfoComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3", student1.toString());
    }
    @Test
    void testCopyComputerScience() {
        var testStudent = new ComputerScienceStudent("Schreck", "André", "50406030", 11);
        var result = new ComputerScienceStudent(testStudent);

        assertEquals("André", result.getFirstName());
        assertEquals("Schreck", result.getLastName());
        assertEquals("50406030", result.getStudentNumber());
        assertEquals(11, result.getCurrentSemester());
    }
    @Test
    void testEqualsShouldBeDifferentComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        ComputerScienceStudent student2 = new ComputerScienceStudent("Mustermensch", "Karl", "80907061", 1);
        assertEquals(false, student1.equals(student2));
    }
    @Test
    void testEqualsShouldBeTheSameComputerScience() {
        ComputerScienceStudent student1 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        ComputerScienceStudent student2 = new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3);
        assertEquals(true, student1.equals(student2));
    }
}