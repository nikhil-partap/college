// i have to create 3 thread pools with 3 theads each
// 3 runable classes 
// first thread pool -> claculate total marks of student
// 2nd thread pool -> print info 
// 3rd thread pool -> write student object to file

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import  java.io.FileWriter;

public class Student { // 10 objects

    int mathsMarks;
    int scienceMarks;
    int englishMarks;

    int totalMarks;

    String name;
    int rollNo;
    
    public Student(int mathsMarks, int scienceMarks, int englishMarks, String name, int rollNo) {
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
        this.englishMarks = englishMarks;
        this.name = name;
        this.rollNo = rollNo;
    }

    // public int getTotalMarks() {
    //     return mathsMarks + scienceMarks + englishMarks;
    // }

    public String getInfo() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Total Marks: " + totalMarks;
    }

}

public class Test {
    public static void main(String[] args) throws Exception {
        Student[] student = new Student[10];

        for (int i = 0; i < 10; i++) {
            student[i] = new Student((int) (Math.random() * 100), (int) (Math.random() * 100),
                    (int) (Math.random() * 100), "Student" + (i + 1), i + 1);
        }

        ExecutorService calculateTotal = Executors.newFixedThreadPool(3);
        ExecutorService PrintInfo = Executors.newFixedThreadPool(3);
        ExecutorService WriteToFile = Executors.newFixedThreadPool(3);

        calculateTotal.execute(() -> {
            for (int i = 0; i < 10; i++) {
                student[i].totalMarks = student[i].mathsMarks + student[i].scienceMarks + student[i].englishMarks;
            }
        });

        PrintInfo.execute(() -> {
            for (int i = 0; i < student.length; i++) {
                System.out.println(student[i].getInfo());
            }
        });

        WriteToFile.execute(() -> {
            for (int i = 0; i < student.length; i++) {
                FileWriter writer = new FileWriter("student" + (i + 1) + ".txt")
                writer.write(student[i].getInfo());
                writer.close();
            }
        });

        
    }
}


// try {
//     java.io.FileWriter writer = new java.io.FileWriter("student" + (i + 1) + ".txt");
//     writer.write(student[i].getInfo());
//     writer.close();
// } catch (Exception e) {
//     e.printStackTrace();
// }