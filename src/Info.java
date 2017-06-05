import javax.swing.*;

public class Info
{
    private String query, info;
    private static ImagePanel path = null;

    public Info(String query, String info){
        this.query = query;
        this.info = info;

    }

    public Info(String query, String info, ImagePanel path){
        this.query = query;
        this.info = info;
        this.path = path;
    }

    public String getQuery(){
        return query;
    }

    public String getInfo(){
        return info;
    }

    public static ImagePanel getPath(){ return path; }
}