public class BagFactory {
    enum BagEnum {
        GIGBAG {
            @Override
            public BagDecorator getInstance(IGuitar target) {
                return new GigBag(target);
            }
        },
        HARDCASE {
            @Override
            public BagDecorator getInstance(IGuitar target) {
                return new HardCase(target);
            }
        };

        public abstract BagDecorator getInstance(IGuitar target);
    }

    static IGuitar decorateGuitar(BagFactory.BagEnum[] bags, IGuitar target) {
        for (BagFactory.BagEnum bag : bags) {
            target = bag.getInstance(target);
        }
        return target;
    }
}
