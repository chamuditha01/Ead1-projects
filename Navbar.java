import javax.swing.*;
import java.awt.*;

public class Navbar extends JPanel {

    private JLabel topicLabel;
    private JButton addemployeebutton;

    public Navbar(){
        setLayout(new FlowLayout());
        this.topicLabel = new JLabel();
        this.addemployeebutton = new JButton();
        initializeui();
    }

    private void initializeui(){
        topicLabel.setText("Employee Management System");
        addemployeebutton.setText("Add Employee");
        addemployeebutton.setBackground(new Color(134, 78, 233));
    }
}
