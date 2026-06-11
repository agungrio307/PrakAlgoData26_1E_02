package P14;

// MODIFIKASI:
// Node BST diubah untuk menyimpan objek Produk02
// Setiap node memiliki child kiri dan kanan
public class Node02 {
    Produk02 produk;
    Node02 left, right;

    public Node02() {
    }

    // Constructor untuk membuat node baru yang berisi data produk
    public Node02(Produk02 produk) {
        this.produk = produk;
        this.right = null;
    }
}
