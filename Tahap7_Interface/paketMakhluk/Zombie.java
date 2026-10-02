package paketMakhluk;

public class Zombie extends Makhluk {
    public Zombie(String nama) {
        super(nama);
    }

    public void serang() {
        System.out.println(getNama() + ": menyerang pelan");
    }
}
