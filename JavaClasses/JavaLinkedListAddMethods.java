import java.util.LinkedList;

//The LinkedList stores its items in "containers.

public class JavaLinkedListAddMethods {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    
    // Use addFirst() to add the item to the beginning
    cars.addFirst("Mazda");
    System.out.println(cars);

    // Use addLast() to add the item to the end
    cars.addLast("Mazda");
    System.out.println(cars);
  }
}
