// public class Student1 {
//     int age;
//     String name;
//     static String collegeName;


//     public static void main(String[] args){
//         collegeName = "chitkara";
        
//         System.out.println(Student1.collegeName);
//         //  so static can be accessed by class name directly without creating object of class
//         // only static can acc
//         // why should we not use an object to access static variable - ans- because static variables belong to the class and not to any specific object of the class 
//         // but we can chage the value of static variable using object reference but it is not recommended because it can lead to confusion and unexpected behavior in the code. It is better to access static variables using the class name to make it clear that they belong to the class and not to any specific object.


//         // static variable can be accessed by static method and non static method but non static variable can only be accessed by non static method and not by static method because static method belongs to the class and not to any specific object of the class so it cannot access non static variable which belongs to specific object of the class.

//     }
// }



public class Student1 {

    int age; // this is a non static variable because it belongs to a specific object of the class
    String name;
    static String collegeName;

    // "this" in Java refers to the current object instance.
    // It is used to access instance variables and methods of the current object.
    Student1(String name, int age) {
        this.name = name; // this.name refers to the instance variable
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        collegeName = "Chitkara";
        Student1 student = new Student1("Nikhil", 20);
        student.printDetails();
        System.out.println("College: " + collegeName);
    }
}