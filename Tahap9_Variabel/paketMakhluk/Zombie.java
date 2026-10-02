package paketMakhluk;

public class Zombie extends Makhluk {
    private static int jumlahZombie = 0;   // variabel static / class
    private int level;                     // variabel instance (default 0)

    public Zombie(String nama) {
        super(nama);
        jumlahZombie++;                    // tiap zombie baru menambah hitungan
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int hitungDamage() {
        int damage = 10 + (level * 5);     // variabel lokal
        return damage;
    }

    public static int getJumlahZombie() {
        return jumlahZombie;
    }

    public int serang() {
        return hitungDamage() / 2;         // zombie baru: setengah dari damage dasar
    }
}
