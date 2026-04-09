package P6;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int jumlahMhs = 5;
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang ingin dicari:");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(String.valueOf(cari), pss);
        list.tampilDataSearch(String.valueOf(cari), pss);
        
        // System.out.println("\nData mahasiswa sebelum sorting:");
        // list.tampil();

        // System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC):");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        // list.insertionSort();
        // list.tampil();
    }
}
