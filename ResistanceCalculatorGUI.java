import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResistanceCalculatorGUI {

    private JFrame frame;
    private JTextField voltageField;
    private JTextField currentField;
    private JTextField resultField;

    public ResistanceCalculatorGUI() {
        frame = new JFrame("Resistance Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel voltageLabel = new JLabel("Enter Voltage (V):");
        voltageField = new JTextField();
        JLabel currentLabel = new JLabel("Enter Current (A):");
        currentField = new JTextField();

        JButton calculateButton = new JButton("Calculate");
        resultField = new JTextField();
        resultField.setEditable(false);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResistance();
            }
        });

        panel.add(voltageLabel);
        panel.add(voltageField);
        panel.add(currentLabel);
        panel.add(currentField);
        panel.add(new JLabel()); // Empty cell
        panel.add(calculateButton);
        panel.add(new JLabel("Resistance:"));
        panel.add(resultField);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void calculateResistance() {
        try {
            int voltage = Integer.parseInt(voltageField.getText());
            int current = Integer.parseInt(currentField.getText());

            Resistance resistance = new Resistance(voltage, current);
            int calculatedResistance = resistance.getResistance();

            resultField.setText(Integer.toString(calculatedResistance));
        } catch (NumberFormatException ex) {
            
            resultField.setText("Invalid input");
        }
    }
    class Resistance {

        private int voltage1;
        private int current1;

        public  Resistance(int voltage, int current){
            this.voltage1=voltage;
            this.current1=current;
        }

        public int getResistance(){
            int Resistance=voltage1/current1;
            return Resistance;
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ResistanceCalculatorGUI();
            }
        });
    }
}
