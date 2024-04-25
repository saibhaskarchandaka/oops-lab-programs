import java.util.*;
class ThreadInterface implements Runnable{
    int num;
    ThreadInterface(int num)
    {
        this.num=num;
    }
    public void run()
    {
        multiply();
    }
    void multiply()
    {
        System.out.println("Multiplication Table of "+num);
        for(int i=0;i<20;i++)
        {
            System.out.println(num+" * "+(i+1)+" = "+num*(i+1));
        }
      
    }
    public static void main(String args[])
    {   
        Scanner read=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=read.nextInt();
        ThreadInterface obj=new ThreadInterface(num);
        obj.run();
        read.close();
    }
}
