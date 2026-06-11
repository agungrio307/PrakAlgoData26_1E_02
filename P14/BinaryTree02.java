package P14;

public class BinaryTree02 {
    Node02 root;

    public BinaryTree02() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }
    
    // MODIFIKASI:
    // Data BST diubah dari Mahasiswa menjadi Produk
    // Pengurutan BST berdasarkan atribut harga produk
    public void add(Produk02 produk) {
        Node02 newNode = new Node02(produk);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node02 current = root;
            Node02 parent = null;
            while (true) {
                parent = current;
                if (produk.harga < current.produk.harga) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void addRekursif(Produk02 produk) {
        root = addRekursif(root, produk);
    }

    private Node02 addRekursif(Node02 current, Produk02 produk) {
        if (current == null) {
            return new Node02(produk);
        }

        if (produk.harga < current.produk.harga) {
            current.left = addRekursif(current.left, produk);
        } else {
            current.right = addRekursif(current.right, produk);
        }

        return current;
    }

    boolean find(double harga) {
        boolean result = false;
        Node02 current = root;
        while (current != null) {
            if (current.produk.harga == harga) {
                result = true;
                break;
            } else if (harga > current.produk.harga) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    // MODIFIKASI:
    // Menampilkan produk dengan harga termurah
    // Produk termurah berada pada node paling kiri BST
    Produk02 tampilProdukTermurah() {
        if (isEmpty()) {
            return null;
        }

        Node02 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.produk;
    }

    Produk02 cariProdukTermahal() {
        if (isEmpty()) {
            return null;
        }

        Node02 current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.produk;
    }

    // MODIFIKASI:
    // Menampilkan seluruh produk yang memiliki harga di atas batasHarga
    void tampilProdukDiAtasHarga(double batasHarga) {
        tampilProdukDiAtasHarga(root, batasHarga);
    }

    private void tampilProdukDiAtasHarga(Node02 node, double batasHarga) {
        if (node != null) {
            tampilProdukDiAtasHarga(node.left, batasHarga);

            if (node.produk.harga > batasHarga) {
                node.produk.tampilInformasi();
            }

            tampilProdukDiAtasHarga(node.right, batasHarga);
        }
    }

    void traversePreOrder(Node02 node) {
        if (node != null) {
            node.produk.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node02 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.produk.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node02 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.produk.tampilInformasi();
        }
    }

    // MODIFIKASI:
    // Menghitung rata-rata harga seluruh produk dalam BST
    public double hitungRataRataHarga() {
        int jumlahProduk = hitungJumlahProduk(root);

        if (jumlahProduk == 0) {
            return 0;
        }

        return hitungTotalHarga(root) / jumlahProduk;
    }

    private double hitungTotalHarga(Node02 node) {
        if (node == null) {
            return 0;
        }

        return node.produk.harga
                + hitungTotalHarga(node.left)
                + hitungTotalHarga(node.right);
    }

    private int hitungJumlahProduk(Node02 node) {
        if (node == null) {
            return 0;
        }

        return 1
                + hitungJumlahProduk(node.left)
                + hitungJumlahProduk(node.right);
    }

    Node02 getSuccessor(Node02 del) {
        Node02 successor = del.right;
        Node02 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != null) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    // MODIFIKASI:
    // Penghapusan data dilakukan berdasarkan harga produk
    void delete(double harga) {
        if (isEmpty()) {
            System.out.println("Binary tree masih kosong");
            return;
        }
        //cari node (current) yang akan dihapus
        Node02 parent = root;
        Node02 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.produk.harga == harga) {
                break;
            } else if (harga < current.produk.harga) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (harga > current.produk.harga) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //penghapusan
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            //jika tidak ada anak (leaf), maka node dihapus
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } 
            else if (current.left == null) { //jika hanya punya 1 anak (kanan)
                if (current == root) {
                    root = current.right;
                } else if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } 
            else if (current.right == null) { //jika hanya punya 1 anak (kiri)
                if (current == root) {
                    root = current.left;
                } else if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } 
            else { //jika punya 2 anak
                Node02 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                current.produk.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }
}
