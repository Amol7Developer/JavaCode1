//Since you're now working with objects, you can use certain methods to get information about the specific object.

//For example, the following methods are used to get the value associated with the corresponding wrapper object:
// intValue(), byteValue(), shortValue(), longValue(), 
//floatValue(), doubleValue(), charValue(), booleanValue().

public class JavaWrapperMethods { 
  public static void main(String[] args) { 
    Integer myInt = 5; 
    Double myDouble = 5.99; 
    Character myChar = 'A'; 
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
