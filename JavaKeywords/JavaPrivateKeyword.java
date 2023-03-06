public class JavaPrivateKeyword {
  private String fname = "John";
  private String lname = "Doe";
  private String email = "john@doe.com";
  private int age = 24;

//The private keyword is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.


  public static void main(String[] args) {
    JavaPrivateKeyword myObj = new JavaPrivateKeyword();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}
