public class Size38 extends SizeDecorator{
    public Size38(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 38 inches";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.00;
    }
}
