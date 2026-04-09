package P7.CM;

// Class Mahasiswa untuk menyimpan data mahasiswa
public class Mahasiswa02 {
    String nim, nama, prodi;

    // Constructor untuk inisialisasi data
    public Mahasiswa02(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampil() {
        System.out.println("NIM: " + nim + 
                           " | Nama: " + nama + 
                           " | Prodi: " + prodi);
    }
}
