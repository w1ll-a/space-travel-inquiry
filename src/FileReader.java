import java.io.File;
import java.util.Scanner;

public class FileReader {
    private String filePath, info;

    Scanner data = new Scanner(new File(filePath));
        while (data.hasNextLine()){
            info = info + "\n" + data.nextLine();
    }
}
