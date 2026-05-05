package P11;

import java.util.Scanner;

public class SLLMain02 {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        // buat object SingleLinkedList
        NodeMahasiswa02 sll = new NodeMahasiswa02(null, null);

        System.out.print("Masukkan jumlah data: ");
        int n = agung.nextInt();
        agung.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = agung.nextLine();
            System.out.print("Nama: ");
            String nama = agung.nextLine();
            System.out.print("Kelas: ");
            String kelas = agung.nextLine();
            System.out.print("IPK: ");
            double ipk = agung.nextDouble();
            agung.nextLine();

            Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\nData Linked List:");
        sll.print();
    }
}