public class Launcher {
    public static void main(String[] args) {
        Auto lada = new Auto(null, " ", 0, "", null, -1);
        Auto audi = new Auto("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черного", 3);
        Auto bmw = new Auto("BMW", "Z8", 2021, "Германии", "черного", 3);
        Auto kia = new Auto("Kia", "Sportage 4-го поколения", 2018, "Южной Корее", "красного", 2.4);
        Auto hyundai = new Auto("Hyundai", "Avante", 2016, "Южной Корее", "оранжевого", 1.6);


        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}
