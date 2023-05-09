import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA};
        int numColors = colors.length;
        int colorWidth = width / numColors;
        int remainder = width % numColors;
        for (int i = 0; i < numColors; i++) {
            g.setColor(colors[i]);
            if (i == 0)
                g.fillRect(0, 0, colorWidth + remainder, height);
            else
                g.fillRect(remainder + (i * colorWidth), 0, colorWidth, height);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rainbow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        Rainbow panel = new Rainbow();
        frame.add(panel);
        frame.setVisible(true);
    }
}
