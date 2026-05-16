package CM;

public class DLLPesanan02 {
    NodePesanan02 head;
    NodePesanan02 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Pesanan02 data) {
        NodePesanan02 newNode = new NodePesanan02(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortingNamaPesanan() {
        if (isEmpty()) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan02 current = head;

            while (current.next != null) {

                if (current.data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {

                    Pesanan02 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sortingNamaPesanan();

        int total = 0;

        System.out.println("========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("========================================");
        System.out.println("Kode Pesanan" + "\t" + "Nama Pesanan" + "\t\t" + "Harga");

        NodePesanan02 current = head;

        while (current != null) {
            current.data.tampil();
            total += current.data.harga;
            current = current.next;
        }

        System.out.println("========================================");
        System.out.println("Total Pendapatan : " + total);
    }
}
