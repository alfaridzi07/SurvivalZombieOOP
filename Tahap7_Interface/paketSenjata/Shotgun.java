package paketSenjata;

public class Shotgun implements Senjata {
    public String getNama() {
        return "Shotgun";
    }

    public boolean butuhAmunisi() {
        return true;
    }

    public int serang() {
        return DAMAGE_DASAR * 5;
    }
}
