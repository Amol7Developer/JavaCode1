public class JavaFinalKeyword {
  final int x = 10;

//The final keyword is a non-access modifier used for classes, attributes and methods, which makes them non-changeable (impossible to inherit or override).
//The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
//The final keyword is called a "modifier". 

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}