import java.util.ArrayList;

//The ArrayList class is a resizable array, which can be found in the java.util package.
//The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified.
//While elements can be added and removed from an ArrayList whenever you want.

public class ArraylistAddMethodCode { 
  public static void main(String[] args) { 
    //The ArrayList class has many useful methods.
    //For example, to add elements to the ArrayList, use the add() method:
    
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  } 
}
