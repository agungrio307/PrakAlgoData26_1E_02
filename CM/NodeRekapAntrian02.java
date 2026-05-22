package CM;

// Node untuk menyimpan data rekap antrian per jam
public class NodeRekapAntrian02 {
    int jam;
    int jumlah;
    NodeRekapAntrian02 next;

    // Constructor node rekap antrian
    public NodeRekapAntrian02(int jam, int jumlah) {
        this.jam = jam;
        this.jumlah = jumlah;
        this.next = null;
    }
}
