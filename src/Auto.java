public class Auto {
    String brand, model, color, country;
    double engineVolume;
    int year;


    Auto(String brand, String model, int year, String country, String color, double engineVolume) {

        String def = "default";
        if (brand == null || brand.isBlank()) brand = def;
        if (model == null || model.isBlank()) model = def;
        if (country == null || country.isBlank()) country = def;
        if (color == null || color.isBlank()) color = "белого";

        if (engineVolume <= 0) engineVolume = 1.5;
        if (year <= 0) year = 2000;

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;


    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
    }
}
