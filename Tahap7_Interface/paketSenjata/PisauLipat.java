package paketSenjata;

public class PisauLipat implements Senjata {
    public String getNama() {
        return "Pisau Lipat";
    }

    public boolean butuhAmunisi() {
        return false;
    }

    public int serang() {
        return DAMAGE_DASAR;
    }
}
