import java.util.*;
class AccessSpecifierDemo
{
    private
    int priVar;
    protected
    int proVar;
    public 
    int pubVar;
    void setVar(int priValue,int proValue, int pubValue)
    {
        priVar=priValue;
        proVar=proValue;
        pubVar=pubValue;
    }
    void getvar()
    {
        System.out.println("Private Variable: "+priVar);
        System.out.println("Protected Variable: "+proVar);
        System.out.println("Public Variable: "+pubVar);

    }
    public static void main(String[] args)
    {
          AccessSpecifierDemo obj=new AccessSpecifierDemo();
          Scanner input=new Scanner(System.in);
          System.out.println("Enter private variable: ");
          int priValue=input.nextInt();
          System.out.println("Enter protected variable: ");
          int proValue=input.nextInt();
          System.out.println("Enter public variable: ");
          int pubValue=input.nextInt();
          obj.setVar(priValue,proValue,pubValue);
          obj.getvar();
          input.close();

    }
   

}
