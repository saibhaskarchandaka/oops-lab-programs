import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy
{
    public static void main(String[] args)
    {
        
        try(FileInputStream obj1=new FileInputStream("src.txt");
            FileOutputStream obj2=new FileOutputStream("dest.txt");)
        {
            while(obj1.available()>0)
            {
                obj2.write(obj1.read()); 
            }
            System.out.println("Successfully Copied!");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found : "+e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("Error copying file : "+e.getMessage());
        }
    }
}
