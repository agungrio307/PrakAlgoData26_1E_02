package P5;

public class Kuis {
    
    //bikin atribut
    String namaMember;
    int umur;;
    int jumlahJamLatihan;
    double biayakeanggotaan = 3000; //biaya perjam latihan

    //bikin constructor
    Kuis(String namaMember, int umur, int jumlahJamLatihan) {
        this.namaMember = namaMember;
        this.umur = umur;
        this.jumlahJamLatihan = jumlahJamLatihan;
    }

    //bikin method untuk menghitung total biaya keanggotaan
    double totalBiaya() {
        if (jumlahJamLatihan > 15) {
            return biayakeanggotaan * jumlahJamLatihan * 0.1;
        } else {
            return biayakeanggotaan * jumlahJamLatihan;
        }
    }

    //bikin method untuk menampilkan data member
    void printData() {
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Umur: " + umur);
        System.out.println("Jumlah Jam Latihan: " + jumlahJamLatihan);
        System.out.println("Biaya Keanggotaan: " + biayakeanggotaan);
    }

}
