package streams;

public class Student {

    public final String name;
    public final double grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}
