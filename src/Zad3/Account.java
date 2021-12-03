package Zad3;

public class Account {
    private String owner, accountNumber;
    private int ballance;

    public Account(String owner, int ballance, String accountNumber) {
        this.owner = owner;
        this.ballance = ballance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void transfer(int amount) throws NotEnoughMoneyException {
        if (ballance>=amount) {
            ballance -= amount;
        }else{
            throw new NotEnoughMoneyException();
        }
    }
}
