package P6;
import java.util.Scanner;

public class MainDosen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen02 list = new DataDosen02();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode   : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama   : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia   : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen02 d = new Dosen02(kd, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.BubbleSort();
                    System.out.println("Data berhasil diurutkan ASC");
                    list.tampil();
                    break;

                case 4:
                    list.SelectionSort(); // atau list.InsertionSort();
                    System.out.println("Data berhasil diurutkan DSC");
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 5);
    }
}

