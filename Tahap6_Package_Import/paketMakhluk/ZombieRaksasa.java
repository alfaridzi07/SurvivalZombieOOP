package paketMakhluk;

public class ZombieRaksasa extends Zombie {
    public ZombieRaksasa(String nama) {
        super(nama);
    }

    @Override
    public int serang() {
        return 35;                 // damage zombie raksasa
    }
}
