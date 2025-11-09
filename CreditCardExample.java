public class CreditCardExample {
    public static void main(String[] args) {
        // in this example we are using CardType enum
        // to specify the type of credit card
        // we create a new credit card of type TROY
        // with a credit limit of 3000
        // then we perform some operations on the card
        // including charging amounts and making payments
        // we also handle exceptions for invalid operations
        // finally we print the card information before and after the operations
        // we learn enums, exception handling, and method usage in this example
        // check each class for more details
        CreditCard card = new CreditCard("1234567890123456", "Alice Johnson",
                12, 2026, CardType.TROY, 3000);

        card.printInfo();

        card.charge(500);

        try {
            card.charge(-10);
        } catch (Exception e) {
            System.out.println("Error during charge: " + e.getMessage());
        }


        card.makePayment(200);

        try {
            card.makePayment(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error during payment: " + e.getMessage());
        }

        card.printInfo();
    }
}
