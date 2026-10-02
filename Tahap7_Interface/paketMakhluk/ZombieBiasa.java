package paketMakhluk;

public class ZombieBiasa extends Zombie {
    public ZombieBiasa(String nama) {
        super(nama);
    }

    @Override
    public void serang() {
        System.out.println(getNama() + ": menggigit! (damage 10)");
    }
}
