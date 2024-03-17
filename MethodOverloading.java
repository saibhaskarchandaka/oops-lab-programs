import java.util.*;
class MethodOverloading
{       
    public
    void Addition(int a,int b)
    {
        System.out.println("Addition of two numbers: "+(a+b));
    }

    void Addition(int a,int b,int c)
    {
       System.out.println("Addition of three numbers: "+(a+b+c));
    }
    void Addition(int a,int b,int c,int d)
    {
        System.out.println("Addition of four numbers: "+(a+b+c+d));
    }


public static void main(String args[])
 {
    int a;int b;int c;int d;
    Scanner read=new Scanner(System.in);
    System.out.print("Enter four Integrs: ");
    a=read.nextInt();
    b=read.nextInt();
    c=read.nextInt();
    d=read.nextInt();
    MethodOverloading obj=new MethodOverloading();
    obj.Addition(a,b);
    obj.Addition(a,b,c);
    obj.Addition(a,b,c,d);
    read.close();

 }
}
