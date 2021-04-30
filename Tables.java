

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
    Order order;
    JTextArea total;



    public Tables() {
        frame = new JFrame(order.getTableName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
    }

    public Tables(Order order) {
        frame = new JFrame(order.getTableName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        this.order = order;
    }


    public Tables(String tableName, Order order) {
        this.tableName = tableName;
        frame = new JFrame(order.getTableName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        this.order = order;
    }

    public void createTableGUI() {
        //setup content frame
        addComponentsToTable(frame.getContentPane());
        //display
        frame.setVisible(true);
    }

    public void addComponentsToTable(Container pane) {
        pane.setLayout(null);

        //Back button
        button = new JButton("BACK");
        button.setBackground(Color.GRAY);
        button.setOpaque(true);
        button.setBounds(25,25,125,75 );
        button.addActionListener(this);
        pane.add(button);

        //Table Label
        label = new JLabel(order.getTableName());
        label.setFont(new Font(null, Font.BOLD, 25));
        label.setBounds(200,25, 150,75);
        pane.add(label);

        //Buttons for each seat
        button = new JButton("Seat 1");
        button.setBounds(175,175, 125, 125);
        button.addActionListener(this);
        pane.add(button);

        button = new JButton("Seat 2");
        button.setBounds(300,175, 125, 125);
        button.addActionListener(this);
        pane.add(button);

        button = new JButton("Seat 3");
        button.setBounds(175,300, 125, 125);
        button.addActionListener(this);
        pane.add(button);

        button = new JButton("Seat 4");
        button.setBounds(300,300, 125, 125);
        button.addActionListener(this);
        pane.add(button);

        //SEND button
        button = new JButton("SEND");
        button.setBackground(Color.GREEN);
        button.setOpaque(true);
        button.setBounds(25,475,125,75 );
        button.addActionListener(this);
        pane.add(button);

        //Order Label
        label = new JLabel("Current Order:");
        label.setFont(new Font(null, Font.BOLD, 25));
        label.setBounds(600,25, 275,50);
        pane.add(label);

        //OrderConsole
        console = new JTextArea(order.toString());
        console.setBounds(600,100,275,300);
        pane.add(console);

        //Total Box
        total = new JTextArea(order.calcTotal());
        total.setBounds(750,425,200,25);
        pane.add(total);

        //Total Label
        label = new JLabel("SubTotal with 7% Tax");
        label.setFont(new Font(null, Font.BOLD, 15));
        label.setBounds(500,415, 175,50);
        pane.add(label);
    }

    //when seat buttons are pressed, MenuFormat object is created with the already created order parameter
    @Override
    public void actionPerformed(ActionEvent e) {
        String category = ((JButton) e.getSource()).getText();
        if (category.equals("SEND")){
            order.display();
            frame.dispose();
            FloorLayout section = new FloorLayout(11111);
            section.createFloorPlanGUI();

        } else if (category.equals("BACK")) {
            frame.dispose();
            //section is created according to users ID number
            FloorLayout section = new FloorLayout(11111);
            section.createFloorPlanGUI();

        } else {
            frame.dispose();
            MenuFormat menu = new MenuFormat(order);
            menu.createMenuGUI();
        }
    }
}
