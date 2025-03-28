package errorhandling.PersonalizedExceptionA;

import errorhandling.Student;

public class ValidateTests {

    public static void main(String[] args) {


        // Validating students to show the different personalized exceptions crated. First EmptyStringE. Second NegativeNumberE.

//        Student s1 = new Student("", -7);
//        Validate.student(s1);

//        Student s2 = new Student("Daniel", -7);
//        Validate.student(s2);

        Student s3 = new Student("Rob", 7);
        Validate.student(s3);

        //Then to treat the errors, I can do as follow:
        //Instead of showing the error on the console, it will get the message and show it to the user.

        // I can put different exceptions on the same error treatment.
        // If name is empty, it will get the EmptyStringE
        // If I have a name and invalid grade, it will get NegativeNumberE
        // If I have a null student, it will get IllegalArgumentE

        try {
            Student s4 = new Student("", 7);
            Validate.student(s4);
        } catch (EmptyStringException | NegativeNumberException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student s5 = new Student("Rob", -7);
            Validate.student(s5);
        } catch (EmptyStringException | NegativeNumberException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            Validate.student(null);
        } catch (EmptyStringException | NegativeNumberException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
