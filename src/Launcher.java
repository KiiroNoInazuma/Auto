import transport.Car;

public class Launcher {
    public static void main(String[] args) {
        String separator = "==================================";

        Car lada = new Car(null, " ", -1, " ", -1, "", "", " ", -3, "f486ст777");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3, "механическая", 2020, "Германия", "черный", "cедан", 4, "о456нр777");
        Car bmw = new Car("BMW", "Z8", 3, "автоматическая", 2021, "Германия", "черный", "купе", 2, "о456нр777");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "электромеханическая", 2018, "Южная Корея", "красный", "купе", 2, "о456нр777");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "электромеханическая", 2016, "Южной Корея", "оранжевый", "хэтчбэк", 5, "о456нр777");


        lada.setTire("летнии");
        hyundai.setRegNumber("");


        System.out.println(lada);
        System.out.println(separator);
        System.out.println(audi);
        System.out.println(separator);
        System.out.println(bmw);
        System.out.println(separator);
        System.out.println(kia);
        System.out.println(separator);
        System.out.println(hyundai);


    }
}
