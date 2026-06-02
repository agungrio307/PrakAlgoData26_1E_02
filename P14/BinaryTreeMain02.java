package P14;

public class BinaryTreeMain02 {
    public static void main(String[] args) {
        // BinaryTree02 bst = new BinaryTree02();
        // bst.add(new Mahasiswa02("244160121", "Ali", "A", 3.57));
        // bst.add(new Mahasiswa02("244160221", "Badar", "B", 3.85));
        // bst.add(new Mahasiswa02("244160185", "Candra", "C", 3.21));
        // bst.add(new Mahasiswa02("244160220", "Dewi", "B", 3.54));

        // System.out.println("\nDaftar semua mahasiswa (in order traversal) :");
        // bst.traverseInOrder(bst.root);

        // System.out.println("\nPencarian data mahasiswa:");
        // System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        // String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        // System.out.println(hasilCari);

        // System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        // hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        // System.out.println(hasilCari);

        // bst.add(new Mahasiswa02("244160131", "Devi", "A", 3.72));
        // bst.add(new Mahasiswa02("244160205", "Ehsan", "B", 3.37));
        // bst.add(new Mahasiswa02("244160170", "Fizi", "D", 3.46));
        // System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        // System.out.println("InOrder Traversal:");
        // bst.traverseInOrder(bst.root);
        // System.out.println("\nPreOrder Traversal:");
        // bst.traversePreOrder(bst.root);
        // System.out.println("\nPostOrder Traversal:");
        // bst.traversePostOrder(bst.root);

        // System.out.println("\nPenghapusan data mahasiswa:");
        // bst.delete(3.57);
        // System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        // bst.traverseInOrder(bst.root);

        BinaryTreeArray02 bta = new BinaryTreeArray02();
        Mahasiswa02 mhs1 = new Mahasiswa02("244160121", "Ali", "A", 3.57);
        Mahasiswa02 mhs2 = new Mahasiswa02("244160185", "Candra", "C", 3.41);
        Mahasiswa02 mhs3 = new Mahasiswa02("244160221", "Badar", "B", 3.75);
        Mahasiswa02 mhs4 = new Mahasiswa02("244160220", "Dewi", "B", 3.35);

        Mahasiswa02 mhs5 = new Mahasiswa02("244160131", "Devi", "A", 3.48);
        Mahasiswa02 mhs6 = new Mahasiswa02("244160205", "Ehsan", "D", 3.61);
        Mahasiswa02 mhs7 = new Mahasiswa02("244160170", "Fizi", "B", 3.86);

        Mahasiswa02[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
        System.out.println("\nPreOrder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}
