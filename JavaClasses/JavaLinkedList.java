import java.util.LinkedList;
//The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
public class Main { 
  public static void main(String[] args) { 
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
