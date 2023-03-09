public class GigBag extends BagDecorator{
    public GigBag(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Gig bag";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.00;
    }
}
