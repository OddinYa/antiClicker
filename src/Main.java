import javax.swing.*;

public class Main {
    public static void main(String[] args)  {

       JFrame frame = new JFrame();

        frame.setTitle("Press Enter to Exit");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        Application application = new Application(frame);

        frame.addKeyListener(application);

        frame.setFocusable(true);

        frame.add(new Application(frame));

        frame.setVisible(true);






    }
}