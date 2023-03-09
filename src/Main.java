import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cart my_cart = new Cart();
        IGuitar guitar_1 = new Size42(new HardCase(new AdvanceGuide(new AcousticElectricGuitar())));
        my_cart.addToCart(guitar_1);
        AcousticGuitar guitar_2 = new AcousticGuitar();
        my_cart.addToCart(guitar_2);
        AcousticGuitar guitar_3 = new AcousticGuitar();
        my_cart.addToCart(guitar_3);
        ElectricGuitar guitar_4 = new ElectricGuitar();
        my_cart.addToCart(guitar_4);
        AcousticElectricGuitar guitar_5 = new AcousticElectricGuitar();
        my_cart.addToCart(guitar_5);
        IGuitar guitar_6 = GuitarFactory.createGuitar(GuitarFactory.GuitarEnum.ELECTRO_ACOUSTIC);
        guitar_6 = new HardCase(new AdvanceGuide(new Size42(guitar_6)));
        my_cart.addToCart(guitar_6);
        my_cart.showCart();
        my_cart.cartSum();
    }
}