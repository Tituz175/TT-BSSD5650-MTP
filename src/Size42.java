public class Size42 extends SizeDecorator{
    public Size42(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 42 inches";
    }

    @Override
    public double getCost() {
        return super.getCost() + 12.00;
    }
}
