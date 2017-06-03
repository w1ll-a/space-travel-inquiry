import javax.swing.*;
import java.awt.*;

public class InfoWindow extends Window
{
    private JTextField tf;

    public InfoWindow(int x, int y, String title){
        super(x, y, title);
    }

    public void format(){
        JPanel bl = new JPanel(new BorderLayout());
        tf = new JTextField();
        JButton done = new JButton("Done");

        frame.add(bl);
        bl.add(tf, BorderLayout.NORTH);
        bl.add(done, BorderLayout.SOUTH);
    }

    public void setText(String text){
        tf.setText(text);
    }

    public void addInfo(Info i){
        tf.setText(i.getInfo());
    }
}