import java.util.ArrayList;
//To remove an element, use the remove() method and refer to the index number:
public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.remove(0);
    System.out.println(cars);// [BMW, Ford, Mazda]
  } 
}
