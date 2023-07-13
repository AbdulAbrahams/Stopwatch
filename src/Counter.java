public class Counter  {
    private ClockHand milSeconds;
    private ClockHand seconds;
    private ClockHand minutes;


    public Counter() {
        this.milSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
        this.minutes = new ClockHand(60);
    }

    public void add() {
        this.milSeconds.add();

        if(this.milSeconds.value() == 0){
            this.seconds.add();

            if(this.seconds.value() == 0){
                this.minutes.add();
            }
        }
    }

    public String toString() {

        return this.minutes + ":" + this.seconds + ":" + this.milSeconds;
    }

}