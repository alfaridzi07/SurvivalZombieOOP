package paketMakhluk;

public class Survivor extends Makhluk {
    private int amunisi = 3;

    public Survivor(String nama) {
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
