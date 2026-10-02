import paketMakhluk.*;
import paketSenjata.*;

public class SurvivalZombie {
    static void lawan(Zombie target, Senjata senjata) {
        int damage = senjata.serang();
        target.terluka(damage);
        target.printStatus();
    }

    static void laporanKota() {
        byte    isiMagasin     = 3;             // 8-bit
        short   nomorRuangan   = 214;           // 16-bit
        int     skor           = 15000;         // 32-bit
        long    waktuBertahan  = 3600000L;      // 64-bit (akhiran L), milidetik
        float   kesehatan      = 87.5f;         // 32-bit (akhiran f)
        double  jarakZombie    = 12.75;         // 64-bit
        char    levelBahaya    = 'B';           // 1 karakter
        boolean pintuTerkunci  = true;          // true / false
        String  lokasi         = "Gudang Lantai 2";   // tipe referensi

        System.out.println("--- Laporan Survival Zombie ---");
        System.out.println("Lokasi            : " + lokasi);
        System.out.println("Isi magasin       : " + isiMagasin);
        System.out.println("Nomor ruangan     : " + nomorRuangan);
        System.out.println("Skor              : " + skor);
        System.out.println("Waktu bertahan ms : " + waktuBertahan);
        System.out.println("Kesehatan (%)     : " + kesehatan);
        System.out.println("Jarak zombie (m)  : " + jarakZombie);
        System.out.println("Level bahaya      : " + levelBahaya);
        System.out.println("Pintu terkunci    : " + pintuTerkunci);
        System.out.println("Panjang nama lokasi: " + lokasi.length());
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

        laporanKota();
    }
}
