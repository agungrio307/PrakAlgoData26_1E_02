package CM;

public class DLLPembeli02 {
    NodePembeli02 head;
    NodePembeli02 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pembeli02 data) {
        NodePembeli02 newNode = new NodePembeli02(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

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

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public Pembeli02 removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Pembeli02 data = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }

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
