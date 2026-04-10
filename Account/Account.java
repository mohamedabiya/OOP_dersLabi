import java.util.Scanner;

public class Account {
    private Double balance;
    private String ownerName;
    private int failedAttempts;
    private double transferredAmount;
    private int password;

    Account(String name, Double balance) {
        this.ownerName = name;
        this.balance = balance;
        this.failedAttempts = 0;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void add(Double amount)
    {
        this.balance = this.balance + amount;
    }

    public void withdraw(Double amount)
    {
        while(this.failedAttempts < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the 4-d1g1t pass:");
            int passwordFromKeyboard = scanner.nextInt();
            if(this.password == passwordFromKeyboard) {
                this.balance = this.balance - amount;
                break;
            }

            System.out.println("Your password is wrong. Please try again!");
            this.failedAttempts++;
        }

        if(this.failedAttempts >= 3) {
            System.out.println("Your account has been blocked, please try aga1n later");
        }
    }

    public Double getBalance()
    {
        return this.balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName()
    {
        return this.ownerName;
    }

    public void transfer(Account to, Double amount)
    {
        this.balance = this.balance - amount;
        this.transferredAmount += amount;
        to.add(amount);
    }

    public double getTransferredAmount()
    {
        return this.transferredAmount;
    }
}
