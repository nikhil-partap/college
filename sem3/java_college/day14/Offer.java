import java.time.LocalDate;

public class Offer {
    private int offerId;
    private LocalDate offerDate;
    private double packageAmount;
    private LocalDate validTill;
    private OfferStatus status;

    public Offer(int offerId, LocalDate offerDate, double packageAmount, LocalDate validTill) {
        this.offerId = offerId;
        this.offerDate = offerDate;
        this.packageAmount = packageAmount;
        this.validTill = validTill;
        this.status = OfferStatus.PENDING;
    }

    public void accept() {
        status = OfferStatus.ACCEPTED;
    }

    public void reject() {
        status = OfferStatus.REJECTED;
    }

    public boolean isValid() {
        return status == OfferStatus.PENDING && !LocalDate.now().isAfter(validTill);
    }

    public OfferStatus getStatus() {
        return status;
    }
}
