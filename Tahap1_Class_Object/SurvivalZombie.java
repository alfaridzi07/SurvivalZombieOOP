class Survivor {
    // atribut (state)
    String nama;
    int nyawa = 100;

    // method (behavior)
    void terluka(int damage) {
        nyawa = nyawa - damage;
    }

    void printStatus() {
        System.out.println(nama + " - nyawa: " + nyawa);
    }
}

public class SurvivalZombie {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Survival Zombie");

        Survivor rina = new Survivor();
        rina.nama = "Rina";
        rina.terluka(30);

        Survivor dani = new Survivor();
        dani.nama = "Dani";
        dani.terluka(10);

        rina.printStatus();
        dani.printStatus();
    }
}
