package CM;

public class NodePembeli02 {
    Pembeli02 data;
    NodePembeli02 prev;
    NodePembeli02 next;

    public NodePembeli02(NodePembeli02 prev, Pembeli02 data, NodePembeli02 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
