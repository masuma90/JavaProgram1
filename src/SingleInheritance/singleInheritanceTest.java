package SingleInheritance;

class Vehicles{
    void model(){

        System.out.println("Toyota");
    }
}
class Train extends Vehicles{
    void trainName(){
        System.out.println(" juju");
    }
}
public class singleInheritanceTest {

    public static void main(String[] args) {
        Train t = new Train();
        t.model();
        t.trainName();

    }
}

