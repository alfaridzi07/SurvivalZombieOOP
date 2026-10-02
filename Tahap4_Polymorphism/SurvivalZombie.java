class Makhluk {
    private String nama;
    private int nyawa = 100;

    Makhluk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getNyawa() {
        return nyawa;
    }

    public boolean terluka(int damage) {
        if (damage <= 0) {
            return false;              // ditolak, nyawa tidak berubah
        }
        nyawa = nyawa - damage;
        if (nyawa < 0) {
            nyawa = 0;
        }
        return true;                   // damage diterima
    }

    public void printStatus() {
        System.out.println(nama + " - nyawa: " + nyawa);
    }
}

class Survivor extends Makhluk {
    private int amunisi = 3;

    Survivor(String nama) {
        super(nama);
    }

    public int tembak() {
        if (amunisi > 0) {
            amunisi = amunisi - 1;
            return 10;                 // damage satu peluru
        }
        return 0;                      // amunisi habis, tidak ada damage
    }

    public void isiUlang() {
        amunisi = 3;
    }

    public int getAmunisi() {
        return amunisi;
    }
}

class Zombie extends Makhluk {
    Zombie(String nama) {
        super(nama);
    }

    public int serang() {
        return 5;                  // damage zombie baru
    }
}

class ZombieBiasa extends Zombie {
    ZombieBiasa(String nama) {
        super(nama);
    }

    @Override
    public int serang() {
        return 10;                 // damage zombie biasa
    }
}

class ZombieRaksasa extends Zombie {
    ZombieRaksasa(String nama) {
        super(nama);
    }

    @Override
    public int serang() {
        return 35;                 // damage zombie raksasa
    }
}

public class SurvivalZombie {
    public static void main(String[] args) {
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
