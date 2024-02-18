import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx1 extends JFrame {
    String[] labels = {"Yellow", "Green", "Green", "Red", "Blue", "White", "Black"};

    public FlowLayoutEx1() {
        super("Flow layout example");
        setup();
    }

    private void setup() {
        getContentPane().setLayout(new FlowLayout());

        for (String label : labels) {
            getContentPane().add(new JButton(label)); 
        }

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx1();
    }
}
