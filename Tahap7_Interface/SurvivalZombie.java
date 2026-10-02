import paketMakhluk.*;
import paketSenjata.*;

public class SurvivalZombie {
    static void lawan(Zombie target, Senjata senjata) {
        int damage = senjata.serang();
        target.terluka(damage);
        target.printStatus();
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di Survival Zombie");

        Zombie baru = new Zombie("Zombie Baru");
        ZombieBiasa lorong = new ZombieBiasa("Zombie Lorong");
        ZombieRaksasa raksasa = new ZombieRaksasa("Raksasa Gudang");

        Zombie[] kota = { baru, lorong, raksasa };
        for (Zombie z : kota) {
            z.serang();
        }

        lawan(lorong, new Pistol());
        lawan(raksasa, new Shotgun());
        lawan(lorong, new PisauLipat());
    }
}
