public abstract class BagDecorator implements IGuitar {
    IGuitar tempGuitar;

    public BagDecorator(IGuitar tempGuitar) {
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
