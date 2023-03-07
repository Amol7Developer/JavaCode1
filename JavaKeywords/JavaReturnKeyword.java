public class JavaReturnKeyword {
  static int myMethod(int x) {
    return 5 + x;
  }

//The return keyword finished the execution of a method, and can be used to return a value from a method.

  public static void main(String[] args) {
    System.out.println(myMethod(3));
  }
}
