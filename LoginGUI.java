package edu.prototype;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginGUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[]args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        //user label
        userLabel = new JLabel("User ID:");
        userLabel.setBounds(58, 97, 120, 23);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(175, 98, 154, 23);
        panel.add(userText);

        //login button
        button = new JButton("Login");
        button.setBounds(200, 175, 80, 25);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.addActionListener(new LoginGUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(180, 210, 300, 25);
        panel.add(success);

        frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            String user = userText.getText();
            int userID = Integer.parseInt(user);
            System.out.println(user);

            FloorLayout table = new FloorLayout(userID);
            table.createFloorPlanGUI();

        }
    }


