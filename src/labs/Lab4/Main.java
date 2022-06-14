package labs.Lab4;


import labs.Lab4.Student.Student;
import labs.Lab4.Student.StudentAgeComparator;
import labs.Lab4.Student.StudentGradeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    // Виконавчий метод класу Main
    public static void main(String[] args) {
        // Змінна С11 визначається як остача від ділення номера зал. книжки на 11
        final int C11 = 1309 % 11; // => 0, клас студент

        // Створення об'єктів класу Student
        Student Volodymyr = new Student("Volodymyr", "OOP", 19,  new ArrayList<>(List.of(11, 9, 10, 8)));
        Student Jessica = new Student("Jessica", "Biology", 17, new ArrayList<>(List.of(12, 10, 7, 8)));
        Student John = new Student("John", "Music", 18, new ArrayList<>(List.of(7, 6, 10, 6)));
        Student Artem = new Student("Artem", "English", 18, new ArrayList<>(List.of(7, 6, 11, 7)));

        //Список типу даних Student
        List<Student> students = new ArrayList<>(List.of(Volodymyr, Jessica, John, Artem));

        StudentAgeComparator ageComparator = new StudentAgeComparator();
        StudentGradeComparator gradeComparator = new StudentGradeComparator();

        // Вивід невідсортованого масиву, сортування за середнім балом, вивід відсортованого масиву.
        printStudents(students, "\nМасив студентів до сортування за середнім баллом (за спаданням): ");
        students.sort(gradeComparator);
        printStudents(students, "Масив студентів після сортування за середнім баллом (за спаданням): ");

        // Вивід невідсортованого масиву, сортування за віком, вивід відсортованого масиву.
        printStudents(students, "\nМасив студентів до сортування за віком (за зростанням): ");
        students.sort(ageComparator);
        printStudents(students, "Масив студентів після сортування за віком (за зростанням): ");
    }

    // Метод, який приймає на вхід масив типу даних Student, рядок message (повідомлення для виводу). Нічого не повертає
    // У циклі виводить кожного студента з нового рядка (викликається метод toString, перевизначений у класі Student)
    public static void printStudents(List<Student> students, String message) {
        System.out.println(message);
        for (Student student : students) {
            System.out.printf("\t%s\n", student);
        }
    }

}
