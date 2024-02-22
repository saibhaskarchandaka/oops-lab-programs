
import java.util.*;
public class Student1
{  
    String s_fullName="";
    double s_semPercentage=0.0;
    String s_collegeName="";
    int s_collegeCode=0;

    Student1()
    {
        s_collegeName="MVGR";
        s_collegeCode=33;
        
    }
    Student1(String fullName,double semPercentage)
    {
        s_fullName=fullName;
        s_semPercentage=semPercentage;
    }
       
   
    void display()
    {
        System.out.println("STUDENT DETAILS");
        System.out.println("Student name: "+s_fullName);
        System.out.println("Sem Percentage: "+s_semPercentage);
        System.out.println("College Name: "+s_collegeName);
        System.out.println("College Code: "+s_collegeCode);
    }
    public static void main (String args [] )
   
     
    {
        Student1 def_s1=new Student1();
        def_s1.display();
        String fullName;
        double semPercentage;
        Scanner input=new Scanner(System.in);
        System.out.println("Student name: ");
        fullName=input.nextLine();
        System.out.println("Enter your Sem Percentage: ");
        semPercentage=input.nextDouble();
        Student1 para_s2=new Student1(fullName, semPercentage);
        para_s2.display();
        input.close();
    }

    }
