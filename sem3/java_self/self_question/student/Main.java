    // package self_question.student;


    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student("Nikhil", 85);
            Student s2 = new Student("Aman", 78);
            Student s3 = new Student("Riya", 92);

            s1.display();
            s2.display();
            s3.display();

            System.out.println("Total students created: "+Student.count);
        }
    }
