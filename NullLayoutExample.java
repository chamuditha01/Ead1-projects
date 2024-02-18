import javax.swing.*;

public class NullLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Null Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 30); 
        frame.add(button);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
