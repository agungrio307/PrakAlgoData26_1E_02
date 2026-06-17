package P15;
public class MataKuliah02 {
    private String kode;
    private String namaMK;
    private int sks;

    public MataKuliah02() {}

    public MataKuliah02(String kode, String namaMK, int sks) {
        this.kode   = kode;
        this.namaMK = namaMK;
        this.sks    = sks;
    }

    public String getKode()    { return kode; }
    public String getNamaMK()  { return namaMK; }
    public int getSks()        { return sks; }

    @Override
    public String toString() {
        return String.format("%-8s %-40s %d", kode, namaMK, sks);
    }
}
