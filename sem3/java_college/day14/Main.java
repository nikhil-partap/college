public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nikhil", "nikhil@example.com", "secret123",
                UserRole.STUDENT, "STU-001", "Computer Science", 8.5, 2027, "resume.pdf");
        Company company = new Company(1, "Tech Corp", "Software", "Bengaluru", "https://tech.example");
        Recruiter recruiter = new Recruiter(2, "Riya", "riya@tech.example", "secret123",
                UserRole.RECRUITER, "REC-001", "Talent Lead", company);
        Job job = recruiter.createJob(new Job(1, "Java Developer", "Build backend services",
                JobType.FULL_TIME, "Bengaluru", 90000, 85000, "Java, SQL"));

        student.addSkill(new Skill(1, "Java", "Programming"));
        student.addProject(new Project(1, "CampusHire", "Job portal", "Java application", "GitHub"));
        Application application = student.applyForJob(job);
        recruiter.shortlistApplicant(application);

        System.out.println(student.getProfile());
        System.out.println(application.getStatus());
    }
}
