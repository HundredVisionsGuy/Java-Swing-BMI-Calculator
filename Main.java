import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;

class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BMI Calculator");
    frame.setSize(300, 450);
    frame.setLocation(5, 5);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a Mig Layout Panel for our layout
    JPanel panel = new JPanel(new MigLayout());

    // Create UI components
    JLabel titleLabel, ageLabel, heightLabel, feetLabel,
           inchLabel, weightLabel, resultsLabel;
    JTextField ageField, heightFeetField, heightInchField, weightField;
    JButton button;
    
    titleLabel = new JLabel("BMI Calculator", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
    titleLabel.setBounds(10, 10, 280, 20);

    ageLabel = new JLabel("Age: ");
    ageField = new JTextField(2);

    heightLabel = new JLabel("Height: ");
    feetLabel = new JLabel("\'");
    inchLabel = new JLabel("\"");
    heightFeetField = new JTextField(2);
    heightInchField = new JTextField(2);

    // Add UI components to the panel
    panel.add(titleLabel, "span");
    panel.add(ageLabel);
    panel.add(ageField, "wrap");
    panel.add(heightLabel);
    panel.add(heightFeetField);
    panel.add(feetLabel);
    panel.add(heightInchField);
    panel.add(inchLabel, "wrap");
    
    // Add panel
    
    frame.add(panel);

    frame.show();
  }
}