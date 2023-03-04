class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class JavaExtendsCar extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    JavaExtendsCar myFastCar = new JavaExtendsCar();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}
