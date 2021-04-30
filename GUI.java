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

public class GUI implements ActionListener{
	
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
		userLabel = new JLabel("User:");
		userLabel.setBounds(58, 97, 120, 23);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(214, 98, 154, 23);
		panel.add(userText);
		
		//password label
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(58, 146, 112, 23);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(214, 147, 159, 22);
		panel.add(passwordText);
		
		//login button
		button = new JButton("Login");
		button.setBounds(250, 195, 80, 25);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(200, 235, 300, 25);
		panel.add(success);
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + ", " + password);
		
		if(user.contentEquals("moreland99") && password.equals("200290533")) {
			success.setText("Login successful!");
		}
		else {
			success.setText("invalid username or password");
		}
		
		/*int userID = 11111;
		FloorLayout table = new FloorLayout(userID);
		table.createFloorPlanGUI();*/
		
	}
}
