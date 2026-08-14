// package self_question.student;

public class Student {
    String name;
    int marks;

    static String college = "Chitkara";
    static int count = 0;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
        count ++;

    }

    void display(){
        System.out.println("Name: " + this.name +"\n" + "Marks: " + this.marks + "\n" + "college: " + college);
    }
    
}
