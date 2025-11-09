public enum CardType {
    VISA(3, 0.01, 1000.0),
    MASTERCARD(3, 0.01, 1000.0),
    AMEX(4, 0.02, 1000.0),
    DISCOVER(3, 0.01, 1000.0),
    TROY(3, 0.001, 20000.0);

    private final int securityCodeLength;
    private final double cashbackRate;
    private final double defaultCreditLimit;

    CardType(int securityCodeLength, double cashbackRate, double defaultCreditLimit) {
        this.securityCodeLength = securityCodeLength;
        this.cashbackRate = cashbackRate;
        this.defaultCreditLimit = defaultCreditLimit;
    }
    public int getSecurityCodeLength() {
        return securityCodeLength;
    }
    public double getCashbackRate() {
        return cashbackRate;
    }
    public double getDefaultCreditLimit() {
        return defaultCreditLimit;
    }
}
