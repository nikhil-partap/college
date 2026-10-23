import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private int studentId;
    private String registrationNo;
    private String branch;
    private double cgpa;
    private int graduationYear;
    private String resumePath;
    private final List<Skill> skills = new ArrayList<>();
    private final List<Project> projects = new ArrayList<>();
    private final List<Application> applications = new ArrayList<>();
    private final List<Interview> interviews = new ArrayList<>();
    private final List<Offer> offers = new ArrayList<>();
    private final List<Notification> notifications = new ArrayList<>();

    public Student(int userId, String name, String email, String password, UserRole role,
            String registrationNo, String branch, double cgpa, int graduationYear, String resumePath) {
        super(userId, name, email, password, role);
        this.studentId = userId;
        this.registrationNo = registrationNo;
        this.branch = branch;
        this.cgpa = cgpa;
        this.graduationYear = graduationYear;
        this.resumePath = resumePath;
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void removeSkill(int skillId) {
        skills.removeIf(skill -> skill.getSkillId() == skillId);
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(int projectId) {
        projects.removeIf(project -> project.getProjectId() == projectId);
    }

    public List<Job> searchJobs(String keyword) {
        return List.of();
    }

    public Application applyForJob(Job job) {
        if (!job.isEligible(this))
            throw new IllegalArgumentException("Student is not eligible for this job");
        Application application = new Application(applications.size() + 1, this, job);
        applications.add(application);
        return application;
    }

    public List<Application> viewApplications() {
        return List.copyOf(applications);
    }

    public List<Interview> viewInterviews() {
        return List.copyOf(interviews);
    }

    public List<Offer> viewOffers() {
        return List.copyOf(offers);
    }

    public List<Notification> viewNotifications() {
        return List.copyOf(notifications);
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getStudentId() {
        return studentId;
    }
}
