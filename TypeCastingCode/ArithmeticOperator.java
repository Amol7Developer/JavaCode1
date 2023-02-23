public class ArithmeticOperator {
  public static void main(String[] args) {
    int x = 6, x1 = 12;
    int y = 3, y1 = 3;
    
    //Arithmetic Operators
    //Arithmetic operators are used to perform common mathematical operations.
    System.out.println("Addition: Adds together two values X="+x+", y="+y+" and X+Y:");
    System.out.println(x + y);

    System.out.println("Subtraction: Subtracts one value from another x - y:");
    System.out.println(x - y);

    System.out.println("Multiplication:	Multiplies two values	x * y:");
    System.out.println(x * y);

    System.out.println("Division: Divides one value by another X1="+x1+", Y1="+y1+" and x1 / y1:");
    System.out.println(x1 / y1);

    System.out.println("Modulus: Returns the division remainder	x % y:");
    System.out.println(x % y);

    System.out.println("Increment: Increases the value of a variable by 1 ++x:");
    ++x;
    System.out.println(x);

    System.out.println("Decrement: Decreases the value of a variable by 1 --x:");
    --x;
    System.out.println(x);


  }   
}