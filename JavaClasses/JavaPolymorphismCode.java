class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

//Now we can create Cat and Dog objects and call the animalSound() method on both of them

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

//Why And When To Use "Inheritance" and "Polymorphism"?
//It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

class JAvaPolymorphismCode {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myCat = new Cat();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myCat.animalSound();
    myDog.animalSound();
  }
}
