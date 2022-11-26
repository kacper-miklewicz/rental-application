package pl.pjatk.kmiklewicz;

public class Car {
    private String make;
    private String model;
    private int vin;
    private CarType type;

    public Car(String make, String model, int vin, CarType type) {
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vin=" + vin +
                ", type=" + type +
                '}';
    }
}
