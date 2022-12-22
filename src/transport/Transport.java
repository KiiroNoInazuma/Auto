package transport;

public abstract class Transport {

    private final String brand, model, country;
    private final int year;
    private String color;
    protected double maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        String def = "default";
        if (brand == null || brand.isBlank()) brand = def;
        this.brand = brand;
        if (model == null || model.isBlank()) model = def;
        this.model = model;
        if (year <= 0) year = 2000;
        this.year = year;
        if (country == null || country.isBlank()) country = def;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    ;

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) color = "белый";
        this.color = color;
    }

    public abstract double getMaxSpeed();

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0 || maxSpeed > 1300) maxSpeed = 100;
        this.maxSpeed = maxSpeed;
    }
}
