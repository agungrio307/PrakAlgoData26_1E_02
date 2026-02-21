package P2;

public class MataKuliah02_Main {
    public static void main(String[] args) {

        MataKuliah02 mk1 = new MataKuliah02();
        mk1.kodeMK = "91101";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        MataKuliah02 mk2 = new MataKuliah02("91102", "Basis Data", 2, 3);

        System.out.println("Informasi Mata Kuliah:");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();
        mk1.ubahSKS(4);

        mk2.tambahJam(2);
        mk1.kurangiJam(2);
        mk2.kurangiJam(6);

        System.out.println();
        System.out.println("============================");
        System.out.println("Informasi Mata Kuliah Setelah Update:");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();
    }
}