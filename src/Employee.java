public class Employee {
    private String EmpName;
    private int EmpAge;
    private String EmpEmail;
    private long EmpPhoneNumber;
    private String EmpGender;
    private String EmpRace;
    public void setEmpName(String name) {
        this.EmpName = name;
    }
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpAge(int age) {
        this.EmpAge = age;
    }
    public int getEmpAge() {
        return EmpAge;
    }
    public void setEmpEmail(String email) {
        this.EmpEmail = email;
    }
    public String getEmpEmail() {
        return EmpEmail;
    }
    public void setEmpPhoneNumber(int phoneNumber) {
        this.EmpPhoneNumber = phoneNumber;
    }
    public long getEmpPhoneNumber() {
        return EmpPhoneNumber;
    }
    public void setEmpGender (String gender){
        this.EmpGender= gender;
    }
    public String getEmpGender(){
        return EmpGender;
    }
    public void setEmpRace(String race){
        this.EmpRace= race;
    }
    public String getEmpRace(){
        return EmpRace;
    }
}
