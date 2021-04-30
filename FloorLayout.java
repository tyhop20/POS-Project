package edu.prototype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FloorLayout implements ActionListener {
     JButton button;
     JFrame frame;
     JLabel label;
     int userID;

     //possible user values for testing
     //static int user1 = 11111;
     //static int user2 = 22222;
     //static int user3 = 33333;

    public FloorLayout() {
        //create new window
        frame = new JFrame("Floor Plan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
    }

    public FloorLayout(int userID) {
        this.userID = userID;
        frame = new JFrame("Floor Plan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
    }

    public void createFloorPlanGUI() {
        //setup content frame
        addComponentsToFloorplan(frame.getContentPane());
        //display
        frame.pack();
        frame.setVisible(true);
        int userID;
    }

    public void addComponentsToFloorplan(Container pane){
        //gridBagConstraint parameters
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets.bottom = 10;
        gbc.insets.left = 10;
        gbc.insets.right = 10;
        gbc.insets.top = 10;

        //int userID = user1;

        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        //for table naming
        int tableNum = 0;
        //nested for loops to create floor layout, each user has a different "section" in which tables are colored
        for (int i=0; i<6; i++){
            for (int j=0; j<5; j++) {
                tableNum++;
                button = new JButton("Table " + tableNum);
                button.setSize(20,20);
                if (userID == 11111){
                    switch (tableNum) {
                        case 1:
                            button.setBackground(Color.GREEN);
                            break;
                        case 2:
                            button.setBackground(Color.RED);
                            break;
                        case 3:
                            button.setBackground(Color.YELLOW);
                            break;
                    }
                }
                if (userID == 22222){
                    switch (tableNum) {
                        case 6:
                            button.setBackground(Color.GREEN);
                            break;
                        case 11:
                            button.setBackground(Color.RED);
                            break;
                        case 16:
                            button.setBackground(Color.YELLOW);
                            break;
                    }
                }
                if (userID == 33333){
                    switch (tableNum) {
                        case 21:
                            button.setBackground(Color.GREEN);
                            break;
                        case 26:
                            button.setBackground(Color.RED);
                            break;
                        case 27:
                            button.setBackground(Color.YELLOW);
                            break;
                    }
                }
                button.setOpaque(true);

                gbc.ipadx = 40;
                gbc.ipady = 40;
                gbc.fill= GridBagConstraints.HORIZONTAL;
                gbc.gridx = j;
                gbc.gridy = i+1;
                button.addActionListener(this);
                pane.add(button, gbc);

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tableName = ((JButton) e.getSource()).getText();
        if (e.getSource().getClass().equals(button.getClass())) {
            frame.dispose();
            Tables table = new Tables(tableName);
            table.createTableGUI();
        }
    }
}
