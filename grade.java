import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double A= 90.0;
        double B= 80.0;
        double C= 70.0;
        double D= 60.0;
        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        if (numSubjects <= 0) {
            System.out.println("Invalid number of subjects. Exiting.");
            return;
        }
        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100. Exiting.");
                return;
            }
            totalMarks += marks;
        }
        
        double averagePercentage = (double) totalMarks / numSubjects;
        
        char grade;
        if (averagePercentage >= A) {
            grade = 'A';
        } else if (averagePercentage >= B) {
            grade = 'B';
        } else if (averagePercentage >= C) {
            grade = 'C';
        } else if (averagePercentage >= D) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        
    }
}