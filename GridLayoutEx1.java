import javax.swing.*;
import java.awt.*;

public class GridLayoutEx1 extends JFrame {
    String[] labels = {"Yellow ", "Orange ", "Red", "Blue", "White", "Green"};

    public GridLayoutEx1() {
        super("Grid layout example");
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new GridLayout(3, 2));

        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton readButton = new JButton("Read");
        JButton updateButton = new JButton("Update");

        add(addButton);
        add(readButton);
        add(deleteButton);
        add(updateButton);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GridLayoutEx1();
        });
    }
}