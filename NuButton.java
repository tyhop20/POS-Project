import javax.swing.*;

public class NuButton extends JButton {

    private Item item;


    public NuButton(Item item) {
        super();
        this.item = item;
        this.setText(item.getName());
    }

    public Item getItem() {
        return item;
    }


}
