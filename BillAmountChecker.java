import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BillAmountChecker extends JFrame {
    private JTextField billAmountTextField;
    private JLabel outputLabel;

    public BillAmountChecker() {
        
        setTitle("Bill Amount Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        billAmountTextField = new JTextField();
        outputLabel = new JLabel();

        
        billAmountTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                try {
                    double billAmount = Double.parseDouble(billAmountTextField.getText());
                    if (billAmount > 5000) {
                        outputLabel.setText("Bill amount exceeds 5,000!");
                    } else {
                        outputLabel.setText("");
                    }
                } catch (NumberFormatException ex) {
                    
                    outputLabel.setText("Invalid input. Enter a valid number.");
                }
            }
        });

        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Enter Bill Amount:"));
        add(billAmountTextField);
        add(outputLabel);

        
        setVisible(true);
    }

    // You don't need to write the main method in this class; it's provided for demonstration purposes.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BillAmountChecker());
    }
}
