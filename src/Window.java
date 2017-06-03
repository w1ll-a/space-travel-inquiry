import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener
{
    protected JFrame frame;
    Info early = Data.earlyTrav;

    public Window(int x, int y, String title){
        frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        frame.setPreferredSize(new Dimension(1000, 800));

        JPanel header = new JPanel(new BorderLayout());
        JPanel gl = new JPanel(new GridLayout(2, 3));

        JLabel headerText = new JLabel("The History of Space Travel");
        header.add(headerText);

        JButton earlyTravel = new JButton("Early Space Travel");
        earlyTravel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                InfoWindow earlyInfo = new InfoWindow(800, 600, "Early Space Travel");

                earlyInfo.setText(early.getInfo());
            }
        });

        gl.add(earlyTravel);

        frame.add(header);
        frame.add(gl);

        frame.pack();
        frame.setVisible(true);
    }

    public void changeSize(int x, int y){
        frame.setPreferredSize(new Dimension(x, y));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("-");
    }
}