import java.time.LocalDateTime;

public class Notification {
    private int notificationId;
    private String message;
    private NotificationType type;
    private LocalDateTime createdOn;
    private boolean isRead;

    public Notification(int notificationId, String message, NotificationType type) {
        this.notificationId = notificationId;
        this.message = message;
        this.type = type;
        this.createdOn = LocalDateTime.now();
    }

    public void markAsRead() {
        isRead = true;
    }

    public void markAsUnread() {
        isRead = false;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public String getMessage() {
        return message;
    }

    public NotificationType getType() {
        return type;
    }

    public boolean isRead() {
        return isRead;
    }
}
