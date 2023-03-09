public class AcousticGuitar implements IGuitar {

    private Cart cart = new Cart();
    @Override
    public String getDescription() {
        return "Acoustic Guitar";
    }

    @Override
    public double getCost() {
        return 40.00;
    }

    public void addCart(Cart cart)
    {
        cart = cart;
    }

}
