    public class Employee extends Person {
    int salary;
    String empId;

    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 25, 50000, "E101");
        e1.getEmpInfo();
    }

    Employee(String name, int age, int salary, String empId) {
        super(name, age);  // super keyword is used to call the constructor of the parent class (Person) to initialize the name and age fields.
        this.salary = salary;
        this.empId = empId;
    }
    // function overloading
    void getEmpInfo(String name) {
        System.out.println("Employee Name: " + name);
    }

    void getEmpInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee ID: " + empId);
    }
}
