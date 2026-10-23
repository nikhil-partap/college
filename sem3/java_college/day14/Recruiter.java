import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Recruiter extends User {
    private int recruiterId;
    private String designation;
    private Company company;
    private final List<Job> jobs = new ArrayList<>();

    public Recruiter(int userId, String name, String email, String password, UserRole role,
            String recruiterId, String designation, Company company) {
        super(userId, name, email, password, role);
        this.recruiterId = userId;
        this.designation = designation;
        this.company = company;
    }

    public Job createJob(Job job) {
        job.setCompany(company);
        jobs.add(job);
        company.addJob(job);
        return job;
    }

    public void updateJob(Job job) {
        job.updateDetails(job.getTitle(), "Updated job", 0);
    }

    public void closeJob(Job job) {
        job.closeJob();
    }

    public List<Application> viewApplicants(Job job) {
        return List.of();
    }

    public void shortlistApplicant(Application application) {
        application.updateStatus(ApplicationStatus.SHORTLISTED);
    }

    public Interview scheduleInterview(Application application, LocalDateTime dateTime) {
        application.updateStatus(ApplicationStatus.INTERVIEW_SCHEDULED);
        return new Interview(1, "Technical", dateTime, "Online");
    }

    public Offer issueOffer(Application application) {
        application.updateStatus(ApplicationStatus.OFFERED);
        return new Offer(1, java.time.LocalDate.now(), 90000, java.time.LocalDate.now().plusDays(30));
    }

    public int getRecruiterId() {
        return recruiterId;
    }
}
