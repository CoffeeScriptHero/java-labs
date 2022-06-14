package labs.Lab4.Student;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Float.compare(student2.getAverageGrade(), student1.getAverageGrade());
    }
}
