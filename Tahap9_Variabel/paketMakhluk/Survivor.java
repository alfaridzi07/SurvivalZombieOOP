package paketMakhluk;

import paketSenjata.*;

public class Survivor extends Makhluk {
    private static final int AMUNISI_MAKS = 3;   // konstanta static

    private int amunisi = AMUNISI_MAKS;

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
        amunisi = AMUNISI_MAKS;
    }

    public int getAmunisi() {
        return amunisi;
    }
}
