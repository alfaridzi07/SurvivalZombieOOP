class Makhluk {
    String nama;
    int nyawa = 100;

    void terluka(int damage) {
        nyawa = nyawa - damage;
    }

    void printStatus() {
        System.out.println(nama + " - nyawa: " + nyawa);
    }
}

class Survivor extends Makhluk {
    int amunisi = 3;

    int tembak() {
        amunisi = amunisi - 1;
        return 10;                 // damage satu peluru
    }
}

class Zombie extends Makhluk {
    void menggigit() {
        System.out.println(nama + ": GRAAAH! (menggigit)");
    }
}

public class SurvivalZombie {
    public static void main(String[] args) {
        Survivor rina = new Survivor();
        rina.nama = "Rina";
        int damage = rina.tembak();   // milik Survivor
        System.out.println(rina.nama + " menembak! (damage " + damage + "), sisa amunisi: " + rina.amunisi);
        rina.printStatus();       // diwarisi dari Makhluk

        Zombie zombie = new Zombie();
        zombie.nama = "Zombie Lorong";
        zombie.terluka(40);       // diwarisi dari Makhluk
        zombie.printStatus();
        zombie.menggigit();       // milik Zombie
    }
}
