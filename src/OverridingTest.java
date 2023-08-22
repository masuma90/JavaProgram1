
class Math1{
    public int addition(int a, int b){
         return a+b;
    }
}
class Math2 extends Math1 {
    public int addition(int a, int b) {
          return a+b+1;
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        Math2 obj= new Math2();
        int result= obj.addition(5,5);
        System.out.println(result);

    }
}