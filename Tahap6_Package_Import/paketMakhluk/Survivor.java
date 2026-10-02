package paketMakhluk;

public class Survivor extends Makhluk {
    private int amunisi = 3;

    public Survivor(String nama) {
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
