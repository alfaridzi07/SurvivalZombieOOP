import paketMakhluk.*;

public class SurvivalZombie {
    public static void main(String[] args) {
        System.out.println("Selamat datang di Survival Zombie");

        Zombie baru = new Zombie("Zombie Baru");
        ZombieBiasa lorong = new ZombieBiasa("Zombie Lorong");
        ZombieRaksasa raksasa = new ZombieRaksasa("Raksasa Gudang");

        Zombie[] kota = { baru, lorong, raksasa };
        for (Zombie z : kota) {
            z.serang();
        }

        Survivor rina = new Survivor("Rina");
        rina.tembak();
    }
}
