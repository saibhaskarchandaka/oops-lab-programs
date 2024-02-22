
import java.util.Scanner;

public class Student {
    String fullName;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;

    Student(String fullName, int rollNum, double semPercentage, String collegeName, int collegeCode) {
        this.fullName = fullName;
        this.rollNum = rollNum;
        this.semPercentage = semPercentage;
        this.collegeName = collegeName;
        this.collegeCode = collegeCode;
    }

    void display() {
        System.out.println("STUDENT DETAILS");
        System.out.println("Student name: " + fullName);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Sem Percentage: " + semPercentage);
        System.out.println("College Name: " + collegeName);
        System.out.println("College Code: " + collegeCode);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student name: ");
        String fullName = input.nextLine();
        System.out.println("Enter your Roll Number: ");
        int rollNum = input.nextInt();
        input.nextLine(); 
        System.out.println("Enter your Sem Percentage: ");
        double semPercentage = input.nextDouble();
        input.nextLine(); 
        System.out.println("Enter your College Name: ");
        String collegeName = input.nextLine();
        System.out.println("Enter your College Code: ");
        int collegeCode = input.nextInt();
        Student student = new Student(fullName, rollNum, semPercentage, collegeName, collegeCode);
        student.display();
        input.close();
    }
}
