package de.codexbella.day3.ArrayToArrayList;

import de.codexbella.day1.Student;
import de.codexbella.day1.StudentDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void shouldReturnStringRepresentation() {
        de.codexbella.day1.Student[] testArray = {new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3), new de.codexbella.day1.Student("Mustermensch", "Karl", "80907061", 1)};
        de.codexbella.day1.StudentDB testStudents = new de.codexbella.day1.StudentDB(testArray);
        assertEquals("Musterfrau, Karla - Student number: 80907060, current semester: 3; Mustermensch, Karl - Student number: 80907061, current semester: 1", testStudents.toString());
    }
    @Test
    void shouldReturnListOfStudents() {
        de.codexbella.day1.Student[] testArray = {new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3),
                new de.codexbella.day1.Student("Mustermensch", "Karl", "80907061", 1)};
        de.codexbella.day1.StudentDB testStudents = new de.codexbella.day1.StudentDB(testArray);
        Assertions.assertArrayEquals(testArray, testStudents.list());
    }
    @Test
    void shouldReturnOneStudent() {
        de.codexbella.day1.Student[] testArray = {new de.codexbella.day1.Student("Musterfrau", "Karla", "80907060", 3),
                new de.codexbella.day1.Student("Mustermensch", "Karl", "80907061", 1),
                new de.codexbella.day1.Student("Ratzinger", "Robert", "80907561", 11),
                new de.codexbella.day1.Student("Wunderbar", "Maria", "80957061", 7),
                new de.codexbella.day1.Student("Lodinger", "Saran", "80507061", 4),
                new de.codexbella.day1.Student("Senger", "Marina", "80905061", 15),
                new de.codexbella.day1.Student("Tot", "Ludolf", "85907061", 101),
                new de.codexbella.day1.Student("Leben", "Tristan", "50907061", 1),
                new de.codexbella.day1.Student("Fangzahn", "Dragon", "80407061", 3),
                new de.codexbella.day1.Student("Schnellflug", "Earl", "30907061", 9),
                new de.codexbella.day1.Student("Mustertest", "Harry", "80947061", 3),
                new de.codexbella.day1.Student("Ghost", "Ted", "83907061", 5),
                new de.codexbella.day1.Student("Geisterfahrer", "Markus", "80904061", 5),
                new de.codexbella.day1.Student("Spirit", "Ruby", "80307061", 7),
                new de.codexbella.day1.Student("Suloba", "Carl", "80907461", 9),
                new de.codexbella.day1.Student("Whangst", "Lilli", "80937061", 13),
                new de.codexbella.day1.Student("Herdenhecht", "Harald", "80907041", 15),
                new de.codexbella.day1.Student("Singvogel", "Lala", "80903061", 7),
                new de.codexbella.day1.Student("Fahrer", "Manta", "80907064", 3),
                new de.codexbella.day1.Student("Teutsch", "Olaf", "80907361", 6),
                new de.codexbella.day1.Student("Warnerbanner", "Autsch", "80907044", 8),
                new de.codexbella.day1.Student("Nostalgierde", "Helene", "80907031", 1),
                new de.codexbella.day1.Student("Mogul", "Max", "60907061", 21),
                new de.codexbella.day1.Student("Held", "Heinz", "80907063", 2),
                new de.codexbella.day1.Student("Holler", "Hesther", "86907061", 1),
                new de.codexbella.day1.Student("Variante", "Corona", "80907033", 5)};
        de.codexbella.day1.StudentDB testStudents = new de.codexbella.day1.StudentDB(testArray);
        de.codexbella.day1.Student randomStudent = testStudents.randomStudent();
        Assertions.assertNotNull(randomStudent);
    }
    @Test
    void shouldAddNewStudent() {
        de.codexbella.day1.Student[] initialStudentArray = { new de.codexbella.day1.Student("Variante", "Corona", "80907033", 5)};
        de.codexbella.day1.StudentDB students = new de.codexbella.day1.StudentDB(initialStudentArray);
        students.add(new de.codexbella.day1.Student("Holimoli", "Ohmeij", "80907011", 3));
        Assertions.assertArrayEquals(new de.codexbella.day1.Student[]{new de.codexbella.day1.Student("Variante", "Corona", "80907033", 5),
                new de.codexbella.day1.Student("Holimoli", "Ohmeij", "80907011", 3)}, students.list());
    }
    @Test
    void shouldRemoveFirstStudent() {
        de.codexbella.day1.Student[] initialStudentArray = {new de.codexbella.day1.Student("Variante", "Corona", "80907033", 5),
                new de.codexbella.day1.Student("Holimoli", "Ohmeij", "80907011", 3)};
        de.codexbella.day1.StudentDB students = new de.codexbella.day1.StudentDB(initialStudentArray);
        students.remove(0);
        Assertions.assertArrayEquals(new de.codexbella.day1.Student[]{new de.codexbella.day1.Student("Holimoli", "Ohmeij", "80907011", 3)}, students.list());
    }
    @Test
    void shouldRemoveLastStudent() {
        // given
        de.codexbella.day1.Student[] students = {new de.codexbella.day1.Student("Variante", "Corona", "80907033",5),
                new de.codexbella.day1.Student("Holimoli", "Ohmeij", "80907011", 3)};
        de.codexbella.day1.StudentDB studentDB = new de.codexbella.day1.StudentDB(students);

        // when
        studentDB.remove(1);
        de.codexbella.day1.Student[] actual = studentDB.list();

        // then
        de.codexbella.day1.Student[] expected = {new de.codexbella.day1.Student("Variante", "Corona", "80907033", 5)};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        de.codexbella.day1.Student[] students = {new de.codexbella.day1.Student("Variante", "Corona", "80907033",5),
                new de.codexbella.day1.Student("Wunderbar", "Maria", "80957061", 7),
                new de.codexbella.day1.Student("Holimoli", "Ohmeij", "80907011", 3)};
        de.codexbella.day1.StudentDB studentDB = new StudentDB(students);

        // when
        studentDB.remove(1);
        de.codexbella.day1.Student[] actual = studentDB.list();

        // then
        de.codexbella.day1.Student[] expected = {new de.codexbella.day1.Student("Variante", "Corona", "80907033", 5),
                new Student("Holimoli", "Ohmeij", "80907011", 3)};
        Assertions.assertArrayEquals(expected, actual);
    }
}