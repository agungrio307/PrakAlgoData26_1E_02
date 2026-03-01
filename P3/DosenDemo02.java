package P3;
import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dosen02[] arrayOfDosen = new Dosen02[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            String kode = input.nextLine();
            System.out.print("Nama          : ");
            String nama = input.nextLine();
            System.out.print("Jenis Kelamin : ");
            Boolean jenisKelamin = input.nextLine().equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(input.nextLine());
            
            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("-----------------------------------");
        }

        DataDosen02 dataDosen = new DataDosen02();
        System.out.println("=== INFORMASI DOSEN ===");
        dataDosen.dataSemuaDosen(arrayOfDosen);
        System.out.println("=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        System.out.println("=== INFORMASI DOSEN PALING TUA ===");
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        System.out.println("=== INFORMASI DOSEN PALING MUDA ===");
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
