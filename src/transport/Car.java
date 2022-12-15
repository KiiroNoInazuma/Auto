package transport;

public class Car {
    private String color, transmission, regNumber;
    private final String brand, model, country, bodyType;
    private final int year, numSeats;
    private double engineVolume;

    private boolean rubber;


    public Car(String brand, String model, double engineVolume, String transmission, int year, String country, String color, String bodyType, int numSeats) {

        String def = "default";
        if (brand == null || brand.isBlank()) brand = def;
        this.brand = brand;
        if (model == null || model.isBlank()) model = def;
        this.model = model;
        if (country == null || country.isBlank()) country = def;
        this.country = country;
        if (color == null || color.isBlank()) color = "белый";
        this.color = color;
        if (transmission == null || transmission.isBlank()) transmission = "механическая";
        this.transmission = transmission;
        if (bodyType == null || bodyType.isBlank()) bodyType = def;
        this.bodyType = bodyType;
        if (engineVolume <= 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
        if (year <= 0) year = 2000;
        this.year = year;
        if (numSeats <= 0) numSeats = 5;
        this.numSeats = numSeats;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) color = "белого";
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) transmission = "механическая";
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\nМодель: " + model + "\nОбъем двигателя: " + engineVolume + " л." + "\nТрансмиссия: " + transmission + "\nГод производства: " + year + "\nСтрана сборки: "
                + country + "\nЦвет: " + color + "\nТип кузова: "
                + bodyType + "\nКоличество мест: " + numSeats;
    }
}
