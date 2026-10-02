package paketMakhluk;

public class ZombieRaksasa extends Zombie {
    private static final int BONUS_DAMAGE = 25;   // konstanta static

    public ZombieRaksasa(String nama) {
        super(nama);
    }

    @Override
    public int serang() {
        return hitungDamage() + BONUS_DAMAGE;     // lebih kuat dari zombie biasa
    }
}
