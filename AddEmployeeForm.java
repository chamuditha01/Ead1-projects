

import javax.swing.*;
import java.awt.*;

public class AddEmployeeForm extends JFrame {

    public AddEmployeeForm() {
        setTitle("Add Employee");

        // Create the content pane with FlowLayout
        Container container= getContentPane();
        container.setLayout(new GridLayout(7,2));

        add(new Label("First Name :"));
        TextField firstName = new TextField(20);
        add(firstName);
        add(new Label("Last Name :"));
        TextField lastName = new TextField(20);
        add(lastName);
        add(new Label("Designation :"));
        TextField designation = new TextField(20);
        add(designation);
        add( new Label("Email :"));
        TextField email = new TextField(20);
        add(email);
        add(new Label("Telephone :"));
        TextField telephone = new TextField(20);
        add(telephone);
        add(new Label("Age :"));
        TextField age = new TextField(20);
        add(age);

        JButton submitBtn = new JButton("Submit");
        submitBtn.setFocusPainted(false);
        JButton backBtn = new JButton("Back");
        backBtn.setFocusPainted(false);
        container.add(submitBtn);
        container.add(backBtn);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        setSize(400, 400);

        // Set the frame to be visible
        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AddEmployeeForm());
    }
}
