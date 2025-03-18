package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Student s1 = new Student("Ana", 8.8);
        Student s2 = new Student("Pedro", 10.0);
        Student s3 = new Student("Gui", 5.8);
        Student s4 = new Student("Lucas", 3.8);
        Student s5 = new Student("Roberta", 6.8);
        Student s6 = new Student("Patricia", 4.8);

        List<Student> students = Arrays.asList(s1, s2, s3, s4, s5, s6);

        students.stream()
                .filter(student -> student.grade > 7)
                .map(student -> "Congrats " + student.name + ", you're approved")
                .forEach(System.out::println);

        // OU

        Predicate<Student> approved = s -> s.grade > 7;
        Function<Student, String> message = s -> "Congrats " + s.name + ", you're approved";

        students.stream()
                .filter(approved)
                .map(message)
                .forEach(System.out::println);

        //Map TRANSFORMA dados. Transforma um objeto Student para uma String
    }
}
