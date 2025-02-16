package controlstructures;

import java.util.Scanner;

public class AverageGradeWhileChallenge {
    public static void main(String[] args) {

        // Calculate the average grade of a class
        // I don't know how many students are in the class
        // The user enters a grade from 0 to 10. If it's outside this range, display an "Invalid grade" message
        // Store the grade in a variable called "total"
        // Every time a new grade is entered, add it to this variable
        // Create another variable to count how many grades have been entered
        // Display the total sum of grades, the number of grades entered, and the average
        // To exit the program, the user must enter -1

        Scanner scanner = new Scanner(System.in);

        int individualGrade;
        int totalGrades = 0;
        int students = 0;

        do {
            System.out.println("What's the student's grade?");
            individualGrade = scanner.nextInt();

            if (individualGrade == -1) {
                System.out.println("Bye");
                break;
            } else if (individualGrade >= 0 && individualGrade <= 10) {
                System.out.println("The grade was computed\n");
                totalGrades += individualGrade;
                students++;
            } else {
                System.out.println("Invalid grade. Try again");
            }

            if (students > 0) {
                int average = totalGrades / students;

                System.out.println("The last added grade was: " + individualGrade
                        + "\nThe total added grade is: " + totalGrades
                        + "\nThe total number of students added is: " + students
                        + "\nThe average is: " + average
                        + "\n");
            }
        } while (true);

        scanner.close();

    }
}
