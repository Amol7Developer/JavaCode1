/* Code from filename: Main.java
public class Main {
  public String fname = "John";
  public String lname = "Doe";
  public String email = "john@doe.com";
  public int age = 24;
}
*/

//JavaPublicKeyword accesses a public Main class with public attributes:
class JavaPublicKeyword {
  public static void main(String[] args) {
    //The public keyword is an access modifier used for classes, attributes, methods and constructors, making them accessible by any other class.
    Main JavaPublicKeyword = new JavaPublicKeyword();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}