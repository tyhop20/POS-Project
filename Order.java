import java.util.ArrayList;
public class Order {

    ArrayList<Item> items = new ArrayList<Item>();
    double subtotal = 0;
    double tax = .07;
    double total = 0;
    int iterator = 0;


    public Order() {

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


}
