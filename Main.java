public class Main
{
	private ArrayList<Info> list = new ArrayList<Info>();
	
  public Main(){
		Window w = new Window(1000, 800);
	}
	
	public ArrayList<Info> addToList(Info i){
    list.add(i);
  }
	
	public Info search(String query){
		for(Info i : list){
			if (i.getQuery == query) return i;
		}
		return null;
	}
	
	public static void main(String[] args){
		Main m = new Main();
	}
}
