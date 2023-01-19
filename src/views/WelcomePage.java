package views;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomLabel = new JLabel("Hello");

    WelcomePage(String userID) {

        welcomLabel.setBounds(0, 0, 200, 35);
        welcomLabel.setText(userID + " admin fiók");

        frame.add(welcomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
