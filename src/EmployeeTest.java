public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setEmpName("jahan Masuma");
        employee1.setEmpAge(32);
        employee1.setEmpEmail("jahanmasuma@gmail.com");
        employee1.setEmpPhoneNumber(313277486);
        employee1.setEmpGender("Female");
        employee1.setEmpRace("Asian");

        Employee employee2 = new Employee();
        employee2.setEmpName("Aliaa Begum");
        employee2.setEmpAge(30);
        employee2.setEmpEmail("aliabegum@gmail.com");
        employee2.setEmpPhoneNumber(313657486);
        employee2.setEmpGender("Female");
        employee2.setEmpRace("Asian");

        System.out.println("Employee1  name is : " + employee1.getEmpName());
        System.out.println("Employee1 age is: " + employee1.getEmpAge());
        System.out.println("Employee1 Email is : " + employee1.getEmpEmail());
        System.out.println("Employee1 Phone number is : " + employee1.getEmpPhoneNumber());
        System.out.println("Employee1 gender is: "+ employee1.getEmpGender());
        System.out.println("Employee1 race is: "+ employee1.getEmpRace());

        System.out.println("\n");
        System.out.println("Employee2  name is : " + employee2.getEmpName());
        System.out.println("Employee2 age is: " + employee2.getEmpAge());
        System.out.println("Employee2 Email is : " + employee2.getEmpEmail());
        System.out.println("Employee2 Phone number is : " + employee2.getEmpPhoneNumber());
        System.out.println("Employee2 gender is: "+ employee2.getEmpGender());
        System.out.println("Employee2 race is: "+ employee2.getEmpRace());
    }
}
