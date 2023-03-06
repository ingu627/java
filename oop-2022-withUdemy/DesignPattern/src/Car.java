public class Car {

    private String brand;
    private String name;
    private String color;
    private int numOfDoors;
    private int horsePower;

//    public Car(String brand, String name, String color, int numOfDoors, int horsePower) {
//        this.brand = brand;
//        this.name = name;
//        this.color = color;
//        this.numOfDoors = numOfDoors;
//        this.horsePower = horsePower;
//    }

    private Car() {

    }

    public static class CarBuilder {

        private String brand;
        private String name;
        private String color;
        private int numOfDoors;
        private int horsePower;

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder setNumOfDoors(int numOfDoors) {
            this.numOfDoors = numOfDoors;
            return this;
        }
        public CarBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.brand = this.brand;
            car.name = this.name;
            car.color = this.color;
            car.numOfDoors = this.numOfDoors;
            car.horsePower = this.horsePower;
            return car;
        }
    }

    public String getBrand() {
        return brand;
    }

//    public void setBrand(String brand) {
//        this.brand = brand;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getColor() {
        return color;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

//    public void setNumOfDoors(int numOfDoors) {
//        this.numOfDoors = numOfDoors;
//    }

    public int getHorsePower() {
        return horsePower;
    }

//    public void setHorsePower(int horsePower) {
//        this.horsePower = horsePower;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", numOfDoors=" + numOfDoors +
                ", horsePower=" + horsePower +
                '}';
    }
}
