public class Teacher {

    // state and behavior
    String name= "SQA Learning Academy"; //instance variable
    String gender;

    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        teacher.gender= "Male";
        teacher.teach();
    }
    public void teach(){
        System.out.println(gender);
        System.out.println(name);
    }

}
