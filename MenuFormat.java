
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFormat implements ActionListener {
    JButton button;
    JFrame frame;
    JLabel label;
    Menu menu = new Menu();
    int menuItem;
    Order order;

    public MenuFormat(Order order) {
        //create new window
        frame = new JFrame("Menu Categories");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.order = order;
    }
    public  void createMenuGUI() {
        //setup content frame
        addComponentsToMenuPane(frame.getContentPane());
        //display
        frame.pack();
        frame.setVisible(true);
    }

    //implement buttons
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
        button.setBackground(Color.GRAY);
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

    //when each category button is selected a new window is generated with the appropriate food items,
    //the back button returns to the previous category
    @Override
    public void actionPerformed(ActionEvent e) {
        String category = ((JButton) e.getSource()).getText();
        if (category.equals("BACK")) {
            frame.dispose();
            Tables table = new Tables(order);
            table.createTableGUI();
            menuItem = 0;
        }
        if (category.equals("Appetizer")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getApps(), order);
            apps.createMenuCatsGUI();
            menuItem = 0;
        }
        if (category.equals("Wraps")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getWraps(), order);
            apps.createMenuCatsGUI();
            menuItem = 1;
        }
        if (category.equals("Entrees")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getEntrees(), order);
            apps.createMenuCatsGUI();
            menuItem = 2;
        }
        if (category.equals("Sides")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getSides(), order);
            apps.createMenuCatsGUI();
            menuItem = 3;
        }
        if (category.equals("Beverages")) {
            frame.dispose();
            MenuCats apps = new MenuCats(menu.getBevs(), order);
            apps.createMenuCatsGUI();
            menuItem = 4;
        }
    }
}