import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener
{
    protected JFrame frame;

    public Window(int x, int y, String title){
        frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        frame.setPreferredSize(new Dimension(x, y));

        JPanel header = new JPanel(new BorderLayout());
        JPanel glp = new JPanel();
        JPanel fill1 = new JPanel();
        JPanel fill2 = new JPanel();
        GridLayout gl = new GridLayout(2, 6);
        glp.setLayout(gl);

        JLabel headerText = new JLabel("The History of Space Travel", SwingConstants.CENTER);
        headerText.setFont((new Font("Trajan Pro", Font.PLAIN, 30)));
        header.add(headerText);

//-----------------------------------buttons---------------------------------------
        JButton earlyTravel = new JButton("Early Space Travel");
        earlyTravel.setBackground(Color.GRAY);
        earlyTravel.setForeground(Color.WHITE);
        earlyTravel.setFocusPainted(false);

        earlyTravel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                InfoWindow earlyInfo = new InfoWindow("Early Space Travel");

                earlyInfo.addInfo(Data.earlyTrav);
                earlyInfo.getFrame().add(new ImagePanel("media\\vostok1launch.jpg"));
            }
        });


        JButton coldWar = new JButton("Cold War Space Travel");
        coldWar.setBackground(Color.GRAY);
        coldWar.setForeground(Color.WHITE);
        coldWar.setFocusPainted(false);

        coldWar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow coldWarInfo = new InfoWindow("Cold War Space Travel");

                coldWarInfo.addInfo(Data.coldWar);
                coldWarInfo.getFrame().add(new ImagePanel("media\\usmoonlanding.jpg"));
            }
        });

        JButton sources = new JButton("Sources");
        sources.setBackground(Color.GRAY);
        sources.setForeground(Color.WHITE);
        sources.setFocusPainted(false);
        
        sources.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow sources = new InfoWindow("Sources");
                
                sources.addInfo(Data.sources);
            }
        });

        JButton c = new JButton("test2");

        JButton d = new JButton("test3");
//---------------------------------------------------------------------------------

        glp.add(earlyTravel);
        glp.add(coldWar);
        glp.add(c);
        glp.add(d);
        
        glp.add(sources);

        gl.setVgap(80);
        gl.setHgap(80);

        frame.add(header, BorderLayout.PAGE_START);
        frame.add(fill1, BorderLayout.LINE_START);
        frame.add(fill2, BorderLayout.LINE_END);
        frame.add(glp, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void changeSize(int x, int y){
        frame.setPreferredSize(new Dimension(x, y));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("-");
    }
}
