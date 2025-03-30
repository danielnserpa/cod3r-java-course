package errorhandling.PersonalizedExceptionA;

import errorhandling.Student;

public class Cause {

        static void methodA(Student student) {
            try {
                methodB(student);
            } catch (Exception cause) {
                throw new IllegalArgumentException(cause);
            }
        }

        static void methodB(Student student) {
            if (student == null) {
                throw new NullPointerException("Student is null");
            }
            System.out.println(student.name);
        }


    public static void main(String[] args) {

        try {
            methodA(null);
        } catch (IllegalArgumentException e) {
            if(e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
    methodA(null);
    }
}
