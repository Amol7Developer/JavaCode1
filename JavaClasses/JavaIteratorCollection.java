import java.util.ArrayList;
import java.util.Iterator;

//To loop through a collection, use the hasNext() and next() methods of the Iterator:
public class JavaIteratorCollection {
  public static void main(String[] args) {
  
    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
  
    // Get the iterator
    Iterator<String> it = cars.iterator();
    
    // Loop through a collection
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
