import java.util.List;

public class Admin extends User {
    private int adminId;

    public Admin(int userId, String name, String email, String password, UserRole role, int adminId) {
        super(userId, name, email, password, role);
        this.adminId = adminId;
    }

    public void manageUsers() {
    }

    public void manageCompanies() {
    }

    public void manageJobs() {
    }

    public void manageApplications() {
    }

    public void viewRecruitmentActivity() {
    }

    public List<String> generatePlacementReport() {
        return List.of("CampusHire placement report");
    }
}
