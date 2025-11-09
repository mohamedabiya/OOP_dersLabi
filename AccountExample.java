public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account(
                "Name1",
                100.00
        );
        Account account2 = new Account("Name2", 200.00);
        Account account3 = new Account("Name3", 300.00);
        System.out.println("Account 1 Balance:"+ account.getBalance());
        System.out.println("Account 2 Balance:"+ account2.getBalance());
        System.out.println("Account 3 Balance:"+ account3.getBalance());
        System.out.println("Transferring Amount to another accounts");
        account.transfer(account2, 50.00);
        account.transfer(account3, 25.00);

        System.out.println("Account 1 Balance:"+ account.getBalance());
        System.out.println("Account 2 Balance:"+ account2.getBalance());
        System.out.println("Account 3 Balance:"+ account3.getBalance());
        System.out.println(account.getTransferredAmount());
    }
}