public class BankAccount {
    private float balance;
    private String number;
    private String name;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount(float balance, String number, String name) {
        this.balance = balance;
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public float Deposit(float amt) {
        this.balance += amt;
        return this.balance;
    }

    public float Withdraw(float amt) {
        if (amt < this.balance) {
            this.balance -= amt;
        }
        return this.balance;
    }

    public boolean transfer(float amt, BankAccount depAccount) {
        if (this.balance > amt) {
            this.balance -= amt;
            depAccount.Deposit(amt);
            return true;
        }
        return false;
    }
}
