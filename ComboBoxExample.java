import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
 
public class ComboBoxExample extends JFrame {
    private String[] countries = {"India","Australia","Pakistan","England","Newzealand" , "South Africa", "West Indies", "Sri Lanka"};
    private JLabel label = new JLabel();
 
    public ComboBoxExample()  {
        super("Combobox");
        Container panel = getContentPane();
        panel.setLayout(null);
        JComboBox cbx = new JComboBox(countries);
        cbx.setBounds(20,10,200, 30);
        label.setBounds(20,50,200, 30);
        panel.add(cbx);
        panel.add(label);
 
        cbx.addItemListener(e -> {
           if(e.getStateChange() == ItemEvent.SELECTED){
               label.setText((String)e.getItem());
           }
        });
 
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
