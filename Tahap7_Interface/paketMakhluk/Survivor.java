package paketMakhluk;

import paketSenjata.*;

public class Survivor extends Makhluk {
    private int amunisi = 3;

    public Survivor(String nama) {
        super(nama);
    }

    public int tembak(Senjata senjata) {
        if (senjata.butuhAmunisi()) {
            if (amunisi == 0) {
                return 0;              // amunisi habis, tidak ada damage
            }
            amunisi = amunisi - 1;
        }
        return senjata.serang();       // damage ditentukan oleh senjata
    }

    public void isiUlang() {
        amunisi = 3;
    }

    public int getAmunisi() {
        return amunisi;
    }
}
