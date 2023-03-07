//If an error occur, use try...catch to catch the error and execute some code to handle it:
public class JavaTryKeyword {
    //The try keyword creates a try...catch statement.
    //The try statement allows you to define a block of code to be tested for errors while it is being executed.
    //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
  
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
