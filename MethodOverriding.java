import java.util.*;
class Mvgr 
{
	void display()
	
	{
	    System.out.println("I am the student of Mvgr College");
	    System.out.println("College Code :33");
	}
}

class Student extends Mvgr
{
    void display(String name,int no)
	{
		System.out.println("I am "+name);
		System.out.println("My RollNumber: "+no);
	}
}
class Main
{
	public static void main(String args[])
	{
	    Scanner read=new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    String name=read.nextLine();
	    System.out.print("Enter your roll number: ");
		int no=read.nextInt();
		Student obj1=new Student();
		obj1.display(name,no);
		Mvgr obj2=new Mvgr();
		obj2.display();
		
	}
	
}
