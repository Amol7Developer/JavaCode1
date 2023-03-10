public class JavaStaticKeyword {
  //A static method can be accessed without creating an object of the class first:
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }
  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

 //The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class.
 // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    JavaStaticKeyword myObj = new JavaStaticKeyword(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
