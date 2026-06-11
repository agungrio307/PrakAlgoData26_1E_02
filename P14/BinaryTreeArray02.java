package P14;

public class BinaryTreeArray02 {
    Produk02[] dataProduks;
    int idxLast;

    public BinaryTreeArray02() {
        this.dataProduks = new Produk02[10];
        this.idxLast = -1;
    }

    void populateData(Produk02[] dataProduks, int idxLast) {
        this.dataProduks = dataProduks;
        this.idxLast = idxLast;
    }

    void add(Produk02 data) {
        if (idxLast + 1 < dataProduks.length) {
            dataProduks[++idxLast] = data;
        } else {
            System.out.println("Array binary tree penuh!");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataProduks[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataProduks[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);     
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataProduks[idxStart] != null) {
                dataProduks[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
