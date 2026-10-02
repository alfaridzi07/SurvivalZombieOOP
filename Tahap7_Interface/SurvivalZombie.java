import paketMakhluk.*;
import paketSenjata.*;

public class SurvivalZombie {
    static void lawan(Survivor penembak, Zombie target, Senjata senjata) {
        int damage = penembak.tembak(senjata);
        if (damage == 0) {
            System.out.println(penembak.getNama() + ": amunisi habis!");
            return;
        }

        System.out.println(penembak.getNama() + " memakai " + senjata.getNama() + " ke " + target.getNama() + " (damage " + damage + ")");
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
        }

        rina.printStatus();
        if (rina.getNyawa() > 0) {
            System.out.println(rina.getNama() + " masih bertahan");
        } else {
            System.out.println(rina.getNama() + " gugur");
        }

        lawan(rina, lorong, new Pistol());
        lawan(rina, raksasa, new Shotgun());
        lawan(rina, lorong, new PisauLipat());

        System.out.println("Sisa amunisi " + rina.getNama() + ": " + rina.getAmunisi());   // pisau lipat tidak memakai amunisi
        rina.isiUlang();
        System.out.println(rina.getNama() + " mengisi ulang amunisi: " + rina.getAmunisi());
    }
}
