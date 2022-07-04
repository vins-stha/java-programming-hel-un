
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    // returns a new money object that is worth the total amount of the object
    // whose method was called and the object that is received as the parameter.
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    // returns true if the money-object on which the method is called on has a
    // lesser value than the money object given as a parameter.
    public boolean lessThan(Money compare) {
        if (this.euros < compare.euros) {
            return true;
        }
        if (this.euros == compare.euros) {
            if (this.cents < compare.cents) {
                return true;
            }
        }
        return false;
    }

    //  returns a new money object worth the difference of the object whose method
    //  was called and the object received as the parameter.
    public Money minus(Money decreaser) {
        int euros = 0;
        int cents = 0;
        boolean carry = false;
        Money tempThis = new Money(this.euros, this.cents);
        if (tempThis.cents >= decreaser.cents) {
            cents = tempThis.cents - decreaser.cents;
        } else {
            cents = (tempThis.cents + 100) - decreaser.cents;
            carry = true;
        }

        if (this.euros < decreaser.euros) {
            euros = 0;
            cents = 0;
        }
        if (!carry && this.euros >= decreaser.euros) {
            euros = this.euros - decreaser.euros;
        }
        if (carry && this.euros > decreaser.euros) {
            euros = this.euros - 1 - decreaser.euros;
        }

        Money newMoney = new Money(euros, cents);
        return newMoney;

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
