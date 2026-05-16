package CM;

public class Pembeli02 {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public Pembeli02(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampil() {
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t\t" + noHp);
    }
}