package paketSenjata;

public class Pistol implements Senjata {
    public String getNama() {
        return "Pistol";
    }

    public boolean butuhAmunisi() {
        return true;
    }

    public int serang() {
        return DAMAGE_DASAR * 2;
    }
}
