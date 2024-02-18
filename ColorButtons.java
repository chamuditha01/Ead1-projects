import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class ColorButtons extends JFrame implements ActionListener {
    private JButton red = new JButton("Red");
    private JButton blue = new JButton("Blue");
    private JButton green = new JButton("Green");
    private JButton orange = new JButton("Orange");
    private JButton yellow = new JButton("Yellow");
 
    public ColorButtons() {
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
 
        this.red.addActionListener(this);
        this.blue.addActionListener(this);
        this.green.addActionListener(this);
        this.orange.addActionListener(this);
        this.yellow.addActionListener(this);
 
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

 
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
 
        switch (command) {
            case "Red":
                ((JButton) e.getSource()).setBackground(Color.red);
                break;
            case "Blue":
                ((JButton) e.getSource()).setBackground(Color.BLUE);
                break;
            case "Green":
                ((JButton) e.getSource()).setBackground(Color.GREEN);
                break;
            case "Orange":
                ((JButton) e.getSource()).setBackground(Color.ORANGE);
                break;
            case "Yellow":
                ((JButton) e.getSource()).setBackground(Color.YELLOW);
                break;
        }
 
        //Fix for MacOs
        ((JButton) e.getSource()).setOpaque(true);
    }
 
    public static void main(String[] args) {
        new ColorButtons();
    }
}
 
