public class Job {
    private int jobId;
    private String title;
    private String description;
    private JobType jobType;
    private String location;
    private double salary;
    private double minimumCGPA;
    private String eligibilityCriteria;
    private String postedOn;
    private String lastDate;
    private boolean active = true;
    private Company company;

    public Job(int jobId, String title, String description, JobType jobType, String location,
            double salary, double minimumCGPA, String eligibilityCriteria) {
        this.jobId = jobId;
        this.title = title;
        this.description = description;
        this.jobType = jobType;
        this.location = location;
        this.salary = salary;
        this.minimumCGPA = minimumCGPA;
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public boolean isEligible(Student student) {
        return active && student.getCgpa() >= minimumCGPA;
    }

    public void updateDetails(String title, String description, double salary) {
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    public void closeJob() {
        active = false;
    }

    public boolean isOpen() {
        return active;
    }

    public int getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
