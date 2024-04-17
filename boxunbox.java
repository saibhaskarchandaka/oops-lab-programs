public class ex {
public static void main(String[] args) 
{
    // Boxing: Converting int to Integer
    int primitiveInt = 10;
    Integer wrappedInt = Integer.valueOf(primitiveInt);
    // Unboxing: Converting Integer to int
    int unwrappedInt = wrappedInt.intValue();
    System.out.println("Boxed value: " + primitiveInt);
    System.out.println("Unboxed value: " + wrappedInt);
    // Boxing and Unboxing with method parameters
    Integer boxedValue = boxPrimitive(20);
    int unboxedValue = unboxWrapper(boxedValue);
    System.out.println("Boxed value: " + boxedValue);
    System.out.println("Unboxed value: " + unboxedValue);
}
// Method to box primitive int to Integer
public static Integer boxPrimitive(int value) 
{
    return Integer.valueOf(value);
}
// Method to unbox Integer to primitive int
public static int unboxWrapper(Integer value) 
{
    return value.intValue();
}
}
