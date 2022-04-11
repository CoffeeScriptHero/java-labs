package labs.Lab4;


public class Main {
    // Виконавчий метод класу Main
    public static void main(String[] args) {
        // Змінна С11 визначається як остача від ділення номера зал. книжки на 11
        final int C11 = 1309 % 11; // => 0, клас студент

        // Створення об'єктів класу Student
        Student Volodymyr = new Student("Volodymyr", "OOP", 19, new int[]{11, 9, 10, 8});
        Student Jessica = new Student("Jessica", "Biology", 17, new int[]{12, 10, 7, 8});
        Student John = new Student("John", "Music", 18, new int[]{7, 6, 10, 6});
        Student Artem = new Student("Artem", "English", 18, new int[]{7, 6, 11, 7});

        //Масив типу даних Student
        Student[] students = {Jessica, Volodymyr, John, Artem};

        // Вивід невідсортованого масиву, сортування за середнім балом, вивід відсортованого масиву.
        printStudents(students, "\nМасив студентів до сортування за середнім баллом (за спаданням): ");
        sortByGrade(students);
        printStudents(students, "Масив студентів після сортування за середнім баллом (за спаданням): ");

        // Вивід невідсортованого масиву, сортування за віком, вивід відсортованого масиву.
        printStudents(students, "\nМасив студентів до сортування за віком (за зростанням): ");
        sortByAge(students);
        printStudents(students, "Масив студентів після сортування за віком (за зростанням): ");
    }

    // Метод, який приймає на вхід масив типу даних Student, нічого не повертає.
    // Сортує студентів за віком (за зростанням) - для порівняння викликає у студентів метод getAge, тобто геттер
    // для отримання віку кожного студента.
    public static void sortByAge (Student[] array){
        Student temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                int previous = array[j-1].getAge();
                int current = array[j].getAge();
                if (previous > current) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Метод, який приймає на вхід масив типу даних Student, нічого не повертає.
    // Сортує студентів за середнім баллом (за спаданням)- для порівняння викликає у студентів метод getAverageGrade,
    // тобто геттер для отримання середнього арифметичного всіх балів студента.
    public static void sortByGrade(Student[] array){
        Student temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                float previous = array[j-1].getAverageGrade();
                float current = array[j].getAverageGrade();
                if (previous < current) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Метод, який приймає на вхід масив типу даних Student, рядок message (повідомлення для виводу). Нічого не повертає
    // У циклі виводить кожного студента з нового рядка (викликається метод toString, перевизначений у класі Student)
    public static void printStudents(Student[] students, String message) {
        System.out.println(message);
        for (Student student : students) {
            System.out.printf("\t%s\n", student);
        }
    }

}
