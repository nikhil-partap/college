package day15;

public class Employee {
    private String employeeId;
    private String fullName;
    private String email;
    private int phoneNumber;
    private String designation;
    private String department;
    private String skills;
    private String about;

    // constructor ha ye thik ha (or ye mane likha ha )
    Employee(int employeeId, String fullName, String email, int phoneNumber, String designation, String department,
            String skills, String about) {
        this.employeeId = employeeId;
        this.fullName = fullName.strip();
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.designation = designation;
        this.department = department;
        this.skills = skills;
        this.about = about;

    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getSkills() {
        return skills;
    }

    public String getAbout() {
        return about;
    }

}
