/*Even here we cannot declare it as public becuase, the main function that is declared in a class must be
public and it should match with the file name.Since I already wrote it , Iam defining it as default class and i will
to access it.*/
class Public
{
    public
        int publicVar=1;

    private
        int privateVar=2;
    
    protected
        int protectedVar=3;

    public
        int getPrivate()
        {
            return privateVar;
        }
}

/*private class Private
{
}*/
//We can't take a top-level class as private because it would be completely useless as nothing would have access to it.

/*protected class Protected
{
}*/
//We can't take a top-level class as protected because it would be completely useless.

public class InheritanceAccess
{
    public static void main(String[] args)
    {
        Public pub=new Public();
        System.out.print("Public : "+pub.publicVar+"\n");
        //System.out.print("Public : "+pub.privateVar);
        //We cannot access the privateVar because it is private i.e, accessible only within the class.
        System.out.print("Private : "+pub.getPrivate()+"\n");
        System.out.print("Protected : "+pub.protectedVar+"\n");
    }
}
