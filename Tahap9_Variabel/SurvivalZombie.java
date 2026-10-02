import paketMakhluk.*;
import paketSenjata.*;

public class SurvivalZombie {
    static void lawan(Zombie target, Senjata senjata) {
        int damage = senjata.serang();
        target.terluka(damage);
        target.printStatus();
    }

    public static void main(String[] args) {
        System.out.println("Survival Zombie - nyawa maksimum: " + Makhluk.NYAWA_MAKS);

        Zombie baru = new Zombie("Zombie Baru");
        ZombieBiasa lorong = new ZombieBiasa("Zombie Lorong");
        ZombieRaksasa raksasa = new ZombieRaksasa("Raksasa Gudang");

        System.out.println("Jumlah zombie di kota: " + Zombie.getJumlahZombie());
        System.out.println(lorong.getNama() + " damage (level 0): " + lorong.hitungDamage());
        lorong.setLevel(3);
        System.out.println(lorong.getNama() + " damage (level 3): " + lorong.hitungDamage());

        lawan(lorong, new Pistol());
        lawan(raksasa, new Shotgun());
    }
}
