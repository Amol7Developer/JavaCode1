import java.util.HashMap;

//Loop through the items of a HashMap with a for-each loop.
// Use the keySet() method if you only want the keys
public class JavaHashMapKeySetMethod {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }
  }
}
