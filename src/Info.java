import java.io.File;
import java.util.Scanner;

public class Info
{
    private String query, info;

    public Info(String query, String info){
        this.query = query;
        this.info = info;

    }

    public String getQuery(){
        return query;
    }

    public String getInfo(){
        return info;
    }
}