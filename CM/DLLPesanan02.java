package CM;

public class DLLPesanan02 {
    // Node awal dan akhir pada linked list pesanan
    NodePesanan02 head;
    NodePesanan02 tail;

    // Mengecek apakah daftar pesanan kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menambahkan pesanan ke linked list
    public void add(Pesanan02 data) {
        NodePesanan02 newNode = new NodePesanan02(null, data, null);

        if (isEmpty()) {
            // Jika linked list masih kosong
            head = tail = newNode;
        } else {
            // Menambahkan node di bagian akhir
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Mengurutkan pesanan berdasarkan nama menu
    public void sortingNamaPesanan() {
        if (isEmpty()) {
            return;
        }

        boolean tukar;

        // Proses sorting bubble sort
        do {
            tukar = false;
            NodePesanan02 current = head;

            while (current.next != null) {

                // Membandingkan nama pesanan
                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {

                    // Menukar data pesanan
                    Pesanan02 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    // Menampilkan laporan pesanan
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        // Mengurutkan data sebelum ditampilkan
        sortingNamaPesanan();

        int total = 0;

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.println("Kode Pesanan" + "\t" + "Nama Pesanan" + "\t\t" + "Harga");

        NodePesanan02 current = head;

        // Menampilkan seluruh data pesanan
        while (current != null) {
            current.data.tampil();
            total += current.data.harga;
            current = current.next;
        }

        System.out.println("========================================");
        System.out.println("Total Pendapatan : " + total);
    }
}
