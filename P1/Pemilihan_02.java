package P1;

import java.util.Scanner;

public class Pemilihan_02 {
    public static void main(String[] args) {
        Scanner Agung = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = Agung.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = Agung.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = Agung.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = Agung.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiTugas < 0 || nilaiTugas > 100 ||
                nilaiKuis < 0 || nilaiKuis > 100 ||
                nilaiUTS < 0 || nilaiUTS > 100 ||
                nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            Agung.close();
            return;
        }
        double nilaiAkhir = (nilaiTugas * 0.20) + (nilaiKuis * 0.20) +
                (nilaiUTS * 0.30) + (nilaiUAS * 0.40);
        String nilaiHuruf;
        String statusKelulusan;
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            statusKelulusan = "LULUS";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            statusKelulusan = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            statusKelulusan = "TIDAK LULUS";
        }
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf :" + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("SELAMAT ANDA " + statusKelulusan);
        Agung.close();
    }
}
