public class IntermediateGuide extends GuideDecorator{

    public IntermediateGuide(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Intermediate Instructional Guide";
    }

    @Override
    public double getCost() {
        return super.getCost() + 6.00;
    }
}
