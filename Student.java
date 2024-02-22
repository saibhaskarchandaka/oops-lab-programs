import java.util.*;
public class Student
{   
    String s_fullName;
    int s_rollNum;
    double s_semPercentage;
    String s_collegeName;
    int s_collegeCode;

    Student(String fullName,int rollNum,double semPercentage,String collegeName,int collegeCode)
    {
        s_fullName=fullName;
        s_rollNum=rollNum;
        s_semPercentage=semPercentage;
        s_collegeName=collegeName;
        s_collegeCode=collegeCode;
        System.out.println("Constructor Created");
    }
        
    
    void display()
    {
        System.out.println("STUDENT DETAILS");
        System.out.println("Student name: "+s_fullName);
        System.out.println(" Roll Number: "+s_rollNum);
        System.out.println("Sem Percentage: "+s_semPercentage);
        System.out.println("College Name: "+s_collegeName);
        System.out.println("College Code: "+s_collegeCode);
    }
    public static void main (String args [] )
    
      
    {
        String fullName;
        int rollNum;
        double semPercentage;
        String collegeName;
        int collegeCode;
        Scanner input=new Scanner(System.in); 
        System.out.println("Student name: ");
        fullName=input.nextLine();
        System.out.println("Enter your Roll Number: ");
        rollNum=input.nextInt();
        System.out.println("Enter your Sem Percentage: ");
        semPercentage=input.nextDouble();
        System.out.println("Enter your College Name:  ");
        collegeName=input.nextLine();
        System.out.println("Enter your College Code: ");
        collegeCode=input.nextInt();
        Student S1=new Student(fullName,rollNum,semPercentage,collegeName,collegeCode);
        S1.display();
        input.close();
    }

    }





    



