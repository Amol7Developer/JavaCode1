import java.util.ArrayList;
//To modify an element, use the set() method and refer to the index number:
public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.set(0, "Opel");
    System.out.println(cars); //output:[Opel, BMW, Ford, Mazda]
  } 
}
