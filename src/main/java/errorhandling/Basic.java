package errorhandling;

public class Basic {

    public static void printStudentsName(Student student){
        System.out.println(student.name);
    }

    public static void main(String[] args) {

        Student s1 = null;

        try {
            printStudentsName(s1);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

        try {
            System.out.println(7/0);
        } catch (Exception e) {
            System.out.println("The division is impossible");
        }
    }

}
