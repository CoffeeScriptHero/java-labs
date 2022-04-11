package labs.Lab4;

import java.util.Arrays;

public class Student {
    // 5 приватних полів класу Student
    private String name;
    private String favoriteLesson;
    private int age;
    private int[] grades;
    private float averageGrade;


    // Конструктор для ініціалізації студента. Задаються усі поля окрім середьного балу,
    // оскільки він визначається методом класу calculateAverage
    public Student(String name, String favoriteLesson, int age, int[] grades) {
        this.name = name;
        this.favoriteLesson = favoriteLesson;
        this.age = age;
        this.grades = grades;
        this.averageGrade = this.calculateAverage();
    }

    // Метод класу Student, який нічого не приймає, повертає дійсне число.
    // У циклі додаємо до змінної average кожний бал, а потім повертає суму всіх балів поділену на їх кількість
    public float calculateAverage() {
        float average = 0;
        for (int grade : grades) {
            average += grade;
        }
        return average / grades.length;
    }

    // Геттер для віку студента
    public int getAge() {
        return age;
    }

    // Сеттер для віку студента
    public void setAge(int age) {
        this.age = age;
    }

    // Геттер для середнього балу студента
    public float getAverageGrade() {
        return averageGrade;
    }

    // Сеттер для середнього балу студента
    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Перевизначений метод toString, який забезпечує красивий вивід об'єкту класа Student у консоль
    @Override
    public String toString() {
        return String.format("Student{name='%s', favoriteLesson='%s', age=%d, grades=%s, averageGrade=%.2f}",
                name, favoriteLesson, age, Arrays.toString(grades), averageGrade);
    }
}
