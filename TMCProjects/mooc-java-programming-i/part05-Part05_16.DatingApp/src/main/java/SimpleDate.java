
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    // move the date by one day assuming each month has 30 days
    public void advance() {

        if (this.day < 30) {
            this.day = this.day + 1;
        }
        else if (this.day == 30) {
            this.day = 1;
            if (this.month < 12) {
                this.month = this.month + 1;
            }
            if (this.month == 12) {
                this.month = 1;
                this.year = this.year + 1;
            }
        }
    }

    // move the date by one day assuming each month has 30 days
    public void advance(int howManyDays) {

//        if (howManyDays > 0)
        {
            for(int i = 0; i < howManyDays; i++)
            {
                this.advance();
            }
        }
    }

    // creates a new SimpleDate object whose date is the specified number of days greater than the object that the method was called on.
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate temp = new SimpleDate(this.day, this.month, this.year);
        this.advance(days);
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        this.day = temp.day;
        this.month = temp.month;
        this.year = temp.year;
        return newDate;
    }
}
