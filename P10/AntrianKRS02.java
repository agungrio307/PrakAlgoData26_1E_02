package P10;

public class AntrianKRS02 {
    Mahasiswa02[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;
    int maxDilayani = 30;

    AntrianKRS02(int max) {
        this.max = max;
        data = new Mahasiswa02[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void kosongkan() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    void tambah(Mahasiswa02 m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian.");
    }

    void layani2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        if (jumlahDilayani >= maxDilayani) {
            System.out.println("DPA sudah melayani maksimal.");
            return;
        }

        System.out.println("Melayani 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    void lihatDepan() {
        if (isEmpty()) {
            System.out.println("Kosong.");
        } else {
            System.out.println("2 terdepan:");
            data[front].tampilkanData();
            if (size > 1) {
                data[(front + 1) % max].tampilkanData();
            }
        }
    }

    void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Kosong.");
        } else {
            System.out.println("Terakhir:");
            data[rear].tampilkanData();
        }
    }

    void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Kosong.");
            return;
        }
        for (int i = 0; i < size; i++) {
            data[(front + i) % max].tampilkanData();
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    void jumlahDilayani() {
        System.out.println("Sudah dilayani: " + jumlahDilayani);
    }

    void sisaDilayani() {
        System.out.println("Belum dilayani: " + (maxDilayani - jumlahDilayani));
    }
}
