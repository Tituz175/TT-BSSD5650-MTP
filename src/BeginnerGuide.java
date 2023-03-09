public class BeginnerGuide extends GuideDecorator{
    public BeginnerGuide(IGuitar tempGuitar) {
        super(tempGuitar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Beginner Instructional Guide";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.00;
    }
}
