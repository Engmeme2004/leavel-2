package javaapplication18;

public class BankAccount {

    private int balance;
    private String currency;

    public BankAccount() {
    }

    public BankAccount(int balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    static void printBycurrency(BankAccount[] arr, String currency) {
        for (int i = 0; i < arr.length; i++) {
            if (currency.equalsIgnoreCase(arr[i].currency)) {
                System.out.println(arr[i]);
            }
        }
    }

    static BankAccount[] getHighBalances(BankAccount[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].balance > 1000000) {
                count++;
            }
        }
        BankAccount[] temp = new BankAccount[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].balance > 1000000) {
                temp[idx++] = arr[i];
            }
        }
        return temp;
    }

    static void printTopThree(Object[] o) {
        if (!(o instanceof BankAccount[])) {
            return;
        }
        BankAccount[] arr = (BankAccount[]) o;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].balance < arr[j + 1].balance) {
                    BankAccount temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        int count = Math.min(arr.length, 3);
        System.out.println("top balances : ");
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public void transfer(BankAccount target, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
        } else if (!this.currency.equals(target.currency)) {
            System.out.println("Currencies do not match.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient balance for transfer.");
        } else {
            this.balance -= amount;
            target.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", currency=" + currency + '}';
    }

}
