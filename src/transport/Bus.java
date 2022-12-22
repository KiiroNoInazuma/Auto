package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color, double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void showBus(Bus bus){
        System.out.println(bus);
    }

    @Override
    public String toString() {
        return getBrand() + "\n" + getModel() + "\n" + getYear() + "\n" + getCountry() + "\n" + getColor() + "\n" + getMaxSpeed();
    }
}
