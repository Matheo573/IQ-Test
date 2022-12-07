import javax.swing.*;
import java.awt.*;

public class Application {
    private static JFrame window;

    public static void main(String[] args) {
        window = new JFrame("IQ Test");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addTestPanel();
        window.setVisible(true);
    }

    private static void addTestPanel() {
        var panel = new JFrame();
    }
}