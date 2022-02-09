package de.codexbella.day1;

import de.codexbella.day1.Student;
import de.codexbella.day1.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void shouldReturnStringRepresentation() {
        Student[] testArray = {new Student("Musterfrau", "Karla", "80907060", 3), new Student("Mustermensch", "Karl", "80907061", 1)};
        StudentDB testStudents = new StudentDB(testArray);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3; Mustermensch, Karl - Student number: 80907061, current semester: 1", testStudents.toString());
    }
    @Test
    void shouldReturnListOfStudents() {
        Student[] testArray = {new Student("Musterfrau", "Karla", "80907060", 3),
                new Student("Mustermensch", "Karl", "80907061", 1)};
        StudentDB testStudents = new StudentDB(testArray);
        Assertions.assertArrayEquals(testArray, testStudents.list());
    }
    @Test
    void shouldReturnOneStudent() {
        Student[] testArray = {new Student("Musterfrau", "Karla", "80907060", 3),
                new Student("Mustermensch", "Karl", "80907061", 1),
                new Student("Ratzinger", "Robert", "80907561", 11),
                new Student("Wunderbar", "Maria", "80957061", 7),
                new Student("Lodinger", "Saran", "80507061", 4),
                new Student("Senger", "Marina", "80905061", 15),
                new Student("Tot", "Ludolf", "85907061", 101),
                new Student("Leben", "Tristan", "50907061", 1),
                new Student("Fangzahn", "Dragon", "80407061", 3),
                new Student("Schnellflug", "Earl", "30907061", 9),
                new Student("Mustertest", "Harry", "80947061", 3),
                new Student("Ghost", "Ted", "83907061", 5),
                new Student("Geisterfahrer", "Markus", "80904061", 5),
                new Student("Spirit", "Ruby", "80307061", 7),
                new Student("Suloba", "Carl", "80907461", 9),
                new Student("Whangst", "Lilli", "80937061", 13),
                new Student("Herdenhecht", "Harald", "80907041", 15),
                new Student("Singvogel", "Lala", "80903061", 7),
                new Student("Fahrer", "Manta", "80907064", 3),
                new Student("Teutsch", "Olaf", "80907361", 6),
                new Student("Warnerbanner", "Autsch", "80907044", 8),
                new Student("Nostalgierde", "Helene", "80907031", 1),
                new Student("Mogul", "Max", "60907061", 21),
                new Student("Held", "Heinz", "80907063", 2),
                new Student("Holler", "Hesther", "86907061", 1),
                new Student("Variante", "Corona", "80907033", 5)};
        StudentDB testStudents = new StudentDB(testArray);
        Student randomStudent = testStudents.randomStudent();
        Assertions.assertNotNull(randomStudent);
    }
    @Test
    void shouldAddNewStudent() {
        Student[] initialStudentArray = { new Student("Variante", "Corona", "80907033", 5)};
        StudentDB students = new StudentDB(initialStudentArray);
        students.add(new Student("Holimoli", "Ohmeij", "80907011", 3));
        Assertions.assertArrayEquals(new Student[]{new Student("Variante", "Corona", "80907033", 5),
                new Student("Holimoli", "Ohmeij", "80907011", 3)}, students.list());
    }
    @Test
    void shouldRemoveFirstStudent() {
        Student[] initialStudentArray = {new Student("Variante", "Corona", "80907033", 5),
                new Student("Holimoli", "Ohmeij", "80907011", 3)};
        StudentDB students = new StudentDB(initialStudentArray);
        students.remove(0);
        Assertions.assertArrayEquals(new Student[]{new Student("Holimoli", "Ohmeij", "80907011", 3)}, students.list());
    }
    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = {new Student("Variante", "Corona", "80907033",5),
                new Student("Holimoli", "Ohmeij", "80907011", 3)};
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = {new Student("Variante", "Corona", "80907033", 5)};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = {new Student("Variante", "Corona", "80907033",5),
                new Student("Wunderbar", "Maria", "80957061", 7),
                new Student("Holimoli", "Ohmeij", "80907011", 3)};
        StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = {new Student("Variante", "Corona", "80907033", 5),
                new Student("Holimoli", "Ohmeij", "80907011", 3)};
        Assertions.assertArrayEquals(expected, actual);
    }
}