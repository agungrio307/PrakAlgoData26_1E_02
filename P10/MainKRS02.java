package P10;
import java.util.Scanner;

public class MainKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        AntrianKRS02 antrian = new AntrianKRS02(10);

        int pilih;
        do {
            System.out.println("\n=== MENU KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Dilayani");
            System.out.println("8. Sisa Dilayani");
            System.out.println("9. Kosongkan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa02 m = new Mahasiswa02(nim, nama, prodi, kelas);
                    antrian.tambah(m);
                    break;

                case 2:
                    antrian.layani2();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.lihatDepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahDilayani();
                    break;

                case 8:
                    antrian.sisaDilayani();
                    break;

                case 9:
                    antrian.kosongkan();
                    break;
            }

        } while (pilih != 0);
    }
}
