package java_college.day3;

public class run {


    // store record of 5 students - {name ,marks , age} then sum the marks of the students whose age is less than 20 and print the sum of marks. 
    public static void main(String[] args) {
        
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 85, 19);
        students[1] = new Student("Bob", 90, 21);
        students[2] = new Student("Charlie", 78, 18);
        students[3] = new Student("David", 92, 22);
        students[4] = new Student("Eve", 88, 17);

        int sumOfMarks = 0;
        for (Student student : students) {
            if (student.getAge() < 20) {
                sumOfMarks += student.getMarks();
            }
        }

        System.out.println("Sum of marks of students whose age is less than 20: " + sumOfMarks);
    }
}


class Student {
    private String name;
    private int marks;
    private int age;

    // Constructor to initialize the student data
    public Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    // Getter method for age
    public int getAge() {
        return this.age;
    }

    // Getter method for marks
    public int getMarks() {
        return this.marks;
    }
}
