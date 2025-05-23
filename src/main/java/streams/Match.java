package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Robson", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Sarah", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Predicate<Student> approved = a -> a.grade >= 7;

        System.out.println(students.stream().allMatch(approved));
        System.out.println(students.stream().anyMatch(approved));
        System.out.println(students.stream().noneMatch(approved));
    }
}
