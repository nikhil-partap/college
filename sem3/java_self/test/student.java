package test;

// import java_college.Student;

public class student {
  
  String name;
  int age;
  int rollNo;

  student(String Sname, int Sage, int SrollNo ){
    name = Sname;
    age = Sage;
    rollNo = SrollNo;
  }
    public static void main(String[] args) {
      student s1 = new student("Alex", 18, 101);
      
    }
}
