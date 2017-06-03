import java.io.File;
import java.util.Scanner;

public class Info
{
    private String query, filePath, info;

    public Info(String query, String filePath){
        this.query = query;
        this.filePath = filePath;

    }

    public String getQuery(){
        return query;
    }

    public String getInfo(){
        return info;
    }
}