package de.codexbella.day2.interfaces;

import de.codexbella.day2.interfaces.ComputerScienceStudent;
import de.codexbella.day2.interfaces.HistoryStudent;
import de.codexbella.day2.interfaces.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentDBTest {
    @Test
    void shouldReturnStringRepresentationHistory() {
        HistoryStudent[] testArray = {new HistoryStudent("Musterfrau", "Karla", "80907060", 3), new HistoryStudent("Mustermensch", "Karl", "80907061", 1)};
        StudentDB testStudents = new StudentDB(testArray);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3; Mustermensch, Karl - Student number: 80907061, current semester: 1", testStudents.toString());
    }
    @Test
    void shouldReturnListOfStudentsHistory() {
        HistoryStudent[] testArray = {new HistoryStudent("Musterfrau", "Karla", "80907060", 3), new HistoryStudent("Mustermensch", "Karl", "80907061", 1)};
        StudentDB testStudents = new StudentDB(testArray);
        Assertions.assertArrayEquals(testArray, testStudents.list());
    }
    @Test
    void shouldReturnStringRepresentationComputerScience() {
        ComputerScienceStudent[] testArray = {new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3), new ComputerScienceStudent("Mustermensch", "Karl", "80907061", 1)};
        StudentDB testStudents = new StudentDB(testArray);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3; Mustermensch, Karl - Student number: 80907061, current semester: 1", testStudents.toString());
    }
    @Test
    void shouldReturnListOfStudentsComputerScience() {
        ComputerScienceStudent[] testArray = {new ComputerScienceStudent("Musterfrau", "Karla", "80907060", 3), new ComputerScienceStudent("Mustermensch", "Karl", "80907061", 1)};
        StudentDB testStudents = new StudentDB(testArray);
        Assertions.assertArrayEquals(testArray, testStudents.list());
    }
}

/*
import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

 public class StudentDBTest {

     @Test
     void shouldMakeSureThatStudentsCanBeRetrieved() {
         // given
         Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
         StudentDB studentDB = new StudentDB(students);

         // when
         Student[] actual = studentDB.list();

         // then
         Assertions.assertArrayEquals(students, actual);

         Assertions.assertEquals(1, actual[0].getId());
         Assertions.assertEquals("André Schreck", actual[0].getName());
     }

     @Test
     void shouldReturnRandomStudent() {
         // given
         Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
         StudentDB studentDB = new StudentDB(students);

         // when
         Student student = studentDB.randomStudent();

         // then
         Assertions.assertNotNull(student);
     }

     @Test
     void shouldReturnStringRepresentation() {
         // given
         Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
         StudentDB studentDB = new StudentDB(students);

         // when
         String actual = studentDB.toString();

         // then
         Assertions.assertEquals("[{id: 1, name: André Schreck}, {id: 2, name: Thomas Kittlaus}]", actual);
     }

     @Test
     void shouldAddNewStudent() {
         // given
         Student[] students = { new Student(1, "André Schreck") };
         StudentDB studentDB = new StudentDB(students);

         // when
         studentDB.add(new Student(2, "Thomas Kittlaus"));
         Student[] actual = studentDB.list();

         // then
         Student[] expected = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
         Assertions.assertArrayEquals(expected, actual);
     }

     @Test
     void shouldRemoveFirstStudent() {
         // given
         Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
         StudentDB studentDB = new StudentDB(students);

         // when
         studentDB.remove(0);
         Student[] actual = studentDB.list();

         // then
         Student[] expected = { new Student(2, "Thomas Kittlaus") };
         Assertions.assertArrayEquals(expected, actual);
     }

     @Test
     void shouldRemoveLastStudent() {
         // given
         Student[] students = { new Student(1, "André Schreck"), new Student(2, "Thomas Kittlaus") };
         StudentDB studentDB = new StudentDB(students);

         // when
         studentDB.remove(1);
         Student[] actual = studentDB.list();

         // then
         Student[] expected = { new Student(1, "André Schreck") };
         Assertions.assertArrayEquals(expected, actual);
     }

     @Test
     void shouldRemoveIntermediateStudent() {
         // given
         Student[] students = { new Student(1, "André Schreck"), new Student(2, "Max Mustermann"), new Student(3, "Thomas Kittlaus") };
         StudentDB studentDB = new StudentDB(students);

         // when
         studentDB.remove(1);
         Student[] actual = studentDB.list();

         // then
         Student[] expected = { new Student(1, "André Schreck"), new Student(3, "Thomas Kittlaus") };
         Assertions.assertArrayEquals(expected, actual);
     }

 }
 */