import java.io.Serializable;

public class Car implements Serializable {

    private static final long serialVersionUID = -2170615920160760952L;

    String carBrand;
    int motorNumber;
    String color; // transient means we don't want to store this value

    public Car(String carBrand, int motorNumber, String color) {
        this.carBrand = carBrand;
        this.motorNumber = motorNumber;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.carBrand+"-"+this.motorNumber+"-"+this.color;
    }
}
