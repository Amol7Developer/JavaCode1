public class JavaContinueKeyword {
  public static void main(String[] args) {

    //Skip the iteration if the variable i is 4, but continue with the next iteration:
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  

    
    //The continue keyword is used to end the current iteration in a for loop (or a while loop), and continues to the next iteration.
int i = 0;
while (i < 10) {
  if (i == 4) {
    i++;
    continue;
  }
  System.out.println(i);
  i++;
}


  }
}
