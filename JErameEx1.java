import javax.swing.*;
import java.awt.*;

public class JErameEx1 extends JFrame {
    public JErameEx1() {
        super("My first JFrame");
        setup();
    }

    private void setup() {
        getContentPane().setLayout(new FlowLayout()); 

        JLabel helloLabel = new JLabel("Hello World!");
        getContentPane().add(helloLabel);

        JLabel nameLabel = new JLabel("My Name is chamuditha heshan");
        Color nameLabelColor = new Color(12, 225, 225);
        nameLabel.setOpaque(true); 
        nameLabel.setBackground(nameLabelColor);
        getContentPane().add(nameLabel);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JErameEx1();
    }
}

