public class Entrees extends Item {

    private Sides side1;
    private Sides side2;

    public Entrees() {
        super();
    }

    public Entrees(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Sides getSide1() {
        return side1;
    }

    public void setSide1(Sides side1) {
        this.side1 = side1;
    }

    public Sides getSide2() {
        return side2;
    }

    public void setSide2(Sides side2) {
        this.side2 = side2;
    }
}
