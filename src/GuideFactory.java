public class GuideFactory {
    enum GuideEnum {
        BEGINNER {
            @Override
            public GuideDecorator getInstance(IGuitar target) {
                return new BeginnerGuide(target);
            }
        },
        INTERMEDIATE {
            @Override
            public GuideDecorator getInstance(IGuitar target) {
                return new IntermediateGuide(target);
            }
        },
        ADVANCE {
            @Override
            public GuideDecorator getInstance(IGuitar target) {
                return new AdvanceGuide(target);
            }
        };

        public abstract GuideDecorator getInstance(IGuitar target);
    }

    static IGuitar decorateGuitar(GuideFactory.GuideEnum[] guides, IGuitar target) {
        for (GuideFactory.GuideEnum guide : guides) {
            target = guide.getInstance(target);
        }
        return target;
    }
}

