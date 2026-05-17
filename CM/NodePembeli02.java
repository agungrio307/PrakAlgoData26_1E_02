package CM;

public class NodePembeli02 {
    // Menyimpan data pembeli pada node
    Pembeli02 data;

    // Menunjuk node sebelumnya
    NodePembeli02 prev;

    // Menunjuk node berikutnya
    NodePembeli02 next;

    // Constructor untuk menghubungkan node sebelumnya, data, dan node berikutnya
    public NodePembeli02(NodePembeli02 prev, Pembeli02 data, NodePembeli02 next) {
        // Mengisi atribut prev dengan node sebelumnya
        this.prev = prev;

        // Mengisi atribut data dengan data pembeli
        this.data = data;

        // Mengisi atribut next dengan node berikutnya
        this.next = next;
    }
}
