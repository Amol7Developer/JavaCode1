public class JavaDefaultKeyword {
  public static void main(String[] args) {

    //Specify some code to run if there is no case match in a switch block
    int day = 4;
    switch (day) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }    
  }
}
