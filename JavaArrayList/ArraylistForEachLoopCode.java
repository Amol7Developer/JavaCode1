public class ArraylistForEachLoopCode {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

//an ArrayList with the for-each loop:

    for (String i : cars) {
      System.out.println(i);
    }
  }
}