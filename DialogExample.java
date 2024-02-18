import javax.swing.*;
import java.awt.*;
 
public class DialogExample {
    private static JDialog jd;
    private static JButton show;
 
    DialogExample() {
        JFrame f = new JFrame();
        show = new JButton("Show");
        f.getContentPane().setLayout(null);
        show.setBounds(10, 20, 75, 30);
        f.getContentPane().add(show);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        jd = new JDialog(f, "Dialog Example", true);
        jd.setSize(300,300);
        jd.setLayout(new FlowLayout());
        JButton b = new JButton("OK");
        b.addActionListener(e -> jd.setVisible(false));
        show.addActionListener(e -> jd.setVisible(true));
        jd.add(new JLabel("Click button to continue."));
        jd.add(b);
        f.setSize(200, 200);
        f.setVisible(true);
    }
 
    public static void main(String args[]) {
        new DialogExample();
    }
}
