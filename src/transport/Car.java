package transport;

public class Car {
    private String color, transmission, regNumber;
    private final String brand, model, country, bodyType;
    private final int year, numSeats;
    private double engineVolume;

    private boolean tire;


    public Car(String brand, String model, double engineVolume, String transmission, int year,
               String country, String color, String bodyType, int numSeats, String regNumber) {


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
        if (regNumber == null || regNumber.isBlank()) regNumber = "<<номер неизвестен>>";
        this.regNumber = regNumber;
        this.bodyType = bodyType;
        if (engineVolume <= 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
        if (year <= 0) year = 2000;
        this.year = year;
        if (numSeats <= 0) numSeats = 5;
        this.numSeats = numSeats;

    }


    private String getTire(boolean tire) {
        if (tire)
            return "летнии";
        return "зимнии";
    }

    public void setTire(int mount) {
        if (mount < 1 || mount > 12) {
            System.out.println("Введите правильное число месяцев!");
        } else if (mount > 3 && mount < 12) {
            tire = true;
        }
    }


    private boolean checkRegNum(String regNumber) {
        boolean bool = true;
        char check;
        int count = 0;
        while (count < regNumber.length() && bool) {
            check = regNumber.charAt(count);

            if (!Character.isDigit(check) && (count > 5 || count <= 3 && count != 0)) {
                bool = false;
            }
            if ((check != 'а' && check != 'в' && check != 'е' && check != 'к' &&
                    check != 'м' && check != 'н' && check != 'о' && check != 'р' &&
                    check != 'с' && check != 'т' && check != 'у' && check != 'х') && (count == 0 || count == 4 || count == 5)) {
                bool = false;
            }
            count++;
        }
        return bool;
    }

    public void setTire(String mount) {
        if (mount.equals("летнии"))
            tire = true;
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


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) engineVolume = 1.5;
        this.engineVolume = engineVolume;
    }

    public String getRegNumber() {
        if (!checkRegNum(regNumber))
            return "<<Ошибка в регистрационном номере>>";
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) regNumber = "<<номер неизвестен>>";
        this.regNumber = regNumber;
    }


    @Override
    public String toString() {
        return "Марка: " + brand + "\nМодель: " + model + "\nОбъем двигателя: " + engineVolume + " л." +
                "\nТрансмиссия: " + transmission + "\nГод производства: " + year + "\nСтрана сборки: " +
                country + "\nЦвет: " + color + "\nТип кузова: " + bodyType + "\nКоличество мест: " + numSeats +
                "\nУстановлены шины: " + getTire(tire) + "\nРегистрационный номер: " + getRegNumber();
    }
}
