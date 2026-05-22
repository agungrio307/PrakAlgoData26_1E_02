package CM;

// Linked list untuk menyimpan rekap antrian per jam
public class LinkedListRekapAntrian02 {
    NodeRekapAntrian02 head;

    // Menambahkan data baru atau update jumlah antrian
    public void tambahAtauUpdate(int jam) {

        // Jika linked list kosong
        if (head == null) {
            head = new NodeRekapAntrian02(jam, 1);
            return;
        }

        NodeRekapAntrian02 current = head;

        // Mengecek apakah jam sudah ada
        while (current != null) {
            if (current.jam == jam) {
                current.jumlah++;
                return;
            }

            // Jika sampai note terakhir dan jam belum ditemukan
            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        // Menambahkan node baru jika jam belum ditemukan
        current.next = new NodeRekapAntrian02(jam, 1);
    }

    // Menampilkan jam dengan jumlah antrian terbanyak
    public void tampilkanJamTerbanyak() {

        // Jika linked list kosong
        if (head == null) {
            System.out.println("Belum ada data rekap antrian");
            return;
        }

        NodeRekapAntrian02 current = head;
        NodeRekapAntrian02 max = head;

        // Mencari jumlah antrian terbanyak
        while (current != null) {
            if (current.jumlah > max.jumlah) {
                max = current;
            }

            current = current.next;
        }

        // Menampilkan hasil rekap antrian
        System.out.println("===============================");
        System.out.println("Rekap Antrian Per Jam");
        System.out.println("===============================");
        System.out.println("Jam dengan antrian terbanyak : " + max.jam);
        System.out.println("Jumlah antrian               : " + max.jumlah);
        System.out.println("===============================");
    }
}
