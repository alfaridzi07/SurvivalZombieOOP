package paketMakhluk;

public class Zombie extends Makhluk {
    public Zombie(String nama) {
        super(nama);
    }

    public int serang() {
        return 5;                  // damage zombie baru
    }
}
