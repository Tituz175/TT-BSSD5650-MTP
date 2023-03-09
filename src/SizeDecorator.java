public abstract class SizeDecorator implements IGuitar {
    IGuitar tempGuitar;

    public SizeDecorator(IGuitar tempGuitar) {
        this.tempGuitar = tempGuitar;
    }

    @Override
    public String getDescription() {
        return tempGuitar.getDescription();
    }

    @Override
    public double getCost() {
        return tempGuitar.getCost();
    }
}
