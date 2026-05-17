package CM;

public class DLLPembeli02 {
    // Node awal dan akhir pada double linked list
    NodePembeli02 head;
    NodePembeli02 tail;

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Menambahkan data pembeli ke akhir antrian
    public void addLast(Pembeli02 data) {
        NodePembeli02 newNode = new NodePembeli02(null, data, null);

        // Jika linked list kosong
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // Menghubungkan node baru ke akhir linked list
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Menampilkan seluruh data antrian
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("===============================");
        System.out.println("Dafttar Antrian Pembeli");
        System.out.println("===============================");
        System.out.println("No Antrian" + "\t" + "Nama" + "\t\t" + "No HP");

        NodePembeli02 current = head;

        // Menampilkan data satu per satu
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    // Menghapus data paling depan
    public Pembeli02 removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Pembeli02 data = head.data;

        // Jika hanya ada satu node
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }

    // Menghitung jumlah antrian
    public int jumlahAntrian() {
        int jumlah = 0;
        NodePembeli02 current = head;

        while (current != null) {
            jumlah++;
            current = current.next;
        }

        return jumlah;
    }
}
