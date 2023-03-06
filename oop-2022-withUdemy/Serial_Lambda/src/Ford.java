public class Ford extends Car {

    private String fordType;

    public Ford(String carBrand, int motorNumber, String color, String fordType) {
        super(carBrand, motorNumber, color);
        this.fordType = fordType;
    }
}
