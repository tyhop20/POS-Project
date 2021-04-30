import java.util.ArrayList;
public class Order {

    ArrayList<Item> items = new ArrayList<Item>();
    private double subtotal = 0;
    private double tax = .07;
    private double total = 0;
    private int iterator = 0;
    private static int orderID = 0;
    int tableNo;


    public Order(int tableNo) {
        orderID++;
        this.tableNo = tableNo;
    }



    public void addItem(Item item) {
        items.add(item);
        subtotal += item.getPrice();
        calcTotal();

    }

    public void calcTotal() {
        total = subtotal*tax + subtotal;
    }

    public void display() {
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
