package streams.FilterChallenge;

import streams.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Robson", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Sarah", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Comparator<Student> bestGrade = (student1, student2) -> {
          if (student1.grade > student2.grade) return 1;
          if (student1.grade < student2.grade) return -1;
          return 0;
        };

        // Tambem pode ser assim:

        // Comparator<Student> bestGrade = Comparator.comparingDouble(student -> student.grade);

        System.out.println(students.stream().max(bestGrade));
        System.out.println(students.stream().min(bestGrade));

    }
}
