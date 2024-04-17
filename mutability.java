public class ex{
public static void main(String[] args)
{
    int a=10;

    System.out.println("original address : "+System.identityHashCode(a));
    a=20;//hence it is immutable we can change the values.
    System.out.println("changed variable : "+System.identityHashCode(a));
    String b="krishna";
    System.out.println("original address : "+System.identityHashCode(b));
    b=b.concat(" mohan");// hence it is immutable we can't change the value..
    System.out.println("modified variable : "+System.identityHashCode(b));
    StringBuffer x = new StringBuffer("krishna");
    System.out.println("original address : "+System.identityHashCode(x));
    x.append(" mohan");
    System.out.println("modified address : "+System.identityHashCode(x));//it is mutable we can modify.
    Integer original = 10;
    System.out.println("Original address: " + System.identityHashCode(original)); // Print original address
    // Increment the value
    Integer incremented = original + 1;
    System.out.println("Incremented address: " + System.identityHashCode(incremented)); //Print incremented address
    double a1=2.123;
    System.out.println("original variable : "+System.identityHashCode(a1));
    a1=1.234;//it is immutable.
    System.out.println("changed variable : "+System.identityHashCode(a1));
  }
}
