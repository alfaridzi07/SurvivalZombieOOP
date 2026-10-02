package paketMakhluk;

public class Makhluk {
    private String nama;
    private int nyawa = 100;

    public Makhluk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void terluka(int damage) {
        if (damage <= 0) {
            System.out.println("Damage harus lebih dari 0");
        } else {
            nyawa = nyawa - damage;
            if (nyawa < 0) {
                nyawa = 0;
            }
        }
    }

    public void printStatus() {
        System.out.println(nama + " - nyawa: " + nyawa);
    }
}
