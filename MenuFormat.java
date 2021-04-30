
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFormat implements ActionListener {
    JButton button;
    JFrame frame;
    JLabel label;
    Menu menu = new Menu();

    public MenuFormat() {
        //create new window
        frame = new JFrame("Menu Categories");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void createMenuGUI() {
        //setup content frame
        addComponentsToMenuPane(frame.getContentPane());
        //display
        frame.pack();
        frame.setVisible(true);
    }

    public void addComponentsToMenuPane(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets.bottom = 10;
        gbc.insets.left = 10;
        gbc.insets.right = 10;
        gbc.insets.top = 10;
        gbc.gridx = 5;


        //back button
        button = new JButton("BACK");
        button.setBackground(Color.DARK_GRAY);
        button.setOpaque(true);
        button.setSize(20, 10);
        gbc.ipadx = 40;
        gbc.ipady = 40;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = .5;
        button.addActionListener(this);
        pane.add(button, gbc);

        //Menu Categories Label
        label = new JLabel("Menu Categories:");
        label.setFont(new Font(null, Font.BOLD, 15));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = .5;
        pane.add(label, gbc);


        for (int i = 0; i < 5; i++) {
            String[] menuArray = {"Appetizer", "Wraps", "Entrees", "Sides", "Beverages"};
            button = new JButton("" + menuArray[i]);
            button.setSize(20, 20);
            gbc.ipadx = 40;
            gbc.ipady = 40;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.gridx = i;
            gbc.gridy = 1;
            gbc.weightx = 0.0;
            button.addActionListener(this);
            pane.add(button, gbc);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String category = ((JButton) e.getSource()).getText();
        if (category.equals("Appetizer")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getApps());
            apps.createMenuCatsGUI();
        }
        if (category.equals("Wraps")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getWraps());
            apps.createMenuCatsGUI();
        }
        if (category.equals("Entrees")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getEntrees());
            apps.createMenuCatsGUI();
        }
        if (category.equals("Sides")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getSides());
            apps.createMenuCatsGUI();
        }
        if (category.equals("Beverages")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getBevs());
            apps.createMenuCatsGUI();
        }
    }
}