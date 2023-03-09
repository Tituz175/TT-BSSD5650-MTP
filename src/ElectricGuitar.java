public class ElectricGuitar implements IGuitar{

    private Cart cart = new Cart();

    @Override
    public String getDescription() {
        return "Electric Guitar";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
    public void addCart(Cart cart)
    {
        cart = cart;
    }
}
