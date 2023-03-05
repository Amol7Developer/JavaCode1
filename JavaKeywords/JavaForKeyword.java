public class Main {
  public static void main(String[] args) {

//The for loop loops through a block of code a number of times.
//From the example above:
//Statement 1 sets a variable before the loop starts (int i = 0).
//Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.
//Statement 3 increases a value (i++) each time the code block in the loop has been executed.
System.out.println("Example of For Loop :")

    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }  

//There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
//The following example outputs all elements in the cars array, using a "for-each" loop:

System.out.println("Example of For-each Loop :")

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }    
 



  }
}
