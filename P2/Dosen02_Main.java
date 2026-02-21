package P2;

public class Dosen02_Main {
    public static void main(String[] args) {

        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "D0013345";
        dosen1.nama = "Hanif";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Matematika";

        Dosen02 dosen2 = new Dosen02("D0023345", "Sudirman", true, 2015, "Teknik Informatika");
        
        System.out.println("Informasi Dosen:");
        dosen1.tampilkanInformasi();
        System.out.println("----------------------------");
        System.out.println();

        dosen2.tampilkanInformasi();
        System.out.println("----------------------------");
        System.out.println();

        dosen1.StatusAktif(false);
        dosen2.ubahKeahlian("Sistem Informasi");

        System.out.println("Update Informasi Dosen:");
        dosen1.tampilkanInformasi();
        dosen1.hitungMasaKerja(2024);
        System.out.println("----------------------------");
        System.out.println();
        dosen2.tampilkanInformasi();
        System.out.println("----------------------------");
        System.out.println();
    }
}