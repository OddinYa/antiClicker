import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Application extends JPanel implements KeyListener {
    private Robot robot;
    private boolean flag = false;
    private int i = 0;


    public Application() {
        try {
            robot = new Robot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void keyPressed(KeyEvent evt) {

        int keyCode = evt.getKeyCode();

        if (KeyEvent.VK_ENTER == keyCode) {
            flag = true;
            System.exit(0);
        } else if (KeyEvent.VK_SPACE == keyCode) {
            flag = false;
            loop();
        }
    }

    private void loop() {
        while (!flag) {

             robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
             robot.delay(2);
             robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
             i++;

            if(i>=1000){
                break;
            }

        } i = 0;


    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}