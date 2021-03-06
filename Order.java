import java.text.DecimalFormat;
import java.util.ArrayList;
public class Order {

    ArrayList<Item> items = new ArrayList<Item>();
    private double subtotal = 0;
    private double tax = .07;
    private double total = 0;
    private int iterator = 0;
    private static int orderID = 0;
    private String tableName;

    //constructor
    public Order(String tableName) {
        this.tableName = tableName;
        orderID++;
    }

    //getter for tableName
    public String getTableName() {
        return tableName;
    }

    //method for adding items
    public void addItem(Item item) {
        items.add(item);
        subtotal += item.getPrice();
        calcTotal();
    }

    //method for calculating total
    public String calcTotal() {
        DecimalFormat df = new DecimalFormat("###.##");
        total = subtotal *tax + subtotal;
        String roundOff = df.format(total);
        return roundOff;
    }

    //display order to console
    public void display() {
        System.out.println("************************************");
        System.out.println("Order Number: " +orderID);
        System.out.println(tableName + "\n");

        for(Item item : items) {
            System.out.println(item.getName());
            if(item instanceof Entrees) {
                System.out.println("    Side 1: " + ((Entrees) item).getSide1());
                System.out.println("    Side 2: " + ((Entrees) item).getSide2());
            }
            if(item instanceof Wraps) {
                System.out.println("    Side 1: " + ((Wraps) item).getSide());
            }
        }
    }

    public String getName() {
        return items.get(iterator).getName();
    }

    public double getPrice() {
        int newIt = iterator;
        iterator++;
        return items.get(newIt).getPrice();
    }

    //toString method for displaying name and cost
    public String toString() {
        String strin = "";
        for(Item item : items) {
            strin += (item.getName() + "    " + item.getPrice() + "\n");
            if(item instanceof Entrees) {
                strin += ("   " + ((Entrees) item).getSide1() + "\n");
                strin += ("   " + ((Entrees) item).getSide2() + "\n");
            }
            if(item instanceof Wraps) {
                strin += ("   " + ((Wraps) item).getSide() + "\n");
            }
        }
        return strin;
    }


}
