import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BMI Calculator");
    frame.setSize(300, 450);
    frame.setLocation(5, 5);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a JPanel for UI layout
    JPanel panel = new JPanel(new BorderLayout());

    // Create UI components
    JLabel titleLabel = new JLabel("BMI Calculator", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
    titleLabel.setBounds(10, 10, 280, 20);

    JLabel ageLabel = new JLabel("Age:");
    ageLabel.setBounds(10, 10, 40, 20);

    // Add UI components to the frame
    panel.add(titleLabel, BorderLayout.NORTH);
    panel.add(ageLabel, BorderLayout.LINE_END);
    frame.add(panel);

    frame.show();
  }
}