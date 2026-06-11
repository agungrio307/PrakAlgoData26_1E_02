package P14;

public class BinaryTreeMain02 {
    public static void main(String[] args) {
        // MODIFIKASI 1:
        // Data BST diubah dari Mahasiswa menjadi Produk
        // BST diurutkan berdasarkan atribut harga
        BinaryTree02 bst = new BinaryTree02();
        System.out.println("========================================");
        System.out.println("   PROGRAM BINARY SEARCH TREE PRODUK");
        System.out.println("========================================");
        bst.add(new Produk02("P001", "Laptop", "Elektronik", 15000000));
        bst.add(new Produk02("P002", "Mouse", "Elektronik", 150000));
        bst.add(new Produk02("P003", "Keyboard", "Elektronik", 300000));
        bst.add(new Produk02("P004", "Monitor", "Elektronik", 2500000));

        System.out.println("\n=== DAFTAR PRODUK (INORDER TRAVERSAL) ===");
        bst.traverseInOrder(bst.root);

        System.out.println("\n=== PENCARIAN PRODUK ===");
        System.out.print("Cari produk dengan harga: 2500000 : ");
        String hasilCari = bst.find(2500000) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari produk dengan harga: 100000 : ");
        hasilCari = bst.find(100000) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Produk02("P005", "Notebook", "ATK", 5000));
        bst.add(new Produk02("P006", "Buku", "ATK", 15000));
        bst.add(new Produk02("P007", "Pensil", "ATK", 2000));
        System.out.println("\n=== DATA PRODUK SETELAH PENAMBAHAN ===");
        System.out.println("-- InOrder Traversal --");
        bst.traverseInOrder(bst.root);
        System.out.println("\n-- PreOrder Traversal --");
        bst.traversePreOrder(bst.root);
        System.out.println("\n-- PostOrder Traversal --");
        bst.traversePostOrder(bst.root);

        System.out.println("\n=== PENGHAPUSAN DATA PRODUK ===");
        bst.delete(15000000);
        System.out.println("Data produk setelah penghapusan (InOrder Traversal):");
        bst.traverseInOrder(bst.root);

        // MODIFIKASI 2:
        // Menambahkan method untuk menghitung rata-rata harga seluruh produk
        System.out.println("\n=== STATISTIK PRODUK ===");
        System.out.println("Rata-rata harga produk: " + bst.hitungRataRataHarga());
        
        // MODIFIKASI 3:
        // Menambahkan method untuk menampilkan produk yang memiliki harga di atas batasHarga
        System.out.println("\nProduk dengan harga di atas Rp1.000.000:");
        bst.tampilProdukDiAtasHarga(1000000);
        
        // MODIFIKASI 4:
        // Menambahkan method untuk menampilkan produk dengan harga termurah
        System.out.println("\nProduk termurah:");
        Produk02 termurah = bst.tampilProdukTermurah();
        if (termurah != null) {
            termurah.tampilInformasi();
        }

        System.out.println("\n========================================");
        System.out.println("         PROGRAM SELESAI");
        System.out.println("========================================");

        // BinaryTreeArray02 bta = new BinaryTreeArray02();
        // Produk02 produk1 = new Produk02("P001", "Laptop", "Elektronik", 15000000);
        // Produk02 produk2 = new Produk02("P002", "Mouse", "Elektronik", 150000);
        // Produk02 produk3 = new Produk02("P003", "Keyboard", "Elektronik", 300000);
        // Produk02 produk4 = new Produk02("P004", "Monitor", "Elektronik", 2500000);

        // Produk02 produk5 = new Produk02("P005", "Notebook", "Kertas", 5000);
        // Produk02 produk6 = new Produk02("P006", "Buku", "Kertas", 15000);
        // Produk02 produk7 = new Produk02("P007", "Pensil", "Kertas", 2000);

        // Produk02[] dataProduks = {produk1, produk2, produk3, produk4, produk5, produk6, produk7, null, null, null};
        // int idxLast = 6;
        // bta.populateData(dataProduks, idxLast);
        // System.out.println("\nInorder Traversal Produk: ");
        // bta.traverseInOrder(0);
        // System.out.println("\nPreOrder Traversal Produk: ");
        // bta.traversePreOrder(0);
        // System.out.println("\nInorder Traversal Produk (ulang): ");
        // bta.traverseInOrder(0);
        // System.out.println("\nPreOrder Traversal Produk (ulang): ");
        // bta.traversePreOrder(0);
    }
}
