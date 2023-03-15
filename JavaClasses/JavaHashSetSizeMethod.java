// Import the HashSet class
import java.util.HashSet;

//To find out how many items there are, use the size method:
public class JavaHashSetSizeMethod {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars.size());
  }
}
