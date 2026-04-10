public class CreditCard {
    private final String cardNumber;
    private final String cardHolder;
    private final int expiryMonth;
    private final int expiryYear;
    private final double creditLimit;
    private double availableCredit;
    private final CardStatus status;
    private final CardType type;

    public CreditCard(String cardNumber, String cardHolder,
                      int expiryMonth, int expiryYear,
                      CardType type, double creditLimit) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.type = type;
        this.creditLimit = creditLimit;
        this.availableCredit = creditLimit;
        this.status = CardStatus.ACTIVE;
    }

    public boolean isExpired() {
        int currentYear = 2025;
        int currentMonth = 11;

        if (expiryYear < currentYear) {
            return true;
        }
        return expiryYear == currentYear && expiryMonth < currentMonth;
    }

    public void charge(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if (isExpired()) {
            throw new IllegalArgumentException("Cannot charge: card is expired.");
        }
        if (status != CardStatus.ACTIVE) {
            throw new IllegalArgumentException("Cannot charge: card is not active.");
        }
        if (amount > availableCredit) {
            throw new IllegalArgumentException("Not enough credit available.");
        }

        availableCredit -= amount;
        System.out.println("Charge successful: $" + amount);
        System.out.println("Available credit: $" + availableCredit);
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment must be positive.");
        }

        availableCredit += amount;
        if (availableCredit > creditLimit) {
            availableCredit = creditLimit;
        }

        System.out.println("Payment received: $" + amount);
        System.out.println("Available credit: $" + availableCredit);
    }

    public void printInfo() {
        System.out.println("--------------------------");
        System.out.println("Cardholder: " + cardHolder);
        System.out.println("Card Number: **** **** **** " + getLast4Digits());
        System.out.println("Type: " + type);
        System.out.println("Expiry: " + expiryMonth + "/" + expiryYear);
        System.out.println("Status: " + status);
        System.out.println("Available Credit: $" + availableCredit + "/" + creditLimit);
        System.out.println("--------------------------");
    }

    private String getLast4Digits() {
        int length = cardNumber.length();
        return cardNumber.substring(length - 4);
    }
}
