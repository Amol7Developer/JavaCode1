public class JavaElseKeyword {
  public static void main(String[] args) {
   // The else statement specifies a block of Java code to be executed if a condition is false in an if statement.
    //Java has the following conditional statements:

//1.Use if to specify a block of code to be executed, if a specified condition is true
// 2. Use else to specify a block of code to be executed, if the same condition is false
//Use else if to specify a new condition to test, if the first condition is false
//Use switch to specify many alternative blocks of code to be executed
  
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    }  else {
      System.out.println("Good evening.");
    }
  }
}
