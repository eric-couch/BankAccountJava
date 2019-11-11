public class Bank {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount(100.00f,"0000001", "savings");
        BankAccount checking = new BankAccount(200.00f,"0000002", "checking");
        BankAccount moneyMarket = new BankAccount(1000.00f,"0000003", "money market");

        System.out.println(savings);
        System.out.println(checking);
        System.out.println(moneyMarket);

        savings.Deposit(5000.00f);
        checking.Deposit(10000.00f);
        moneyMarket.Withdraw(350.00f);

        System.out.println(savings);
        System.out.println(checking);
        System.out.println(moneyMarket);

        System.out.println("comparing checking and savings and " +
                ((checking.getBalance()>savings.getBalance())?"checking":"savings") + " is greater");

        System.out.printf("Bank Account " + savings.getName() +
                " has a balance of $%,.2f%n", savings.getBalance());

        boolean success = checking.transfer(200.00f, savings );

        if (success) {
            System.out.println("successful transfer");
        } else {
            System.out.println("unsuccessful transfer");
        }

        System.out.println(savings);
        System.out.println(checking);
        System.out.println(moneyMarket);
    }

}
