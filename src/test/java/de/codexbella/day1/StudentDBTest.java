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
        Student maxMogul = new Student("Mogul", "Max", "60907061", 21);
        Student olafTeutsch = new Student("Teutsch", "Olaf", "80907361", 6);
        Student[] initialStudentArray = {maxMogul};
        StudentDB students = new StudentDB(initialStudentArray);
        students.add(olafTeutsch);
        Assertions.assertArrayEquals(new Student[]{maxMogul, olafTeutsch}, students.list());
    }
    @Test
    void shouldRemoveFirstStudent() {
        Student maxMogul = new Student("Mogul", "Max", "60907061", 21);
        Student olafTeutsch = new Student("Teutsch", "Olaf", "80907361", 6);
        Student[] initialStudentArray = {maxMogul, olafTeutsch};
        StudentDB students = new StudentDB(initialStudentArray);
        students.remove(0);
        Assertions.assertArrayEquals(new Student[]{olafTeutsch}, students.list());
    }
    @Test
    void shouldRemoveLastStudent() {
        Student maxMogul = new Student("Mogul", "Max", "60907061", 21);
        Student olafTeutsch = new Student("Teutsch", "Olaf", "80907361", 6);
        Student carlSuloba = new Student("Suloba", "Carl", "80907461", 9);
        Student lalaSingvogel = new Student("Singvogel", "Lala", "80903061", 7);
        Student ludolfTot = new Student("Tot", "Ludolf", "85907061", 101);
        Student tristanLeben = new Student("Leben", "Tristan", "50907061", 1);

        Student[] students = {maxMogul, olafTeutsch, carlSuloba, lalaSingvogel, ludolfTot, tristanLeben};
        StudentDB studentTestDB = new StudentDB(students);

        studentTestDB.remove(5);
        Student[] expected = {maxMogul, olafTeutsch, carlSuloba, lalaSingvogel, ludolfTot};
        Assertions.assertArrayEquals(expected, studentTestDB.list());
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        Student maxMogul = new Student("Mogul", "Max", "60907061", 21);
        Student olafTeutsch = new Student("Teutsch", "Olaf", "80907361", 6);
        Student carlSuloba = new Student("Suloba", "Carl", "80907461", 9);
        Student lalaSingvogel = new Student("Singvogel", "Lala", "80903061", 7);
        Student ludolfTot = new Student("Tot", "Ludolf", "85907061", 101);
        Student tristanLeben = new Student("Leben", "Tristan", "50907061", 1);

        Student[] students = {maxMogul, olafTeutsch, carlSuloba, lalaSingvogel, ludolfTot, tristanLeben};
        StudentDB studentTestDB = new StudentDB(students);

        studentTestDB.remove(2);
        Student[] expected = {maxMogul, olafTeutsch, lalaSingvogel, ludolfTot, tristanLeben};
        Assertions.assertArrayEquals(expected, studentTestDB.list());
    }
}