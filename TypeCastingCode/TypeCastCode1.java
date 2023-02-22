public class TypeCastCode1 {
    public static void main(String [] args){
        //Java Type Casting
        //In Java, there are two types of casting:
        
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        int myInt = 9;
            double myDouble = myInt; // Automatic casting: int to double

            System.out.println(myInt);
            System.out.println(myDouble);


        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        double myDouble = 9.78d;
            int myInt = (int) myDouble; // Manual casting: double to int

            System.out.println(myDouble);   // Outputs 9.78
            System.out.println(myInt);      // Outputs 9


    }
}