public class Car {
    private String brand;
    private String model;
    private double fuelLevel;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.fuelLevel = 5.0;
    }

    public void refuel(double amount) {
            fuelLevel += amount;
    }

    public void drive(double distance) {
        fuelLevel -= distance*0.1;
    }
}
