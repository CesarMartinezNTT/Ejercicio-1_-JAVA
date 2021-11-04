public class Account {

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public double  deposit(double monto)
    {
        balance = balance + monto;
        return balance;
    }

    public double  withdraw(double monto)
    {
        if(this.balance < monto )
        {
            return balance;
        }
        else {
            balance = balance - monto;
            return balance;
        }
    }
}