abstract class Car {
    abstract void start();
    void stop() {
        System.out.println("Car stopped");
    }
    void go(){
        System.out.println("car going");
    }
}
class Toyota extends Car {
    @Override
    void start() {
        System.out.println("Toyota started");
    ;
    }
}
class Honda extends Car {
    @Override
    void start() {
          
        System.out.println("\n" +"Honda started");

    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Car Toyota = new Toyota();
        Toyota.start();
        Toyota.stop();
        Toyota.go();

        Car Honda = new Honda();
        Honda.start();
        Honda.stop();
        Honda.go();

    }
}
