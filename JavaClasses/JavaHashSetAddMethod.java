//A HashSet is a collection of items where every item is unique,
// and it is found in the java.util package:
// Import the HashSet class
import java.util.HashSet;

//The HashSet class has many useful methods.
// For example, to add items to it, use the add() method:
public class JavaHashSetAddMethod {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");

    //Note: In the example above,
    // even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
    System.out.println(cars);
  }
}
