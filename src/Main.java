
import java.util.Scanner;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Counter stopwatch = new Counter();
        Pause pause = new Pause();

        System.out.println("Press any key to stop");
        wait(1100);
        System.out.println("3");
        wait(500);
        System.out.println("2");
        wait(500);
        System.out.println("1");
        wait(500);
        System.out.println("Go");
        wait(500);

        while (true) {
                System.out.println(stopwatch);
                stopwatch.add();

            try {
                Thread.sleep(16);
            } catch (Exception e) {

            }
            if (pause.cancel == true){
                break;
            }
        }
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}