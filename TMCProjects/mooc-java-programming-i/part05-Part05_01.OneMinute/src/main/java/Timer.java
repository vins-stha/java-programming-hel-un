public class Timer {
    private ClockHand hundredth;
    private ClockHand second;


    public Timer() {
        this.hundredth = new ClockHand(100);
        this.second = new ClockHand(60);
    }

    public void advance()
    {
        this.hundredth.advance();
        if(this.hundredth.value() == 0) {
            this.second.advance();
        }

    }
    @Override
    public String toString() {
        return
                second +
                        ":" + hundredth;
    }
}
