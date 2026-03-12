package P4;
import java.util.Scanner;

public class kuis_main {
    public static void main(String[] args) {

        //bikin atribut untuk menghitung total jam latihan dan jumlah member
        int totalJamLatihan = 0;
        int jumlahMemberUmur3540 = 0;

        //bikin scanner untuk input data member
        Scanner agung = new Scanner(System.in);

        //input jumlah member
        System.out.print("Masukkan Jumlah Member: ");
        int n = agung.nextInt();
        agung.nextLine(); //untuk membersihkan buffer setelah membaca integer
        System.out.println();

        Kuis[] member = new Kuis[n]; //membuat array untuk menyimpan objek Kuis

        //input data member
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nama Member: ");
            String namaMember = agung.nextLine();

            System.out.print("Masukkan Umur: ");
            int umur = agung.nextInt();

            System.out.print("Masukkan Jumlah Jam Latihan: ");
            int jumlahJamLatihan = agung.nextInt();
            agung.nextLine(); //untuk membersihkan buffer setelah membaca integer
            
            System.out.println("-------------------");

            member[i] = new Kuis(namaMember, umur, jumlahJamLatihan); //membuat objek Kuis untuk setiap member

            // menghitung biaya keanggotaan untuk setiap member
            member[i].biayakeanggotaan = member[i].totalBiaya();  
        }
        
        // Menampilkan data member
        System.out.println();
        System.out.println("==== DATA MEMBER ====");
        for (int i = 0; i < n; i++) {
            member[i].printData();
            System.out.println("-------------------");
        }

        // Menghitung total jam latihan member umur > 40
        for (int i = 0; i < n; i++) {
            if (member[i].umur > 40) {
                totalJamLatihan += member[i].jumlahJamLatihan;
            }
        }

        // Menghitung jumlah member umur 35 - 40
        for (int i = 0; i < n; i++) {
            if (member[i].umur >= 35 && member[i].umur <= 40) {
                jumlahMemberUmur3540++;
            }
        }

        // Menampilkan hasil perhitungan
        System.out.println("===============================");
        System.out.println("Total jam latihan member umur > 40: " + totalJamLatihan);
        System.out.println("Jumlah member umur 35 - 40: " + jumlahMemberUmur3540);
    }
}
