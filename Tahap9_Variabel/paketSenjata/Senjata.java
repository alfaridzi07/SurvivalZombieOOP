package paketSenjata;

public interface Senjata {
    int DAMAGE_DASAR = 10;      // otomatis public static final
    String getNama();           // otomatis public abstract
    int serang();               // otomatis public abstract: mengembalikan damage
    boolean butuhAmunisi();     // otomatis public abstract: true kalau memakai amunisi
}
