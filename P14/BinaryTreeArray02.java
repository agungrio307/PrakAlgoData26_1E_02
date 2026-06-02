package P14;

public class BinaryTreeArray02 {
    Mahasiswa02[] dataMahasiswas;
    int idxLast;

    public BinaryTreeArray02() {
        this.dataMahasiswas = new Mahasiswa02[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa02[] dataMahasiswas, int idxLast) {
        this.dataMahasiswas = dataMahasiswas;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa02 data) {
        if (idxLast + 1 < dataMahasiswas.length) {
            dataMahasiswas[++idxLast] = data;
        } else {
            System.out.println("Array binary tree penuh!");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswas[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswas[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);     
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswas[idxStart] != null) {
                dataMahasiswas[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
