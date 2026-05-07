package P11;

public class AntrianLayananKemahasiswaan02 {
    NodeAntrian02 front, rear;
    int size = 0;
    int max;

    public AntrianLayananKemahasiswaan02(int max) {
        this.max = max;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(mhs02 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            NodeAntrian02 baru = new NodeAntrian02(mhs, null);

            if (isEmpty()) {
                front = rear = baru;
            } else {
                rear.next = baru;
                rear = baru;
            }

            size++;
            System.out.println("Mahasiswa masuk antrian");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Mahasiswa dipanggil:");
            front.data.tampilData();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan:");
            front.data.tampilData();
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir:");
            rear.data.tampilData();
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeAntrian02 temp = front;

            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampilData();
                System.out.println("-------------------");
                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }
}
