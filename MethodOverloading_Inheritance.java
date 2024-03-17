
import java.util.*;
class Add
{       
    public
    void AtithmeticOperation(int a,int b)
    {
        System.out.println("Addition of two numbers: "+(a+b));
    }

    void AtithmeticOperation(int a,int b,int c)
    {
       System.out.println("Addition of three numbers: "+(a+b+c));
    }

}
class Mul extends Add{
    public
    void AtithmeticOperation(int a,int b)
    {
        System.out.println("Multipication of two numbers: "+(a*b));
    }

    void AtithmeticOperation(int a,int b,int c)
    {
       System.out.println("Multiplication of three numbers: "+(a*b*c));
    }

    
}
class Main
{
public static void main(String args[])
 {
    int a;int b;int c;
    Scanner read=new Scanner(System.in);
    System.out.print("Enter three Integrs: ");
    a=read.nextInt();
    b=read.nextInt();
    c=read.nextInt();
    Mul obj1=new Mul();
    Add obj2=new Add();
    obj1.AtithmeticOperation(a,b);
    obj1.AtithmeticOperation(a,b,c);
    obj2.AtithmeticOperation(a,b);
    obj2.AtithmeticOperation(a,b,c);
    read.close();
}
}
 

