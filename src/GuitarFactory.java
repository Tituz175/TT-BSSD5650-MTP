public class GuitarFactory {

    enum GuitarEnum {
        ACOUSTIC,
        ELECTRO_ACOUSTIC,
        ELECTRIC
    }

    static IGuitar createGuitar(GuitarEnum type){
        switch (type) {
            case ACOUSTIC -> {
                return new AcousticGuitar();
            }
            case ELECTRO_ACOUSTIC -> {
                return new AcousticElectricGuitar();
            }
            case ELECTRIC -> {
                return new ElectricGuitar();
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
