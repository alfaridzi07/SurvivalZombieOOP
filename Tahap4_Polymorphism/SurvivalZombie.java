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

    public void serang() {
        System.out.println(getNama() + ": menyerang pelan");
    }
}

class ZombieBiasa extends Zombie {
    ZombieBiasa(String nama) {
        super(nama);
    }

    @Override
    public void serang() {
        System.out.println(getNama() + ": menggigit! (damage 10)");
    }
}

class ZombieRaksasa extends Zombie {
    ZombieRaksasa(String nama) {
        super(nama);
    }

    @Override
    public void serang() {
        System.out.println(getNama() + ": membanting! (damage 35)");
    }
}

public class SurvivalZombie {
    public static void main(String[] args) {
        Zombie baru = new Zombie("Zombie Baru");
        ZombieBiasa lorong = new ZombieBiasa("Zombie Lorong");
        ZombieRaksasa raksasa = new ZombieRaksasa("Raksasa Gudang");

        Zombie[] kota = { baru, lorong, raksasa };
        for (Zombie z : kota) {
            z.serang();            // satu perintah, perilaku berbeda
        }
    }
}
