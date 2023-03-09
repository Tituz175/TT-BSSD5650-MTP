public class HardCase extends BagDecorator{
    public HardCase(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Hard case";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.00;
    }
}
