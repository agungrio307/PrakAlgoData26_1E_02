package P7.CM;
import java.util.Scanner;

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ================= DATA AWAL =================

        // Array objek Mahasiswa02
        Mahasiswa02[] mhs = {
                new Mahasiswa02("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa02("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa02("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // Array objek Buku02
        Buku02[] buku = {
                new Buku02("B001", "Algoritma", 2020),
                new Buku02("B002", "Basis Data", 2019),
                new Buku02("B003", "Pemrograman", 2021),
                new Buku02("B004", "Fisika", 2024)
        };

        // Array objek Peminjaman02
        Peminjaman02[] pinjam = {
                new Peminjaman02(mhs[0], buku[0], 7),
                new Peminjaman02(mhs[1], buku[1], 3),
                new Peminjaman02(mhs[2], buku[2], 10),
                new Peminjaman02(mhs[2], buku[3], 6),
                new Peminjaman02(mhs[0], buku[1], 4)
        };

        int pilih;

        // ================= MENU =================
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                // ===== MENU 1 =====
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa02 m : mhs) {
                        m.tampil();
                    }
                    break;

                // ===== MENU 2 =====
                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku02 b : buku) {
                        b.tampil();
                    }
                    break;

                // ===== MENU 3 =====
                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman02 p : pinjam) {
                        p.tampil();
                    }
                    break;

                // ===== MENU 4 (SORTING) =====
                case 4:
                    // Bubble Sort descending berdasarkan denda
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                // tukar posisi
                                Peminjaman02 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman02 p : pinjam) {
                        p.tampil();
                    }
                    break;

                // ===== MENU 5 (SEARCHING) =====
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.nextLine();
                    boolean ketemu = false;

                    // Sequential Search
                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].mhs.nim.equals(cari)) {
                            pinjam[i].tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;

                case 0:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}
