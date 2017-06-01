import javax.swing.*;

public class Window extends JFrame
{
	public Window(int x, int y){
		JFrame frame = new JFrame(“Space Travel”);
		frame.setSize(x, y);
	}
 
	public void changeSize(int x, int y){
		frame.setSize(x, y);
	}
 
	public void format(String type){
		if (type == “data”){
			JPanel bl = new JPanel(new BorderLayout());
			JTextField tf = new JTextField();
			JButton done = new JButton(“Done”);
			
      frame.add(bl);
      bl.add(tf, BorderLayout.NORTH);
      bl.add(done, BorderLayout.SOUTH);
		}
		if (type == “menu”){
			JPanel header = new JPanel();
      JPanel gl = new JPanel(new GridLayout(2, 3));
			
			frame.add(header);
      frame.add(gl);
  }
}
