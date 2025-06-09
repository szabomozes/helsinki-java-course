public class Timer {
    ClockHand hundredthsOfASecond;
    ClockHand seconds;

    public Timer() {
        hundredthsOfASecond = new ClockHand(100);
        seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredthsOfASecond.advance();

        if (this.hundredthsOfASecond.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return (seconds + ":" + hundredthsOfASecond);
    }

}
