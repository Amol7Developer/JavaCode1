import java.util.ArrayList;
import java.util.Iterator;


//Iterators are designed to easily change the collections that they loop through.
// The remove() method can remove items from a collection while looping.
public class JavaIterator3 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();

    //Use an iterator to remove numbers less than 10 from a collection:
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);
  }
}
