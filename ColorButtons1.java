import javax.swing.*;
import java.awt.*;

public class ColorButtons1 extends JFrame {
    private Button red = new Button("Red");
    private Button blue = new Button("Blue");
    private Button green = new Button("Green");
    private Button orange = new Button("Orange");
    private Button yellow = new Button("Yellow");

    public ColorButtons1() {
        super("Multi Buttons");
        setup();
    }

    private void setup() {
        Container panel = getContentPane();
        panel.setLayout(new BorderLayout(2, 2));
        panel.add(this.red, BorderLayout.NORTH);
        panel.add(this.blue, BorderLayout.EAST);
        panel.add(this.green, BorderLayout.SOUTH);
        panel.add(this.orange, BorderLayout.WEST);
        panel.add(this.yellow, BorderLayout.CENTER);

        this.red.addActionListener(e -> updateColor((Button) e.getSource(), Color.RED));
        this.blue.addActionListener(e -> updateColor((Button) e.getSource(), Color.BLUE));
        this.green.addActionListener(e -> updateColor((Button) e.getSource(), Color.BLACK));
        this.orange.addActionListener(e -> updateColor((Button) e.getSource(), Color.ORANGE));
        this.yellow.addActionListener(e -> updateColor((Button) e.getSource(), Color.YELLOW));

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updateColor(Button button, Color color) {
        if (button.getBackground() == null || !button.getBackground().equals(color)) {
            button.setBackground(color);
        } else {
            button.setBackground(null);
        }
    }

    public static void main(String[] args) {
        new ColorButtons1();
    }
}
