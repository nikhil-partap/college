
abstract class User implements Authenticatable {
    protected int userId;
    protected String name;
    protected String email;
    protected String password;
    protected UserRole role;
    protected boolean active;

    protected User(int userId, String name, String email, String password, UserRole role) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.active = true;
    }

    @Override
    public boolean login(String email, String password) {
        boolean validLogin = active && this.email.equals(email) && this.password.equals(password);
        if (validLogin) {
            System.out.println("Login successful");
        }
        return validLogin;
    }

    @Override
    public void logout() {
        System.out.println("Logged out");
    }

    public String getProfile() {
        return "User{id=" + userId + ", name='" + name + "', email='" + email
                + "', role=" + role + ", active=" + active + "}";
    }

    public void updateProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
