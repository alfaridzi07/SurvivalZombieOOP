import paketMakhluk.*;

public class SurvivalZombie {
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

            int tembakan = rina.tembak();   // Rina membalas setelah tiap serangan
            if (tembakan > 0) {
                z.terluka(tembakan);
                System.out.println(rina.getNama() + " menembak " + z.getNama() + " (damage " + tembakan + "), sisa amunisi: " + rina.getAmunisi());
            } else {
                System.out.println(rina.getNama() + ": amunisi habis!");
            }
        }

        rina.printStatus();
        if (rina.getNyawa() > 0) {
            System.out.println(rina.getNama() + " masih bertahan");
        } else {
            System.out.println(rina.getNama() + " gugur");
        }

        rina.isiUlang();
        System.out.println(rina.getNama() + " mengisi ulang amunisi");
        System.out.println("Amunisi " + rina.getNama() + ": " + rina.getAmunisi());
    }
}
