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
}

public class SurvivalZombie {
    public static void main(String[] args) {
        Survivor rina = new Survivor("Rina");
        Zombie z = new Zombie("Zombie Lorong");

        for (int i = 0; i < 4; i++) {
            int damage = rina.tembak();    // tembakan ke-4 gagal (hasilnya 0)
            if (damage > 0) {
                z.terluka(damage);
                System.out.println(rina.getNama() + " menembak " + z.getNama() + " (damage " + damage + "), sisa amunisi: " + rina.getAmunisi());
            } else {
                System.out.println(rina.getNama() + ": amunisi habis!");
            }
        }
        rina.isiUlang();
        System.out.println(rina.getNama() + " mengisi ulang amunisi");
        System.out.println("Amunisi " + rina.getNama() + ": " + rina.getAmunisi());   // baca lewat getter

        if (!rina.terluka(-5)) {           // ditolak
            System.out.println("Damage harus lebih dari 0");
        }
        rina.terluka(130);                 // nyawa tidak boleh minus
        rina.printStatus();
        System.out.println("Nyawa via getter: " + rina.getNyawa());

        z.terluka(40);
        z.printStatus();
    }
}
