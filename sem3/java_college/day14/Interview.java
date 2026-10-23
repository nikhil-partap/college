import java.time.LocalDateTime;

public class Interview {
    private int interviewId;
    private String type;
    private LocalDateTime scheduledOn;
    private String mode;
    private String status;
    private InterviewStatus interviewStatus;

    public Interview(int interviewId, String type, LocalDateTime scheduledOn, String mode) {
        this.interviewId = interviewId;
        this.type = type;
        this.scheduledOn = scheduledOn;
        this.mode = mode;
        this.interviewStatus = InterviewStatus.SCHEDULED;
        this.status = interviewStatus.name();
    }

    public void updateStatus(InterviewStatus status) {
        this.interviewStatus = status;
        this.status = status.name();
    }

    public void addFeedback(String feedback) {
        this.status = feedback;
    }

    public void reschedule(LocalDateTime scheduledOn) {
        this.scheduledOn = scheduledOn;
    }

    public void cancel() {
        updateStatus(InterviewStatus.CANCELLED);
    }

    public InterviewStatus getInterviewStatus() {
        return interviewStatus;
    }
}
