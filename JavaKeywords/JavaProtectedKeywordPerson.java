//The Student subclass accesses a Person class with protected attributes:
class JavaProtectedKeywordPerson {
  protected String fname = "John";
  protected String lname = "Doe";
  protected String email = "john@doe.com";
  protected int age = 24;
}

//The protected keyword is an access modifier used for attributes, methods and constructors, making them accessible in the same package and subclasses.

class Student extends JavaProtectedKeywordPerson {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
  }
}
