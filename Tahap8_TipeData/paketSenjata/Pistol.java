package paketSenjata;

public class Pistol implements Senjata {
    public String getNama() {
        return "Pistol";
    }

    public int serang() {
        return DAMAGE_DASAR * 2;
    }
}
