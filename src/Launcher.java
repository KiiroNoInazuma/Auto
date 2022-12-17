import transport.Car;

public class Launcher {
    public static void main(String[] args) {

        Car lada = new Car(null, " ", -1, " ", -1, "", "", " ", -3, "f486ст777");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "механическая", 2020, "Германия", "черный", "cедан", 4, "о456нр777");
        Car bmw = new Car("BMW", "Z8", 3, "автоматическая", 2021, "Германия", "черный", "купе", 2, "о456нр777");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "электромеханическая", 2018, "Южная Корея", "красный", "купе", 2, "о456нр777");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "электромеханическая", 2016, "Южной Корея", "оранжевый", "хэтчбэк", 5, "о456нр777");
        Car.Key key = bmw.new Key("да", "нет");
        Car.Insurance ins = bmw.new Insurance("20.12.2023", 1000.00, 931212123);
        Car.Key keyAudi = bmw.new Key("нет", "да");
        Car.Insurance insAudi = bmw.new Insurance("31.12.2022", 10000.00, 222222123);
        bmw.setRegNumber("о555Тс777");
        bmw.setUpKey(key);
        bmw.setInsurance(ins);
        audi.setUpKey(keyAudi);
        audi.setInsurance(insAudi);
        Car.showInfo(bmw, audi);


    }
}
