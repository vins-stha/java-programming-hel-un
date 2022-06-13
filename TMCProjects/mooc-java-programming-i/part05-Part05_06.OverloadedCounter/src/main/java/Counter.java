public class Counter {
    private int value;

    public Counter() {
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value = this.value + increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value = this.value - decreaseBy;
        }
    }


}
