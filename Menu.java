public class Menu {

    private Item menu[][] = new Item[5][4];

    public Menu() {

        Item CatfishBites = new Appetizer("Catfish Bites", 6.50);
        menu[0][0] = CatfishBites;
        Item CheesestickTrio = new Appetizer("Cheesestick Trio", 14.00);
        menu [0][1] = CheesestickTrio;
        Item ChickenQuesadilla = new Appetizer("Chicken Quesadilla", 7.50);
        menu [0][2] = ChickenQuesadilla;
        Item FriedVeggies = new Appetizer("Fried Veggies", 6.50);
        menu [0][3] = FriedVeggies;
        Item Broccoli = new Sides("Broccoli", 2.5);
        menu [1][0] = Broccoli;
        Item CurlyFries = new Sides("Curly Fries", 2.5);
        menu [1][1] = CurlyFries;
        Item Mac = new Sides("Mac & Cheese", 2.5);
        menu [1][2] = Mac;
        Item MashedPotatoes = new Sides("Mashed Potatoes", 2.5);
        menu [1][3] = MashedPotatoes;
        Item Coffee = new Beverages("Coffee", 2.00);
        menu [2][0] = Coffee;
        Item Coke = new Beverages("Coke", 2.00);
        menu [2][1] = Coke;
        Item Lemonade = new Beverages("Lemonade", 2.00);
        menu [2][2] = Lemonade;
        Item SweetTea = new Beverages("Sweet Tea", 2.00);
        menu [2][3] = SweetTea;
        Item ChickenBLT = new Wraps("Chicken BLT", 10.00);
        menu [3][0] = ChickenBLT;
        Item ChickenCaesar = new Wraps("Chicken Caesar", 10.00);
        menu [3][1] = ChickenCaesar;
        Item Club = new Wraps("Club", 10.00);
        menu [3][2] = Club;
        Item Veggie = new Wraps("Veggie", 10.00);
        menu [3][3] = Veggie;
        Item PorkChops = new Entrees("Grilled Pork Chops", 11.00);
        menu [4][0] = PorkChops;
        Item SearedTuna = new Entrees("Seared Tuna", 15.00);
        menu [4][1] = SearedTuna;
        Item ShrimpGrits = new Entrees("Shrimp & Grits", 13.50);
        menu [4][2] = ShrimpGrits;
        Item SweetTeaFriedChicken = new Entrees("Sweet Tea Fried Chicken", 11.50);
        menu [4][3] = SweetTeaFriedChicken;



    }

    public Item[][] getMenu() {
        return menu;
    }

    public void setMenu(Item[][] menu) {
        this.menu = menu;
    }
}
