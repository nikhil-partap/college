public class Student extends Person {
    double gpa;

    Student(String first, String last, double marks){
        super(first, last);
        this.gpa = marks;
    }

    void displayDetails(){
        System.out.println("");
    }
    
    
}
