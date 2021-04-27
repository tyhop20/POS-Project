public class Wraps extends Item  {

    private Sides side;

    public Wraps() {
        super();
    }

    public Wraps(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Sides getSide() {
        return side;
    }

    public void setSide(Sides side) {
        this.side = side;
    }
}
