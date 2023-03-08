import java.util.ArrayList;
//Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:
public class Main { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    //for loop with size() method used
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));//get() method used.
    }
  } 
}

