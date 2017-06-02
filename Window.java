import javax.swing.*;

public class Window extends JFrame implements ActionListener
{
	public Window(int x, int y, String title){
		JFrame frame = new JFrame(title);
		frame.setSize(x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.format();
	}
 
	public void changeSize(int x, int y){
		frame.setSize(x, y);
	}
 
	public void format(){
		JPanel header = new JPanel();
		JPanel gl = new JPanel(new GridLayout(2, 3));
		
		JTextArea headerText = new JTextArea("The History of Space Travel");
		header.add(headerText);
		
		this.add(header);
		this.add(gl);
		
		this.pack();
		this.setVisible(true);
  }
	
	public void actionPerformed(ActionEvent e){
		InfoWindow iw = new InfoWindow(800, 600);
		iw.addInfo();
	}
}
