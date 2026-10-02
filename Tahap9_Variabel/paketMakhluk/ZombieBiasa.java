package paketMakhluk;

public class ZombieBiasa extends Zombie {
    public ZombieBiasa(String nama) {
        super(nama);
    }

    @Override
    public int serang() {
        return hitungDamage();             // damage penuh, ikut naik bersama level
    }
}
