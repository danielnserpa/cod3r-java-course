package errorhandling;

public class Basic {

    public static void printStudentsName(Student student){
        System.out.println(student.name);
    }

    public static void main(String[] args) {

        Student s1 = null;
        printStudentsName(s1);


//        System.out.println(7/0);
    }

}
