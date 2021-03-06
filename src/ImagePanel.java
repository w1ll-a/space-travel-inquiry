import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePanel extends JPanel{

    private BufferedImage image;

    public ImagePanel(String filePath) {
        try {
            image = ImageIO.read(new File(filePath));
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = (this.getWidth() - image.getWidth(null)) / 2;

        g.drawImage(image, x, 0, null);
    }

}
