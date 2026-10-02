package paketSenjata;

public class Shotgun implements Senjata {
    public int serang() {
        System.out.println("DUAR! Shotgun menembak");
        return DAMAGE_DASAR * 5;
    }
}
