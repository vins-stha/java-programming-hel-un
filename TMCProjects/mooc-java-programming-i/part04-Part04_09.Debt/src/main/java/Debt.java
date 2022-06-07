public class Debt {
    private double interestRate;
    private double balance;

    public Debt(double initialBalance, double initialInterestRate) {
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.interestRate * this.balance ;
    }
}
