package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Others {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Robson", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Sarah", 10);
        Student s5 = new Student("Carlos", 9.3);
        Student s6 = new Student("Diego", 2.7);
        Student s7 = new Student("Pamela", 3.8);
        Student s8 = new Student("Andressa", 7.7);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8);

        Predicate<Student> approved = a -> a.grade >= 7;
        Function<Student, Double> grade = a -> a.grade;

        // If there are students with the same name, I can use DISTINCT to exclude duplicates
        // To make it work I need to implement EQUALS and HASHCODE

        students.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("\n");

        // I can use skip/limit to SKIP a number of elements or print until a LIMIT number

        students.stream()
                .distinct()
                .skip(6)
                .forEach(System.out::println);

        System.out.println("\n");

        students.stream()
                .distinct()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n");

        // TAKE/WHILE gets elements while a certain condition is met
        // Prints the elements until a grade >= 8 is found
        students.stream()
                .distinct()
                .takeWhile(student -> student.grade >= 8)
                .forEach(System.out::println);

        // takeWhile can be used after skip

    }


}
