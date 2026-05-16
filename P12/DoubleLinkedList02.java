package P12;
import org.w3c.dom.Node;

public class DoubleLinkedList02 {
    Node02 head;
    Node02 tail;
    int size = 0; // menyimpan jumlah node pada linked list (atribut size tambahan)

    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
            size++; // increment karena node pertama ditambahkan (atribut size tambahan)
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++; // increment karena node berhasil ditambahkan di awal (atribut size tambahan)
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
            size++; // increment karena node pertama ditambahkan (atribut size tambahan)
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++; // increment karena node ditambahkan di akhir (atribut size tambahan)
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        // jika current adalah tail, node baru dtambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { //node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
        size++; // increment karena node disisipkan setelah node tertentu (atribut size tambahan)
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node02 temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus");
        System.out.println("NIM   : " + temp.data.nim);
        System.out.println("Nama  : " + temp.data.nama);
        System.out.println("Kelas : " + temp.data.kelas);
        System.out.println("IPK   : " + temp.data.ipk);
        size--; // decrement karena node pertama dihapus (atribut size tambahan)
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node02 temp = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus");
        System.out.println("NIM   : " + temp.data.nim);
        System.out.println("Nama  : " + temp.data.nama);
        System.out.println("Kelas : " + temp.data.kelas);
        System.out.println("IPK   : " + temp.data.ipk);
        size--; // decrement karena node terakhir dihapus (atribut size tambahan)
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        Node02 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
    
    // 1) Tambahkan method: add(int index, Mahasiswa02 data)
    public void add(int index, Mahasiswa02 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node02 newNode = new Node02(data);
        Node02 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node02 prevNode = current.prev;

        newNode.next = current;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        current.prev = newNode;

        size++; // increment karena node disisipkan pada index tertentu (atribut size tambahan)
    }

    // 2) Tambahkan method: removeAfter(String keyNim)
    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node02 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah data tersebut");
            return;
        }

        Node02 temp = current.next;

        if (temp == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = temp.next;
            temp.next.prev = current;
        }

        System.out.println("Data berhasil dihapus");
        System.out.println("NIM   : " + temp.data.nim);
        System.out.println("Nama  : " + temp.data.nama);
        System.out.println("Kelas : " + temp.data.kelas);
        System.out.println("IPK   : " + temp.data.ipk);

        size--; // decrement karena node setelah keyNim dihapus (atribut size tambahan)
    }

    // 3) Tambahkan method: remove(int index)
    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node02 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node02 temp = current;

        current.prev.next = current.next;
        current.next.prev = current.prev;

        System.out.println("Data berhasil dihapus");
        System.out.println("NIM   : " + temp.data.nim);
        System.out.println("Nama  : " + temp.data.nama);
        System.out.println("Kelas : " + temp.data.kelas);
        System.out.println("IPK   : " + temp.data.ipk);

        size--; // decrement karena node pada index tertentu dihapus (atribut size tambahan)
    }

    // 4) Tambahkan 3 get methods: getFirst(), getLast(), getIndex(int index)
    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node02 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data.tampil();
    }

    // 5) Tambahkan method: getSize()
    public int getSize() {
        return size;
    }
}
