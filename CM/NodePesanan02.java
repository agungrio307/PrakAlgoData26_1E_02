package CM;

public class NodePesanan02 {
    Pesanan02 data;
    NodePesanan02 prev;
    NodePesanan02 next;

    public NodePesanan02(NodePesanan02 prev, Pesanan02 data, NodePesanan02 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
