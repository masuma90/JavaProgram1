

class MathCalculation {

    // Method with 2 integer parameters
    static int addition(int num1, int num2 )
    {
        return num1 + num2;
    }

   static int multiplication(int num1, int num2, int num3)
   {
       return num1 * num2 *num3;
   }
}

public class OverloadingTest {
    public static void main(String[] args)
    {
        System.out.println(MathCalculation.addition(3,2));
        System.out.println(MathCalculation.multiplication(3,2,5));
    }
}

