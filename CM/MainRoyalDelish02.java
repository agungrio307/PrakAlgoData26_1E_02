package CM;

import java.util.Scanner;

// Program utama sistem antrian Royal Delish
public class MainRoyalDelish02 {
    public static void main(String[] args) {

        // Input user
        Scanner agung = new Scanner(System.in);

        // Struktur antrian pembeli
        DLLPembeli02 antrian = new DLLPembeli02();
        // Struktur data pesanan
        DLLPesanan02 daftarPesanan = new DLLPesanan02();
        // Struktur data rekap antrian per jam
        LinkedListRekapAntrian02 rekapAntrian = new LinkedListRekapAntrian02();

        // Variabel untuk nomor antrian otomatis
        int nomorAntrian = 1;

        // Menyimpan pilihan menu user
        int pilih;

        // Loop menu utama
        do {

            // Menampilkan header program
            System.out.println("===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Rekap antrian terbanyak per jam");
            System.out.println("0. Keluar");
            // Input pilihan menu dari user
            System.out.print("Pilih menu : ");
            pilih = agung.nextInt();
            agung.nextLine();

            // Memilih menu
            switch (pilih) {

                case 1:
                    // Menambah antrian pembeli
                    // User memasukkan data pembeli

                    System.out.print("Nama Pembeli : ");
                    String nama = agung.nextLine();
                    // Input nama pembeli

                    System.out.print("No HP        : ");
                    String hp = agung.nextLine();
                    // Input nomor HP pembeli

                    System.out.print("Jam Antri    : ");
                    int jam = agung.nextInt();
                    agung.nextLine();
                    // Input jam antrian pembeli

                    Pembeli02 p = new Pembeli02(nomorAntrian, nama, hp);

                    antrian.addLast(p);
                    // Menambahkan pembeli ke dalam antrian

                    // Memperbarui rekap antrian per jam
                    rekapAntrian.tambahAtauUpdate(jam);

                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian);

                    nomorAntrian++;

                    break;

                // Menampilkan semua data antrian
                case 2:
                    antrian.print();
                    // Menampilkan isi queue

                    break;

                case 3:
                    // Memproses antrian menjadi pesanan

                    // Mengambil pembeli paling depan dari antrian
                    Pembeli02 dipanggil = antrian.removeFirst();

                        System.out.print("Kode Pesanan : ");
                        int kode = agung.nextInt();
                        // Input kode pesanan
                        agung.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = agung.nextLine();
                        // Input nama makanan/minuman

                        System.out.print("Harga        : ");
                        int harga = agung.nextInt();
                        // Input harga pesanan
                        agung.nextLine();

                        // Membuat objek pesanan dari data pembeli
                        Pesanan02 pesanan = new Pesanan02(
                                kode,
                                namaPesanan,
                                harga,
                                dipanggil.namaPembeli
                        );

                        // Menyimpan pesanan ke dalam daftar pesanan
                        daftarPesanan.add(pesanan);

                        // Konfirmasi pesanan berhasil
                        System.out.println(pesanan.namaPembeli + " telah memesan " + pesanan.namaPesanan);

                    break;

                case 4:
                    // Menampilkan laporan pesanan
                    // Cetak seluruh laporan pesanan

                    daftarPesanan.print();

                    break;

                case 5:
                    // Menampilkan jam dengan antrian terbanyak
                    rekapAntrian.tampilkanJamTerbanyak();
                    break;

                // Keluar dari program
                case 0:

                    System.out.println("Program selesai");
                    break;

                // Jika input tidak valid
                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}
