package P3;
import java.util.Scanner;

public class MataKuliah02 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah02 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah02() {
    }

    public void tambahData() {
        Scanner agung = new Scanner(System.in);

        System.out.print("Kode       : ");
        kode = agung.nextLine();
        System.out.print("Nama       : ");
        nama = agung.nextLine();
        System.out.print("SKS        : ");
        String dummy = agung.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy = agung.nextLine();
        jumlahJam = Integer.parseInt(dummy);
    }
}
