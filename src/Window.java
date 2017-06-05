import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window extends JFrame implements ActionListener
{
    protected JFrame frame;
    Info early = Data.earlyTrav;
    Info cold = Data.coldWar;

    public Window(int x, int y, String title){
        frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        frame.setPreferredSize(new Dimension(1000, 800));

        JPanel header = new JPanel(new BorderLayout());
        JPanel glp = new JPanel();
        GridLayout gl = new GridLayout(2, 6);
        glp.setLayout(gl);

        JLabel headerText = new JLabel("The History of Space Travel");
        header.add(headerText);
//-----------------------------------buttons---------------------------------------
        JButton earlyTravel = new JButton("Early Space Travel");
        earlyTravel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                InfoWindow earlyInfo = new InfoWindow("Early Space Travel");

                earlyInfo.setText(early.getInfo());
                earlyInfo.addImg(early);
            }
        });


        JButton coldWar = new JButton("Cold War Space Travel");
        coldWar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow coldWarInfo = new InfoWindow("Cold War Space Travel");

                coldWarInfo.setText(cold.getInfo());
                coldWarInfo.addImg(cold);
            }
        });

        JButton b = new JButton("test");

        JButton c = new JButton("test2");
//---------------------------------------------------------------------------------

        glp.add(earlyTravel);
        glp.add(coldWar);
        glp.add(b);
        glp.add(c);

        gl.setVgap(20);

        frame.add(header, BorderLayout.PAGE_START);
        frame.add(glp);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void changeSize(int x, int y){
        frame.setPreferredSize(new Dimension(x, y));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("-");
    }
}
