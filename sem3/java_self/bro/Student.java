public class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Name : Nikhil
    // Roll No : 101
    // Marks : 91.5
    void display(){
        System.out.print("Name : " +name + "\n" + "Roll No : " + rollNo + "\n" + "Marks : " + marks);
    }

    boolean isPassed(){
        return this.marks >= 40
    }
    
}
