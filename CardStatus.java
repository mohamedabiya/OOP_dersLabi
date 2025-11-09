public enum CardStatus {
    ACTIVE("Card is active"),
    BLOCKED("Card is blocked"),
    EXPIRED("Card is expired");

    private final String description;

    CardStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}