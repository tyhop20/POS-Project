import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCats implements ActionListener{
    JButton button;
    JFrame frame;
    JLabel label;
    Item[] food;

    public MenuCats(Item[] food) {
        frame = new JFrame("Menu Categories");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.food = food;
    }

    public  void createMenuCatsGUI() {
        //setup content frame
        addComponentsToCatsPane(frame.getContentPane());
        //display
        frame.pack();
        frame.setVisible(true);
    }


    public void addComponentsToCatsPane(Container pane) {
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
        label = new JLabel("" + food[0].getClass().getSimpleName());
        label.setFont(new Font(null, Font.BOLD, 15));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = .5;
        pane.add(label, gbc);


        for (int i = 0; i < food.length; i++) {
            button = new JButton(" " + food[i].getName());
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

        //addToOrder button
        button = new JButton("ADD TO ORDER");
        button.setBackground(Color.GREEN);
        button.setOpaque(true);
        button.setSize(20, 10);
        gbc.ipadx = 40;
        gbc.ipady = 40;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = .5;
        button.addActionListener(this);
        pane.add(button, gbc);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}