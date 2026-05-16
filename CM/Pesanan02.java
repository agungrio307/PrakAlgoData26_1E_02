package CM;

public class Pesanan02 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;

    public Pesanan02(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }

    public void tampil() {
        System.out.println(kodePesanan + "\t\t" + namaPesanan + "\t\t" + harga);
    }
}
