//The throws keyword indicates what exception type may be thrown by a method.
//There are many exception types available in Java: ArithmeticException, ClassNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.

//	Used to indicate what exception type may be thrown by a method
//Can declare multiple exceptions
//throws is followed by a class
//and used with the method signature

public class JavaThrowsKeyword {
  static void checkAge(int age) throws ArithmeticException { 
    if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old."); 
    } else {
      System.out.println("Access granted - You are old enough!"); 
    }
 } 
 
 public static void main(String[] args) { 
   checkAge(15); 
 } 
}
