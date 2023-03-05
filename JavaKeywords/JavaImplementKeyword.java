
Result Size: 625 x 446
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}
​
//An interface is an abstract "class" that is used to group related methods with "empty" bodies:
//The implements keyword is used to implement an interface.
//The interface keyword is used to declare a special type of class that only contains abstract methods.
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class.

class Cat implements Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}
​
class JavaImplementKeyword {
  public static void main(String[] args) {
    Cat myCat = new Cat();
    myCat.animalSound();
    myCat.sleep();
  }
}
