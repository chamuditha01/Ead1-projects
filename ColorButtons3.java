import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
 
public class ColorButtons3 extends JFrame {
    private JButton red = new JButton("Red");
    private JButton blue = new JButton("Blue");
    private JButton green = new JButton("Green");
    private JButton orange = new JButton("Orange");
    private JButton yellow = new JButton("Yellow");
 
    private Color defaultColor = null;
 
    public ColorButtons3() {
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
 
        defaultColor = red.getBackground();
 
        this.red.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(Color.red);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(defaultColor);
            }
        });
        this.blue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(Color.red);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(defaultColor);
            }
        });
        this.green.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(Color.green);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(defaultColor);
            }
        });
        this.yellow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(Color.yellow);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(defaultColor);
            }
        });
        this.orange.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(Color.orange);
            }
 
            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton) e.getSource()).setBackground(defaultColor);
            }
        });
 
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new ColorButtons3();
    }
}
