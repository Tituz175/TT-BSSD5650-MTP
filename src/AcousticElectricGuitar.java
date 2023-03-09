public class AcousticElectricGuitar implements IGuitar{
    private Cart cart = new Cart();

    @Override
    public String getDescription() {
        return "Acoustic Electric Guitar";
    }

    @Override
    public double getCost() {
        return 60.00;
    }
    public void addCart(Cart cart)
    {
        cart = cart;
    }
}
