import javax.swing.*;

public class Info
{
    private String query, info;
    private static JLabel label = null;

    public Info(String query, String info){
        this.query = query;
        this.info = info;

    }

    public Info(String query, String info, JLabel label){
        this.query = query;
        this.info = info;
        this.label = label;
    }

    public String getQuery(){
        return query;
    }

    public String getInfo(){
        return info;
    }

    public static JLabel getLabel(){ return label; }
}