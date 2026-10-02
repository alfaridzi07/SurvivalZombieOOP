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

    public void terluka(int damage) {
        if (damage <= 0) {
            System.out.println("Damage harus lebih dari 0");
        } else {
            nyawa = nyawa - damage;
            if (nyawa < 0) {
                nyawa = 0;
            }
        }
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

    public void tembak() {
        if (amunisi > 0) {
            amunisi = amunisi - 1;
            System.out.println(getNama() + " menembak! Sisa amunisi: " + amunisi);
        } else {
            System.out.println(getNama() + ": amunisi habis!");
        }
    }

    public void isiUlang() {
        amunisi = 3;
        System.out.println(getNama() + " mengisi ulang amunisi");
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
    }
}
