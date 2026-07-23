// Create a Java class named Student with the following requirements:

//     Instance variables: String name and int rollNumber.

//     A parameterized constructor that uses the this keyword to initialize both instance variables.

//     A method displayInfo() that prints the student's name and roll number.

//     A main method that creates a Student object and calls displayInfo().

// import test.student;

public class Student {
    String name;  
    int rollNumber;

    Student( String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void displayInfo(){
        System.out.println("Student Name: "+ this.name + "\n" + "Student Rollno: " + this.rollNumber);
    }

    public static void main(String[] args){
        Student s1 = new Student("Rahul", 2342);
        s1.displayInfo();
    }
}
