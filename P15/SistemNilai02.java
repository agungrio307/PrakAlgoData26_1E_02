package P15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import P5.DaftarNilaiMHS.Nilai;

public class SistemNilai02 {
    // ===== Data Master =====
    static List<Mahasiswa_tugas02>  listMahasiswa  = new ArrayList<>();
    static List<MataKuliah02> listMataKuliah = new ArrayList<>();
    static List<Nilai02>      listNilai      = new ArrayList<>();

    // ===== Tugas No.2: Queue untuk hapus mahasiswa =====
    static Queue<String> antrianHapus = new LinkedList<>();

    static Scanner sc = new Scanner(System.in);

    // =========================================================
    // Inisialisasi data awal mahasiswa dan mata kuliah
    // =========================================================
    static void initData() {
        listMahasiswa.add(new Mahasiswa_tugas02("20001", "Thalhah",      "021xxx"));
        listMahasiswa.add(new Mahasiswa_tugas02("20002", "Zubair",       "021xxx"));
        listMahasiswa.add(new Mahasiswa_tugas02("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa_tugas02("20004", "Sa'ad",        "021xxx"));
        listMahasiswa.add(new Mahasiswa_tugas02("20005", "Sa'id",        "021xxx"));
        listMahasiswa.add(new Mahasiswa_tugas02("20006", "Ubaidah",      "021xxx"));

        listMataKuliah.add(new MataKuliah02("00001", "Internet of Things",                      3));
        listMataKuliah.add(new MataKuliah02("00002", "Algoritma dan Struktur Data",             2));
        listMataKuliah.add(new MataKuliah02("00003", "Algoritma dan Pemrograman",               2));
        listMataKuliah.add(new MataKuliah02("00004", "Praktikum Algoritma dan Struktur Data",   3));
        listMataKuliah.add(new MataKuliah02("00005", "Praktikum Algoritma dan Pemrograman",     3));
    }

    // =========================================================
    // Menu Utama
    // =========================================================
    static void tampilMenu() {
        System.out.println("\n**********************************************");
        System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
        System.out.println("**********************************************");
        System.out.println("  1. Input Nilai");
        System.out.println("  2. Tampil Nilai");
        System.out.println("  3. Mencari Nilai Mahasiswa");
        System.out.println("  4. Urut Data Nilai");
        System.out.println("  5. Hapus Mahasiswa (Queue)");
        System.out.println("  6. Keluar");
        System.out.println("**********************************************");
        System.out.print("  Pilih : ");
    }

    // =========================================================
    // 1. Input Nilai
    // =========================================================
    static void inputNilai() {
        System.out.println("\n--- DAFTAR MAHASISWA ---");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-15s %-10s%n", "NIM", "Nama", "Telf");
        System.out.println("**********************************************");
        for (Mahasiswa_tugas02 mhs : listMahasiswa) {
            System.out.println(mhs.toString());
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nimCari = sc.nextLine().trim();

        Mahasiswa_tugas02 mhsDipilih = cariMahasiswaByNim(nimCari);
        if (mhsDipilih == null) {
            System.out.println("Mahasiswa tidak ditemukan!");
            return;
        }

        System.out.println("\n--- DAFTAR MATA KULIAH ---");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-40s %-3s%n", "Kode", "Mata Kuliah", "SKS");
        System.out.println("**********************************************");
        for (MataKuliah02 mk : listMataKuliah) {
            System.out.println(mk.toString());
        }
        System.out.print("Pilih MK by kode: ");
        String kodeMK = sc.nextLine().trim();

        MataKuliah02 mkDipilih = cariMKByKode(kodeMK);
        if (mkDipilih == null) {
            System.out.println("Mata kuliah tidak ditemukan!");
            return;
        }

        System.out.print("Masukan data\nNilai : ");
        double nilaiInput = Double.parseDouble(sc.nextLine().trim());

        // Cek apakah sudah ada nilai untuk kombinasi ini
        boolean found = false;
        for (Nilai02 n : listNilai) {
            if (n.getMahasiswa().getNim().equals(nimCari) &&
                n.getMataKuliah().getKode().equals(kodeMK)) {
                n.setNilai(nilaiInput);
                found = true;
                System.out.println("Nilai berhasil diperbarui.");
                break;
            }
        }
        if (!found) {
            listNilai.add(new Nilai02(mhsDipilih, mkDipilih, nilaiInput));
            System.out.println("Nilai berhasil ditambahkan.");
        }
    }

    // =========================================================
    // 2. Tampil Nilai
    // =========================================================
    static void tampilNilai() {
        System.out.println("\n--- DAFTAR NILAI MAHASISWA ---");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-15s %-40s %-5s %-6s%n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("**********************************************");
        if (listNilai.isEmpty()) {
            System.out.println("Belum ada data nilai.");
            return;
        }
        for (Nilai02 n : listNilai) {
            System.out.println(n.toString());
        }
    }

    // =========================================================
    // 3. Cari Nilai Mahasiswa
    // =========================================================
    static void cariNilaiMahasiswa() {
        tampilNilai();
        System.out.print("Masukkan data mahasiswa[nim] :");
        String nim = sc.nextLine().trim();

        System.out.println("\n--- HASIL PENCARIAN ---");
        System.out.printf("%-8s %-15s %-40s %-5s %-6s%n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("**********************************************");

        boolean found = false;
        int totalSKS  = 0;
        for (Nilai02 n : listNilai) {
            if (n.getMahasiswa().getNim().equals(nim)) {
                System.out.println(n.toString());
                totalSKS += n.getMataKuliah().getSks();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("Total SKS " + totalSKS + " telah diambil.");
        }
    }

    // =========================================================
    // 4. Urut Data Nilai
    // =========================================================
    static void urutDataNilai() {
        System.out.println("\nUrut berdasarkan:");
        System.out.println("  1. Nilai Ascending");
        System.out.println("  2. Nilai Descending");
        System.out.println("  3. NIM Ascending");
        System.out.print("  Pilih: ");
        String pilih = sc.nextLine().trim();

        List<Nilai02> sorted = new ArrayList<>(listNilai);
        switch (pilih) {
            case "1":
                sorted.sort(Comparator.comparingDouble(Nilai02::getNilai));
                break;
            case "2":
                sorted.sort((a, b) -> Double.compare(b.getNilai(), a.getNilai()));
                break;
            case "3":
                sorted.sort(Comparator.comparing(n -> n.getMahasiswa().getNim()));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("\n--- DAFTAR NILAI MAHASISWA (TERURUT) ---");
        System.out.println("**********************************************");
        System.out.printf("%-8s %-15s %-40s %-5s %-6s%n",
                "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("**********************************************");
        for (Nilai02 n : sorted) {
            System.out.println(n.toString());
        }
    }

    // =========================================================
    // 5. Hapus Mahasiswa via Queue (Tugas No.2)
    // =========================================================
    static void hapusMahasiswaQueue() {
        System.out.println("\n--- HAPUS MAHASISWA (ANTRIAN / QUEUE) ---");
        System.out.println("Masukkan NIM mahasiswa yang akan dihapus (ketik 'selesai' untuk proses):");

        while (true) {
            System.out.print("NIM: ");
            String nim = sc.nextLine().trim();
            if (nim.equalsIgnoreCase("selesai")) break;
            Mahasiswa_tugas02 mhs = cariMahasiswaByNim(nim);
            if (mhs != null) {
                antrianHapus.offer(nim);
                System.out.println("NIM " + nim + " (" + mhs.getNama() + ") masuk antrian hapus.");
            } else {
                System.out.println("NIM tidak ditemukan.");
            }
        }

        System.out.println("\nMemproses antrian hapus...");
        while (!antrianHapus.isEmpty()) {
            String nimHapus = antrianHapus.poll(); // FIFO - ambil dari depan
            // Hapus dari listNilai
            listNilai.removeIf(n -> n.getMahasiswa().getNim().equals(nimHapus));
            // Hapus dari listMahasiswa
            listMahasiswa.removeIf(m -> m.getNim().equals(nimHapus));
            System.out.println("Mahasiswa NIM " + nimHapus + " berhasil dihapus.");
        }
        System.out.println("Semua antrian hapus selesai diproses.");
    }

    // =========================================================
    // Helper: Cari Mahasiswa by NIM
    // =========================================================
    static Mahasiswa_tugas02 cariMahasiswaByNim(String nim) {
        for (Mahasiswa_tugas02 mhs : listMahasiswa) {
            if (mhs.getNim().equals(nim)) return mhs;
        }
        return null;
    }

    // =========================================================
    // Helper: Cari MataKuliah by Kode
    // =========================================================
    static MataKuliah02 cariMKByKode(String kode) {
        for (MataKuliah02 mk : listMataKuliah) {
            if (mk.getKode().equals(kode)) return mk;
        }
        return null;
    }

    // =========================================================
    // Main Method
    // =========================================================
    public static void main(String[] args) {
        initData();

        boolean running = true;
        while (running) {
            tampilMenu();
            String pilihan = sc.nextLine().trim();
            switch (pilihan) {
                case "1": inputNilai();          break;
                case "2": tampilNilai();         break;
                case "3": cariNilaiMahasiswa();  break;
                case "4": urutDataNilai();       break;
                case "5": hapusMahasiswaQueue(); break;
                case "6":
                    System.out.println("Terima kasih. Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        sc.close();
    }
}
