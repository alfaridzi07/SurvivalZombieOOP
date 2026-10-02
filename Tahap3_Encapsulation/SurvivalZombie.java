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
}

public class SurvivalZombie {
    public static void main(String[] args) {
        Survivor rina = new Survivor("Rina");
        for (int i = 0; i < 4; i++) {
            rina.tembak();         // tembakan ke-4 gagal
        }
        rina.isiUlang();
        System.out.println("Amunisi " + rina.getNama() + ": " + rina.getAmunisi());   // baca lewat getter
        rina.terluka(-5);          // ditolak
        rina.terluka(130);         // nyawa tidak boleh minus
        rina.printStatus();
        System.out.println("Nyawa via getter: " + rina.getNyawa());

        Zombie z = new Zombie("Zombie Lorong");
        z.terluka(40);
        z.printStatus();
    }
}
