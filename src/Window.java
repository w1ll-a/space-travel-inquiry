import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener
{
    protected JFrame frame;

    public Window(int x, int y, String title){
        frame = new JFrame(title);
        frame.setSize(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
    }

    public void changeSize(int x, int y){
        frame.setSize(x, y);
    }

    public void format(){
        JPanel header = new JPanel();
        JPanel gl = new JPanel(new GridLayout(2, 3));

        JTextArea headerText = new JTextArea("The History of Space Travel");
        header.add(headerText);

        JButton earlyTravel = new JButton("Early Space Travel");
        earlyTravel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                InfoWindow earlyInfo = new InfoWindow(800, 600, "Early Space Travel");

                earlyInfo.setText("");
            }
        });

        this.add(header);
        this.add(gl);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}