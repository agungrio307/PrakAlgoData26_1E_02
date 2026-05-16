package CM;

import java.util.Scanner;

public class MainRoyalDelish02 {
    public static void main(String[] args) {

        Scanner agung = new Scanner(System.in);

        DLLPembeli02 antrian = new DLLPembeli02();
        DLLPesanan02 daftarPesanan = new DLLPesanan02();

        int nomorAntrian = 1;

        int pilih;

        do {

            System.out.println("===============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = agung.nextInt();
            agung.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = agung.nextLine();

                    System.out.print("No HP        : ");
                    String hp = agung.nextLine();

                    Pembeli02 p = new Pembeli02(nomorAntrian, nama, hp);

                    antrian.addLast(p);

                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian);

                    nomorAntrian++;

                    break;

                case 2:
                    antrian.print();

                    break;

                case 3:

                    Pembeli02 dipanggil = antrian.removeFirst();

                        System.out.print("Kode Pesanan : ");
                        int kode = agung.nextInt();
                        agung.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = agung.nextLine();

                        System.out.print("Harga        : ");
                        int harga = agung.nextInt();
                        agung.nextLine();

                        Pesanan02 pesanan = new Pesanan02(
                                kode,
                                namaPesanan,
                                harga,
                                dipanggil.namaPembeli
                        );

                        daftarPesanan.add(pesanan);

                        System.out.println(pesanan.namaPembeli + " telah memesan " + pesanan.namaPesanan);

                    break;

                case 4:

                    daftarPesanan.print();

                    break;

                case 0:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}
