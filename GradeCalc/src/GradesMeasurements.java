import java.util.Scanner;

public class GradesMeasurements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScores = 0;
        int numOfScores = 0;

        while (true) {
            System.out.print("Enter a score (or a negative number to exit): ");
            int score = scanner.nextInt();

            if (score < 0) {
                break; // exit the loop if a negative number is entered
            } else if (score > 100) {
                System.out.println("Invalid input. Please enter a score between 0 and 100.");
                continue; // skip the input and restart the loop
            }

            totalScores += score;
            numOfScores++;
        }

        scanner.close(); // close the scanner to avoid resource leaks

        if (numOfScores > 0) {
            double average = (double) totalScores / numOfScores;
            System.out.println("Average Grade: " + average);

            if (average > 90) {
                System.out.println("Excellent Work!");
            } else if (average > 80) {
                System.out.println("Good Job!");
            } else if (average > 70) {
                System.out.println("Keep it up!");
            } else {
                System.out.println("Let's work hard to get those grades up!");
            }
        } else {
            System.out.println("No scores entered. Exiting.");
        }
    }
}
