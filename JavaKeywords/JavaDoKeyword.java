public class JavaDoKeyword {
  public static void main(String[] args) {

    //The following loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
    //Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
    int i = 0;
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  
  }
}
