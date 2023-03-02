public class JavaBreakKeyword {
  public static void main(String[] args) {
    
System.out.println("The break keyword is used to break out a for loop, a while loop or a switch block.");

System.out.println("Beak out the for loop example:");
    //End the loop when i is equal to 4:
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  
  

System.out.println("Beak out the while loop example:");
//Break out of a while loop:
 int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 4) {
        break;
      }
    }  

  }
}