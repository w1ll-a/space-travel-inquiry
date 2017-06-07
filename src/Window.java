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
        earlyTravel.setFont(new Font("Times New Roman", Font.BOLD, 18));

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
        coldWar.setFont(new Font("Times New Roman", Font.BOLD, 18));

        coldWar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow coldWarInfo = new InfoWindow("Cold War Space Travel");

                coldWarInfo.addInfo(Data.coldWar);
                coldWarInfo.getFrame().add(new ImagePanel("media\\usmoonlanding.jpg"));
            }
        });

        JButton shuttle = new JButton("Space Shuttles");
        shuttle.setBackground(Color.GRAY);
        shuttle.setForeground(Color.WHITE);
        shuttle.setFocusPainted(false);
        shuttle.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        shuttle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow shuttle = new InfoWindow("Space Shuttles");
                
                shuttle.addInfo(Data.spaceShuttle);
                shuttle.getFrame().add(new ImagePanel("media\\spaceshuttle.jpg"));
            }
        });
        
        JButton cassini = new JButton("Cassini Space Program");
        cassini.setBackground(Color.GRAY);
        cassini.setForeground(Color.WHITE);
        cassini.setFocusPainted(false);
        cassini.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        cassini.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow cassini = new InfoWindow("Cassini Space Program");
                
                cassini.addInfo(Data.cassini);
                cassini.getFrame().add(new ImagePanel("media\\cassini.jpg"));
            }
        });
        
        JButton columbia = new JButton("The Columbia Failure");
        columbia.setBackground(Color.GRAY);
        columbia.setForeground(Color.WHITE);
        columbia.setFocusPainted(false);
        columbia.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        columbia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow columbia = new InfoWindow("The Columbia Disaster");
                
                columbia.addInfo(Data.columbiaDisaster);
                columbia.getFrame().add(new ImagePanel("media\\columbiadisaster.jpg"));
            }
        });
        
        JButton juno = new JButton("Juno Space Program");
        juno.setBackground(Color.GRAY);
        juno.setForeground(Color.WHITE);
        juno.setFocusPainted(false);
        juno.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        juno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow juno = new InfoWindow("Juno Space Program");
                
                juno.addInfo(Data.juno);
                juno.getFrame().add(new ImagePanel("media\\juno.jpg"));
            }
        });
        
        JButton future = new JButton("The Future of Space Travel");
        future.setBackground(Color.GRAY);
        future.setForeground(Color.WHITE);
        future.setFocusPainted(false);
        future.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        future.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow future = new InfoWindow("The Future of Space Travel");
                
                future.addInfo(Data.future);
                future.getFrame().add(new ImagePanel(""));
            }
        });

        JButton sources = new JButton("Sources");
        sources.setBackground(Color.GRAY);
        sources.setForeground(Color.WHITE);
        sources.setFocusPainted(false);
        sources.setFont(new Font("Times New Roman", Font.BOLD, 18));
        
        sources.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoWindow sources = new InfoWindow(1200, 900, "Sources");
                
                sources.addInfo(Data.sources);
            }
        });

        JButton d = new JButton("test3");
//---------------------------------------------------------------------------------

        glp.add(earlyTravel);
        glp.add(coldWar);
        glp.add(spaceShuttle);
        glp.add(cassini);
        glp.add(columbia);
        glp.add(juno);
        glp.add(future);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print("Action Performed");
    }
}
