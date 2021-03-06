import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoWindow
{
    private static JFrame frame;
    private static JTextArea jt = new JTextArea(2, 20);
    private static JPanel bl;
    private static JScrollPane scroll = new JScrollPane(jt);
    private JPanel box = new JPanel();

    public InfoWindow(String title){
        frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setPreferredSize(new Dimension(800, 600));

        jt.setWrapStyleWord(true);
        jt.setEditable(false);
        jt.setLineWrap(true);
        jt.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        bl = new JPanel(new BorderLayout());
        box.setLayout(new BoxLayout(box, BoxLayout.PAGE_AXIS));
        
        JButton done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 30));
        done.setAlignmentX(Component.CENTER_ALIGNMENT);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(bl, BorderLayout.NORTH);
        frame.add(box, BorderLayout.PAGE_END);
        bl.add(jt, BorderLayout.NORTH);
        box.add(done);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public InfoWindow(int x, int y, String title){
        frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setPreferredSize(new Dimension(x, y));

        jt.setWrapStyleWord(true);
        jt.setEditable(false);
        jt.setLineWrap(true);
        jt.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        bl = new JPanel(new BorderLayout());
        box.setLayout(new BoxLayout(box, BoxLayout.PAGE_AXIS));

        JButton done = new JButton("Done");
        done.setPreferredSize(new Dimension(40, 30));
        done.setAlignmentX(Component.CENTER_ALIGNMENT);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(bl, BorderLayout.NORTH);
        frame.add(box, BorderLayout.PAGE_END);
        bl.add(jt, BorderLayout.NORTH);
        box.add(done);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void setText(String text){
        jt.setText(text);
    }

    public static void addInfo(Info i){
        jt.setText(i.getInfo());
    }

    public JFrame getFrame(){
        return frame;
    }

}
