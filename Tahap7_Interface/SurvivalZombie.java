import paketMakhluk.*;
import paketSenjata.*;

public class SurvivalZombie {
    static void lawan(Zombie target, Senjata senjata) {
        int damage = senjata.serang();
        System.out.println(senjata.getNama() + " mengenai " + target.getNama() + " (damage " + damage + ")");
        target.terluka(damage);
        target.printStatus();
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di Survival Zombie");

        Survivor rina = new Survivor("Rina");

        Zombie baru = new Zombie("Zombie Baru");
        ZombieBiasa lorong = new ZombieBiasa("Zombie Lorong");
        ZombieRaksasa raksasa = new ZombieRaksasa("Raksasa Gudang");

        Zombie[] kota = { baru, lorong, raksasa };
        for (Zombie z : kota) {
            int damage = z.serang();   // satu perintah, damage berbeda tiap jenis zombie
            System.out.println(z.getNama() + " menyerang " + rina.getNama() + " (damage " + damage + ")");
            rina.terluka(damage);
            rina.tembak();             // Rina menembak setelah tiap serangan
        }

        rina.printStatus();
        if (rina.getNyawa() > 0) {
            System.out.println(rina.getNama() + " masih bertahan");
        } else {
            System.out.println(rina.getNama() + " gugur");
        }

        rina.isiUlang();
        System.out.println("Amunisi " + rina.getNama() + ": " + rina.getAmunisi());

        lawan(lorong, new Pistol());
        lawan(raksasa, new Shotgun());
        lawan(lorong, new PisauLipat());
    }
}
