import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<IGuitar> item = new ArrayList<>();

    public void addToCart(IGuitar iGuitar) {
        item.add(iGuitar);
    }

    public void removeFromCart(IGuitar iGuitar) {
        item.remove(iGuitar);
    }

    public void showCart() {
        for (IGuitar iGuitar : item) {
            System.out.println(iGuitar.getDescription());
            System.out.println(iGuitar.getCost());
        }
    }

    public void cartSum() {
        double totalSum = 0;
        for (IGuitar iGuitar : item) {
            totalSum += iGuitar.getCost();
        }
        System.out.println("Total: $" + totalSum + ".");
    }
}
