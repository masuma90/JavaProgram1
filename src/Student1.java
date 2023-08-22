//Assignment 5
public class Student1 {
    private String studentName;
    private int studentId;
    private int studentGrade;

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }
    public int getStudentGrade()
    {
        return studentGrade;
    }
      public Student1( String studentName, int studentGrade, int studentId)
      {
      this.studentName = studentName;
      this.studentGrade = studentGrade;
      this.studentId = studentId;
        }

    public static void main(String[] args) {
        Student1 student = new Student1("Masuma", 5, 8);
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Id: " + student.getStudentId());
        System.out.println("grade " + student.getStudentGrade());


    }


}