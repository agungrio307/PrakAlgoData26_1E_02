package P3;

public class Dosen02 {
    String kode;
    String namaa;
    Boolean jenisKelamin;
    int usia;
    
    public Dosen02(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.namaa = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilData() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + namaa);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
    }
}
