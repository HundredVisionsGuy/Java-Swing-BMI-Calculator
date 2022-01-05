import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BMI Calculator");
    frame.setSize(300, 450);
    frame.setLocation(5, 5);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create UI components
    JLabel titleLabel = new JLabel("BMI Calculator", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
    titleLabel.setBounds(10, 10, 280, 20);

    JLabel ageLabel = new JLabel("Age:", SwingConstants.LEFT);

    // Add UI components to the frame
    frame.add(titleLabel);
    frame.add(ageLabel);

    frame.show();
  }
}