

//imports
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//creates opening window where user enters ID to loging
public class LoginGUI implements ActionListener {

    private static JLabel userLabel,welcome;
    private static JTextField userText;
    private static JButton button;
    private static JFrame frame;

    //main method to kickstart application
    public static void main(String[]args) {
        //panel object, used absolute positioning for layout
        JPanel panel = new JPanel();
        panel.setLayout(null);

        //new frame object
        frame = new JFrame("Login");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        //Welcome Label
        welcome = new JLabel("J's Corner Restaurant") ;
        welcome.setBounds(135, 50, 300,23);
        welcome.setHorizontalTextPosition(SwingConstants.CENTER);
        welcome.setFont(new Font(null, Font.BOLD, 15));
        panel.add(welcome);

        //userID label
        userLabel = new JLabel("User ID:");
        userLabel.setBounds(58, 97, 120, 23);
        panel.add(userLabel);

        //userID text field to enter password
        userText = new JTextField(20);
        userText.setBounds(175, 98, 154, 23);
        panel.add(userText);

        //login button
        button = new JButton("Login");
        button.setBounds(200, 175, 80, 25);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.addActionListener(new LoginGUI());
        button.setBackground(Color.GREEN);
        button.setOpaque(true);
        panel.add(button);

        frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // when login button is clicked, the userID entered is saved
            String user = userText.getText();
            int userID = Integer.parseInt(user);
            frame.dispose();
            //section is created according to users ID number
            FloorLayout section = new FloorLayout(userID);
            section.createFloorPlanGUI();
        }
    }


