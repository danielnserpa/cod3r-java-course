package streams.FilterChallenge;

import streams.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", 7.1);
        Student s2 = new Student("Robson", 6.1);
        Student s3 = new Student("Gui", 8.1);
        Student s4 = new Student("Sarah", 10);

        List<Student> students = Arrays.asList(s1, s2, s3, s4);

        Predicate<Student> approved = a -> a.grade >= 7;
        Function<Student, Double> onlyGrade = a -> a.grade;

        BiFunction<Average, Double, Average> calculateAverage = (average, grade) -> average.add(grade);

        BinaryOperator<Average> combineAverage = (a1, a2) -> Average.combine(a1, a2);

        Average average = students.stream()
                .filter(approved)
                .map(onlyGrade)
                .reduce(new Average(), calculateAverage, combineAverage);

        System.out.println("The class average is: " + average.getAverage());


    }
}
