package P3;
import java.util.Scanner;

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i] = new MataKuliah02();
            arrayOfMataKuliah[i].tambahData();
            System.out.println("-----------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("-----------------------------------");
        }
    }
}
