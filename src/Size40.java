public class Size40 extends SizeDecorator{
    public Size40(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 40 inches";
    }

    @Override
    public double getCost() {
        return super.getCost() + 8.00;
    }
}
