public class Wraps extends Item  {

    private Sides side1 = new Sides("Mac & Cheese", 0.00);

    public Wraps() {
        super();
    }

    public Wraps(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getSide() {
        return side1.getName();
    }

    public void setSide(Sides side) {
        this.side1 = side;
    }
}
