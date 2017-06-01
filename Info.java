import java.awt.*;
 
public class Info
{
  private String query, file, info;
  
	public Info(String query, String file){
		this.query = query;
		this.file = file;
		Scanner data = new Scanner(new File(file));
		while (data.hasNextLine()){
      info = info “\n” + data.nextLine();
    }
  }
	
	public String getQuery(){
		return query;
	}
 
	public String getInfo{
		return info;
	}
}