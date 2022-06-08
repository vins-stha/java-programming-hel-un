public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public PaymentCard() {
        this.balance = 0;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        // write code here
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;
        } else {
            this.balance = this.balance;
        }
    }

    public void eatHeartily() {
        // write code here
        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        } else {
            this.balance = this.balance;
        }
    }

    public void addMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        }
        this.balance += amount;
        if (this.balance > 150) {
            this.balance = 150;
        }
    }
}