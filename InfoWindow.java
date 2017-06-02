public class InfoWindow extends Window
{
  public InfoWindow(int x, int y, String title){
    super(x, y, title);
  }
  
  public void format(){
		JPanel bl = new JPanel(new BorderLayout());
		JTextField tf = new JTextField();
		JButton done = new JButton(“Done”);
		
    frame.add(bl);
    bl.add(tf, BorderLayout.NORTH);
    bl.add(done, BorderLayout.SOUTH);
	}
  
  public void addInfo(Info i){
    tf.setText(Main.search(i.getQuery()));
  }
}