public class AdvanceGuide extends GuideDecorator{

    public AdvanceGuide(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Advance Instructional Guide";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.00;
    }
}
