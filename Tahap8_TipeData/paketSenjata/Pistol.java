package paketSenjata;

public class Pistol implements Senjata {
    public int serang() {
        System.out.println("DOR! Pistol menembak");
        return DAMAGE_DASAR * 2;
    }
}
