package P5;
import java.util.Scanner;

public class MainNilai {
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = agung.nextInt();
        
        DaftarNilaiMHS.Nilai n = new DaftarNilaiMHS.Nilai(jumlahMahasiswa);
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + ": ");
            n.uts[i] = agung.nextInt();
            System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i + 1) + ": ");
            n.uas[i] = agung.nextInt();
            System.out.println("-----------------------------");
        }
        
        System.out.println();
        System.out.println("==============================");
        System.out.println("Nilai UTS tertinggi: " + n.maxUTS(n.uts, 0, n.uts.length - 1));
        System.out.println("Nilai UTS terendah: " + n.minUTS(n.uts, 0, n.uts.length - 1));
        System.out.println("Rata-rata nilai UTS: " + n.rataRataUTS());
        

    }
}
