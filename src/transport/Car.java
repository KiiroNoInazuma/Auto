package transport;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car {
    private String color, transmission, regNumber;
    private final String brand, model, country, bodyType;
    private final int year, numSeats;
    private double engineVolume;

    private boolean tire;
    private Key key;
    private Insurance insurance;


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

        if (LocalDate.now().getMonth().getValue() < 3 && LocalDate.now().getMonth().getValue() > 11) {
            tire = true;
        }
    }


    public class Key {
        private final boolean remoteEngStart;
        private final boolean keyEntry;

        public Key(String remoteEngStart, String keyEntry) {
            if (remoteEngStart == null || remoteEngStart.isBlank()) remoteEngStart = "нет";
            this.remoteEngStart = remoteEngStart.equals("да");
            if (keyEntry == null || keyEntry.isBlank()) keyEntry = "нет";
            if (keyEntry.equals("да")) {
                this.keyEntry = true;
            } else {
                this.keyEntry = false;
            }
        }

        private boolean isRemoteEngStart() {
            return remoteEngStart;
        }

        private boolean isKeyEntry() {
            return keyEntry;
        }


        private String engStart() {
            if (isRemoteEngStart()) {
                return "да";
            } else {
                return "нет";
            }
        }

        private String keyEnt() {
            if (isKeyEntry()) {
                return "да";
            } else {

                return "нет";
            }
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя: " + engStart() + "\nБесключевой доступ: " + keyEnt();
        }
    }


    public void setUpKey(Key key) {
        this.key = key;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public class Insurance {
        private final String validity;
        private final double insCost;
        private final int insId;

        public Insurance(String validity, double insCost, int insId) {
            if (validity == null || validity.isBlank()) validity = "Страховка не оформлена";
            this.validity = validity;
            if (insCost <= 0) insCost = 1000;
            this.insCost = insCost;
            if (insId <= 0) insId = 111111111;
            this.insId = insId;
        }


        private String checkIns() {
            double days;
            double mounts;
            int years;
            double result;
            int checkDateIns = LocalDate.parse(validity, DateTimeFormatter.ofPattern("dd.MM.yyyy")).getDayOfYear() - LocalDate.now().getDayOfYear();
            result = checkDateIns / 365;
            mounts = result * 12;
            days = (checkDateIns <= 3 || mounts == 0) ? checkDateIns : (mounts - (int) mounts) * 31;
            years = (int) result;
            if (checkDateIns <= 0) {
                return "действие страхового полиса окончено";
            } else {
                return (int) days + "д." + (int) mounts + "м." /*+ years + "г."*/;
            }
        }

        boolean checkNumLenIns() {
            return String.valueOf(insId).length() == 9;
        }

        @Override
        public String toString() {
            if (checkNumLenIns()) {
                return "До конца страховки осталось: " + checkIns();
            } else {
                return "Введен неверный номер страхового полиса!";
            }
        }
    }


    private String getTire(boolean tire) {
        if (tire)
            return "летнии";
        return "зимнии";
    }

    public void setTire(int mount) {
        if (mount < 1 || mount > 12) {
            System.out.println("Введите правильное число месяцев!");
        } else if (mount > 3 && mount < 11) {
            tire = true;
        }
    }

    public void setTire(String season) {
        if (season.equals("летнии"))
            tire = true;
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
        if (!checkRegNum(regNumber) && !regNumber.startsWith("х000хх000"))
            return regNumber + " <<ошибка в регистрационном номере>>";
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null || regNumber.isBlank()) regNumber = "х000хх000 <<номер неизвестен>>";
        this.regNumber = regNumber.toLowerCase();
    }


    public static void showInfo(Car... car) {
        for (Car show : car) {
            System.out.println(show);
            if (show.key == null) {
                System.out.println("Не определены параметры доп.опций!");
            } else {
                System.out.println(show.key);
            }
            if (show.insurance == null) {
                System.out.println("Страховка не оформлена!");
            } else {
                System.out.println(show.insurance);
            }
            System.out.println("==============================================");
        }
    }

    @Override
    public String toString() {
        return "Марка: " + brand + "\nМодель: " + model + "\nОбъем двигателя: " + engineVolume + " л." +
                "\nТрансмиссия: " + transmission + "\nГод производства: " + year + "\nСтрана сборки: " +
                country + "\nЦвет: " + color + "\nТип кузова: " + bodyType + "\nКоличество мест: " + numSeats +
                "\nУстановлены шины: " + getTire(tire) + "\nРегистрационный номер: " + getRegNumber();

    }
}