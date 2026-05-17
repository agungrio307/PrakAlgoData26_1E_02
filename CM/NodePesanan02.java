package CM;

public class NodePesanan02 {
    // Menyimpan data pesanan pada node
    Pesanan02 data;

    // Menunjuk node sebelumnya
    NodePesanan02 prev;

    // Menunjuk node berikutnya
    NodePesanan02 next;

    // Constructor untuk menghubungkan node sebelumnya, data, dan node berikutnya
    public NodePesanan02(NodePesanan02 prev, Pesanan02 data, NodePesanan02 next) {
        // Mengisi atribut prev dengan node sebelumnya
        this.prev = prev;

        // Mengisi atribut data dengan data pesanan
        this.data = data;

        // Mengisi atribut next dengan node berikutnya
        this.next = next;
    }
}
