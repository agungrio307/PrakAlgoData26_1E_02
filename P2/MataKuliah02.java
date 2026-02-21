package P2;

public class MataKuliah02 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

public MataKuliah02 () {
}

public MataKuliah02 (String kodeMK, String nama, int sks, int jumlahJam) {
    this.kodeMK = kodeMK;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
}

    void tampilkanInformasi() {
        System.out.println("----------------------------");
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println("----------------------------");
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        if (sksBaru > 0) {
            sks = sksBaru;
        } else {
            System.out.println("SKS tidak valid! Harus lebih dari 0."); 
        }
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan pada mata kuliah " + nama + " tidak dapat dilakukan! Jumlah jam terlalu kecil.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam untuk " + nama + " telah dikurangi. Total sekarang: " + jumlahJam + " jam");
        }
    }
}
