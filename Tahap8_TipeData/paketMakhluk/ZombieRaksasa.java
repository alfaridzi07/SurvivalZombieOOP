package paketMakhluk;

public class ZombieRaksasa extends Zombie {
    public ZombieRaksasa(String nama) {
        super(nama);
    }

    @Override
    public void serang() {
        System.out.println(getNama() + ": membanting! (damage 35)");
    }
}
