package P12;
import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static Mahasiswa02 inputMahasiswa(Scanner agung) {
    System.out.print("Masukkan NIM   : ");
    String nim = agung.nextLine();
    System.out.print("Masukkan Nama  : ");
    String nama = agung.nextLine();
    System.out.print("Masukkan Kelas : ");
    String kelas = agung.nextLine();
    System.out.print("Masukkan IPK   : ");
    double ipk = agung.nextDouble();
    agung.nextLine();

    return new Mahasiswa02(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);
        DoubleLinkedList02 list = new DoubleLinkedList02();

        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = agung.nextInt();
            agung.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhsAwal = inputMahasiswa(agung);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa02 mhsAkhir = inputMahasiswa(agung);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNIM = agung.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa02 dataBaru = inputMahasiswa(agung);
                    list.insertAfter(keyNIM, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Progam selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
        agung.close();
    }
}
