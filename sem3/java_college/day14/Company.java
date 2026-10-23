import java.util.ArrayList;
import java.util.List;

public class Company {
    private int companyId;
    private String name;
    private String description;
    private String industry;
    private String location;
    private String website;
    private final List<Job> jobs = new ArrayList<>();

    public Company(int companyId, String name, String industry, String location, String website) {
        this.companyId = companyId;
        this.name = name;
        this.industry = industry;
        this.location = location;
        this.website = website;
    }

    public void updateDetails(String description, String location, String website) {
        this.description = description;
        this.location = location;
        this.website = website;
    }

    public void addJob(Job job) {
        if (!jobs.contains(job))
            jobs.add(job);
    }

    public void removeJob(int jobId) {
        jobs.removeIf(job -> job.getJobId() == jobId);
    }

    public List<Job> getJobs() {
        return List.copyOf(jobs);
    }

    public int getCompanyId() {
        return companyId;
    }

    public String getName() {
        return name;
    }
}
