package edu.prototype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tables implements ActionListener{
    JButton button;
    JFrame frame;
    JLabel label;
    JTextArea console;
    String tableName;

    public Tables(String tableName) {
        this.tableName = tableName;
        frame = new JFrame("Floor Plan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
    }

    public void createTableGUI() {
        //setup content frame
        addComponentsToTable(frame.getContentPane());
        //display
        frame.pack();
        frame.setVisible(true);
    }

    public void addComponentsToTable(Container pane) {
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        //gbc.insets.bottom = 10;
        //gbc.insets.left = 10;
        //gbc.insets.right = 10;
        //gbc.insets.top = 10;


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
        label = new JLabel("" + tableName);
        label.setFont(new Font(null, Font.BOLD, 15));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = .5;
        pane.add(label, gbc);

        int seatNum = 0;
        //nested for loops to create table layout
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                seatNum++;
                button = new JButton("Seat " + seatNum);
                button.setSize(50, 50);
                gbc.ipadx = 0;
                gbc.ipady = 0;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.gridx = j;
                gbc.gridy = i + 1;
                button.addActionListener(this);
                pane.add(button, gbc);
            }
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
        gbc.gridy = 3;
        gbc.weightx = .5;
        button.addActionListener(this);
        pane.add(button, gbc);

        //OrderConsole
        console = new JTextArea("Line Item Order:");
        console.setSize(200, 400);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridheight = 6;
        pane.add(console, gbc);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().getClass().equals(button.getClass())) {
            frame.dispose();
            MenuFormat menu = new MenuFormat();
            menu.createMenuGUI();
        }
    }
}
