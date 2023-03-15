// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

//The iterator() method can be used to get an Iterator for any collection:
public class JavaIterator1 {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
  }
}