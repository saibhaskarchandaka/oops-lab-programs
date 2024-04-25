import java.util.*;
class Threadclass extends Thread{
    String name;
    Threadclass(String name)
    {
        this.name=name;
    }
    public void start()
    {
        System.out.println("Hello This is "+name);
    }
    public static void main(String[] args) {
        String name;
        Scanner read=new Scanner(System.in);
        System.out.print("Enter your name : ");
        name=read.nextLine();
        Threadclass obj=new Threadclass(name);
        obj.start();
        read.close();
    }

}

