
public class Statistics {
    private int count;
    private int sum;

    public Statistics(int count) {
        this.count = count;
    }

    public Statistics() {
        this.sum = 0;
    }

    public void addNumber(int number) {

        this.sum += number;
        this.count = this.count + 1;

        return;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.count > 0) {
            return (double) this.sum / this.count;
        } else {
            return (double) this.sum;
        }
    }

}
