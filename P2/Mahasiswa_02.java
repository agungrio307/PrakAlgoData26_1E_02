package P2;

public class Mahasiswa_02{

        String nama;
        String nim;
        String kelas;
        double ipk;

public Mahasiswa_02 () {
}

public Mahasiswa_02 (String nm, String nim, String kls, double ipk) {
    nama = nm;
    this.nim = nim;
    kelas = kls;
    this.ipk = ipk;
}

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIPK (double IPKBaru) {
        if (IPKBaru >= 0.0 && IPKBaru <= 4.0) {
            ipk = IPKBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan");
        }
    }

    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    
}
