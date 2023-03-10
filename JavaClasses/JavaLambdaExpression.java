import java.util.ArrayList;
//Lambda expressions are usually passed as parameters to a function:
//Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
public class JavaLam {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}