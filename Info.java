import java.awt.*;
 
public class Info
{
  private String query, filePath, info;
	
	public Info(String query, String filePath){
		this.query = query;
		this.filePath = filePath;
		Scanner data = new Scanner(new File(filePath));
		while (data.hasNextLine()){
			info = info “\n” + data.nextLine();
		}
	}
	
	public String getQuery(){
		return query;
	}
 
	public String getInfo(){
		return info;
	}
}