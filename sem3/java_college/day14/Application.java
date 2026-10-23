import java.time.LocalDate;

public class Application {
    private int applicationId;
    private LocalDate appliedOn;
    private ApplicationStatus status;
    private String remarks;
    private final Student student;
    private final Job job;

    public Application(int applicationId, Student student, Job job) {
        this.applicationId = applicationId;
        this.student = student;
        this.job = job;
        this.appliedOn = LocalDate.now();
        this.status = ApplicationStatus.APPLIED;
    }

    public void updateStatus(ApplicationStatus status) {
        this.status = status;
    }

    public void addRemark(String remark) {
        this.remarks = remark;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public LocalDate getAppliedOn() {
        return appliedOn;
    }

    public Student getStudent() {
        return student;
    }

    public Job getJob() {
        return job;
    }

    public String getRemarks() {
        return remarks;
    }

    public int getApplicationId() {
        return applicationId;
    }
}
