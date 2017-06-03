import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoWindow
{
    private JFrame frame;
    private static JLabel l = new JLabel();

    public InfoWindow(int x, int y, String title){
        frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(800, 600));
        frame.setDefaultLookAndFeelDecorated(true);

        JPanel bl = new JPanel(new BorderLayout());

        JButton done = new JButton("Done");
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(bl);
        bl.add(l, BorderLayout.NORTH);
        bl.add(done, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    public void setText(String text){
        l.setText(text);
    }

    public static void addInfo(Info i){
        l.setText(i.getInfo());
    }
}