import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0–100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        } 
        else if (marks >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 50) {
            System.out.println("Grade: D");
        } 
        else {
            System.out.println("Grade: F — You need to work harder!");
        }

        sc.close();
    }
}
