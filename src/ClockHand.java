public class ClockHand {

    private int value;
    private int max;

    public ClockHand(int max) {
        this.max = max;
        this.value = 0;
    }

    public void add() {
        this.value = this.value + 1;

        if (this.value >= this.max) {
            this.value = 0;
        }
    }
    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}