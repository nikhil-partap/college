public class CampusHireException extends Exception {
    private final String message;

    public CampusHireException(String message) {
        super(message);
        this.message = message;
    }

    public CampusHireException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    public String getErrorMessage() {
        return message;
    }
}
