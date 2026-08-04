public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Nikhil", 101, 91.5);
        Student s2 = new Student("Rahul", 102, 67.0);
        Student s3 = new Student("Aman", 103, 35.5);

        System.out.println("Student 1");
        s1.display();
        System.out.println("\nPassed : " + s1.isPassed());

        System.out.println("\n-----------------------");

        System.out.println("Student 2");
        s2.display();
        System.out.println("\nPassed : " + s2.isPassed());

        System.out.println("\n-----------------------");
        
        System.out.println("Student 3");
        s3.display();
        System.out.println("\nPassed : " + s3.isPassed());
    }
}