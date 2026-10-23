public class Project {
    private int projectId;
    private String title;
    private String description;
    private String technologies;
    private String link;

    public Project(int projectId, String title, String description, String technologies, String link) {
        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.link = link;
    }

    public String getDetails() {
        return title + ": " + description;
    }

    public void setDetails(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getTitle() {
        return title;
    }

    public String getTechnologies() {
        return technologies;
    }

    public String getLink() {
        return link;
    }
}
