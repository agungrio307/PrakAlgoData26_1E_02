package P2;

public class Tugas1_Jobsheet2_02 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Tugas1_Jobsheet2_02() {
        this.kodeMK = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public Tugas1_Jobsheet2_02(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK      : " + kodeMK);
        System.out.println("Nama MataKuliah : " + nama);
        System.out.println("SKS          : " + sks);
        System.out.println("Jumlah Jam   : " + jumlahJam + " jam/minggu");
        System.out.println("----------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS untuk mata kuliah " + nama + " telah diubah menjadi " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam untuk " + nama + " telah ditambahkan. Total sekarang: " + jumlahJam + " jam");
    }

    public void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam terlalu kecil.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam untuk " + nama + " telah dikurangi. Total sekarang: " + jumlahJam + " jam");
        }
    }

    public static void main(String[] args) {
        Tugas1_Jobsheet2_02 mk1 = new Tugas1_Jobsheet2_02();
        mk1.kodeMK = "MK101";
        mk1.nama = "Pemrograman Java";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        Tugas1_Jobsheet2_02 mk2 = new Tugas1_Jobsheet2_02("MK102", "Basis Data", 2, 3);

        System.out.println("Informasi Mata Kuliah:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();

        mk1.ubahSKS(4);

        mk2.tambahJam(2);
        mk1.kurangiJam(2);
        mk2.kurangiJam(6);

        System.out.println("Informasi Mata Kuliah Setelah Update:");
        mk1.tampilInformasi();
        mk2.tampilInformasi();
    }
}
