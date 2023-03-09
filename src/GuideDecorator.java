public abstract class GuideDecorator implements IGuitar{
    IGuitar tempGuitar;

    public GuideDecorator(IGuitar tempGuitar) {
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
