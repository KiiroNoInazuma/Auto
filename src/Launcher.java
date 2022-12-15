public class Launcher {
    public static void main(String[] args) {
        Car lada = new Car(null, " ", 0, "", null, -1);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3);
        Car bmw = new Car("BMW", "Z8", 2021, "Германии", "черного", 3);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красного", 2.4);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6);


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}
