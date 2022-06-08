public class Gauge {
    private int value;

    public Gauge(int value) {
        this.value = value;

    }

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        this.value = this.value + 1;
        if (this.value >= 5) {
            this.value = 5;
        }
    }

    public void decrease() {
        this.value = this.value - 1;
        if (this.value < 0) {
            this.value = 0;
        }

    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return (this.value == 5);
    }
}