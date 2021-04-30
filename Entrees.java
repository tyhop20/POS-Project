public class Entrees extends Item {

    private Sides side1 = new Sides("Curly Fries", 0.00);
    private Sides side2 = new Sides("Broccoli", 0.00);

    public Entrees() {
        super();
    }

    public Entrees(String name, double price) {
        super();
        this.name = name;
        this.price = price;
        this.side2 = side2;
        this.side1 = side1;
    }

    public String getSide1() {
        return side1.getName();
    }

    public void setSide1(Sides side1) {
        this.side1 = side1;
    }

    public String getSide2() {
        return side2.getName();
    }

    public void setSide2(Sides side2) {
        this.side2 = side2;
    }
}
