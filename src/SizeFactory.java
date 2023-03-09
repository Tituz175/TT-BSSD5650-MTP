public class SizeFactory {
    enum SizeEnum {
        SIZE38 {
            @Override
            public SizeDecorator getInstance(IGuitar target) {
                return new Size38(target);
            }
        },
        SIZE40 {
            @Override
            public SizeDecorator getInstance(IGuitar target) {
                return new Size40(target);
            }
        },
        SIZE42 {
            @Override
            public SizeDecorator getInstance(IGuitar target) {
                return new Size42(target);
            }
        };

        public abstract SizeDecorator getInstance(IGuitar target);
    }

    static IGuitar decorateGuitar(SizeFactory.SizeEnum[] sizes, IGuitar target) {
        for (SizeFactory.SizeEnum size : sizes) {
            target = size.getInstance(target);
        }
        return target;
    }
}
