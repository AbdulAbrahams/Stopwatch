import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class Pause extends JFrame implements KeyListener{

    public boolean cancel = false;
    public String letter;
    Pause(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(0,0);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
         letter = String.valueOf(e.getKeyChar());
        System.out.println("stop");
        if (letter.toString() != null){
            cancel = true;
        }
    }
}
