class Account {
    private int accno, balance;

    public Account(int an, int bl) {
        accno = an;
        balance = bl;
    }

    public void showData() {
        System.out.println("Account No is " + accno);
        System.out.println("Balance is " + balance);
    }

    public void deposit(int amt) {
        balance = balance + amt;
    }

    public void withdraw(int amt) {
        balance = balance - amt;
    }

}

public class Lec_01 {
    public static void main(String[] args) {
        Account a = new Account(4117, 2500);
        a.showData();
        a.deposit(7000);
        a.withdraw(2000);
        a.deposit(4000);
        a.showData();
    }
}
