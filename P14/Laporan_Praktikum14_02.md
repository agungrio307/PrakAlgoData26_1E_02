# Laporan Praktikum ASD Jobsheet 14
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode Mahasiswa02 <br>
<br>
<img width="618" height="480" alt="Screenshot 2026-05-31 at 14 47 19" src="https://github.com/user-attachments/assets/c99efa7d-c8a5-482d-9914-73fc29c57e2b" />
<h6> Kode Node02 <br>
<br>
<img width="423" height="277" alt="Screenshot 2026-05-31 at 14 47 33" src="https://github.com/user-attachments/assets/ccafc8bc-7315-4619-89f6-891959106b2c" />
<h6> Kode BinaryTree02 <br>
<br>
<img width="509" height="710" alt="Screenshot 2026-05-31 at 14 47 50" src="https://github.com/user-attachments/assets/b2731450-5eca-482d-ac90-b39fc2384777" />
<img width="461" height="709" alt="Screenshot 2026-05-31 at 14 48 07" src="https://github.com/user-attachments/assets/c22f2337-7c5b-4e2f-8727-6c7158f498ee" />
<img width="523" height="650" alt="Screenshot 2026-05-31 at 14 48 40" src="https://github.com/user-attachments/assets/ecfa5048-438a-4831-a7e8-035d09d976e5" />
<img width="648" height="594" alt="Screenshot 2026-05-31 at 14 49 03" src="https://github.com/user-attachments/assets/8c332286-eded-40c5-a97f-a95e636e10d6" />
<img width="540" height="290" alt="Screenshot 2026-05-31 at 14 49 17" src="https://github.com/user-attachments/assets/9d6f7413-4d2c-40b0-ac01-6b9821a22be6" />
<h6> Kode BinaryTreeMain02 <br>
<br>
<img width="868" height="746" alt="Screenshot 2026-05-31 at 14 51 44" src="https://github.com/user-attachments/assets/5737088c-5485-476f-aa27-01d46671df32" />
<h6> Hasil Runningan <br>
<br>
<img width="559" height="574" alt="Screenshot 2026-06-02 at 15 20 46" src="https://github.com/user-attachments/assets/a93ed03a-55e5-471d-966a-9f44d1a6c5ce" />

<h6> Pertanyaan

1. Pencarian data pada Binary Search Tree (BST) lebih efektif karena data tersusun secara terurut, yaitu nilai di kiri lebih kecil dan nilai di kanan lebih besar dari root. Dengan demikian, saat mencari data kita dapat langsung menentukan arah pencarian tanpa memeriksa semua node. <br>
   Sedangkan pada binary tree biasa, data tidak terurut sehingga pencarian harus menelusuri lebih banyak node. Oleh karena itu, pencarian pada BST lebih cepat dan efisien dibandingkan binary tree biasa.
2. Atribut left dan right pada class Node digunakan untuk menyimpan referensi ke node anak kiri dan node anak kanan. Kedua atribut ini berfungsi untuk menghubungkan satu node dengan node lainnya sehingga membentuk struktur binary tree atau binary search tree (BST). <br>
   left menunjuk ke node yang berada di sebelah kiri. <br>
   right menunjuk ke node yang berada di sebelah kanan. <br>
   Dengan adanya atribut tersebut, data dapat disusun dan ditelusuri dengan lebih mudah dalam struktur tree.
3. a. Atribut root pada class BinaryTree digunakan untuk menyimpan referensi ke node akar (root node), yaitu node pertama atau node paling atas dalam tree. Atribut ini menjadi titik awal untuk melakukan berbagai operasi pada tree, seperti penambahan data, pencarian data, traversal, dan penghapusan node. <br>
      Tanpa atribut root, program tidak dapat mengetahui dari mana struktur tree harus diakses atau ditelusuri.
   b. Ketika objek BinaryTree pertama kali dibuat, nilai dari root adalah null. Hal ini karena pada constructor terdapat perintah: <br>
      public BinaryTree02() { <br>
      this.root = null; <br>
      }
      Nilai null menandakan bahwa tree masih kosong dan belum memiliki node apa pun.
4. Ketika tree masih kosong (root == null) dan ditambahkan sebuah node baru, maka node tersebut akan langsung dijadikan root. Pada method add(), hal ini dilakukan dengan: <br>
   if (isEmpty()) { <br>
    root = newNode; <br>
   } <br>
   Jadi, node pertama yang dimasukkan ke dalam tree akan menjadi node akar (root) karena belum ada node lain di dalam tree.
5. Baris program tersebut berfungsi untuk mencari posisi yang tepat bagi node baru pada Binary Search Tree (BST). Variabel parent menyimpan node induk dari current. <br>
   Jika IPK yang ditambahkan lebih kecil, pencarian dilanjutkan ke anak kiri, sedangkan jika lebih besar atau sama dilanjutkan ke anak kanan. Ketika ditemukan posisi kosong (null), node baru akan ditempatkan sebagai anak kiri atau anak kanan dari parent.
6. Jika node yang dihapus memiliki dua anak, method delete() akan mencari successor menggunakan method getSuccessor(). Successor adalah node dengan nilai terkecil pada subtree kanan node yang akan dihapus. <br>
   Setelah ditemukan, successor menggantikan posisi node yang dihapus dan hubungan dengan anak kiri serta kanan diperbarui agar struktur BST tetap valid. <br>
   Method getSuccessor() membantu dengan mencari dan mengembalikan node pengganti (successor) yang sesuai untuk menggantikan node yang dihapus.

## Percobaan 2
<h6> Kode BinaryTreeArray02 <br>
<br>
<img width="557" height="478" alt="Screenshot 2026-06-02 at 14 52 37" src="https://github.com/user-attachments/assets/54ad3bbd-80d7-45da-91f4-27dc5e446594" />
<h6> Kode BinaryTreeMain02 <br>
<br>
<img width="803" height="379" alt="Screenshot 2026-06-02 at 14 53 04" src="https://github.com/user-attachments/assets/9ce9d894-7ca0-408e-b450-442ee2b60dd5" />
<h6> Hasil Runingan <br>
  <br>
<img width="376" height="161" alt="Screenshot 2026-06-02 at 15 14 17" src="https://github.com/user-attachments/assets/46debf11-cc0f-4c99-8d1d-a9f68a32a827" />

<h6> Pertanyaan

1. -> dataMahasiswas digunakan untuk menyimpan seluruh data node pada binary tree dalam bentuk array. <br>
      Setiap indeks array merepresentasikan satu node pada pohon biner. <br>
   -> idxLast digunakan untuk menyimpan indeks terakhir yang berisi data pada array binary tree. <br>
      Atribut ini membantu traversal agar tidak mengakses indeks di luar data yang ada. <br>
   Jadi, dataMahasiswas berfungsi sebagai tempat penyimpanan node, <br>
   sedangkan idxLast berfungsi sebagai batas akhir data yang valid dalam array.
2. Method populateData() digunakan untuk mengisi atau memasukkan data mahasiswa ke dalam array binary tree serta menetapkan indeks terakhir data yang tersimpan (idxLast). <br>
   Method ini mempermudah proses inisialisasi data sebelum dilakukan operasi seperti traversal.
3. Method traverseInOrder() digunakan untuk menampilkan atau mengunjungi seluruh node pada binary tree dengan urutan Inorder, <br>
   Yaitu: Kiri → Root → Kanan <br>
   Method ini bekerja secara rekursif dengan mengunjungi subtree kiri terlebih dahulu, kemudian menampilkan data pada node saat ini, lalu mengunjungi subtree kanan.
4. Pada representasi binary tree dalam array: <br>
   -> Left child = 2 * i + 1 <br>
   -> Right child = 2 * i + 2 <br>
   Jika node berada pada indeks 2, maka: <br>
   -> Left child = (2 × 2) + 1 = 5 <br>
   -> Right child = (2 × 2) + 2 = 6 <br>
   Jadi, left child berada pada indeks 5 dan right child berada pada indeks 6.
5. int idxLast = 6; digunakan untuk menandai indeks terakhir yang berisi data valid pada array binary tree. Karena data mahasiswa tersimpan dari indeks 0 sampai 6 (total 7 data), maka idxLast bernilai 6. <br>
   Nilai ini digunakan saat traversal agar program hanya memproses node yang ada dan tidak mengakses indeks di luar data yang tersimpan. <br>
   Jadi, idxLast = 6 berfungsi sebagai batas akhir data valid dalam array binary tree.
6. Karena pada penyimpanan binary tree berbasis array, hubungan antara parent dan child ditentukan oleh indeks array, sehingga tidak memerlukan pointer atau referensi node. <br>
   Jadi, indeks tersebut digunakan untuk mengakses anak kiri dan anak kanan secara langsung sesuai struktur pohon biner yang disimpan dalam array.

## Tugas Praktikum
<h6> Menambahkan method rekursif (addRekursif()).
<img width="530" height="318" alt="Screenshot 2026-06-02 at 15 12 40" src="https://github.com/user-attachments/assets/702a7bde-5869-472b-bbd6-b6fe57cd4033" />
<h6> Menambahkan method (cariMinIPK() dan cariMaxIPK()).
<img width="310" height="462" alt="Screenshot 2026-06-02 at 15 12 57" src="https://github.com/user-attachments/assets/1ca40a82-c384-469c-86fc-6f526769e72b" />
<h6> Menambahkan method (tampilMahasiswaIPKdiAtas(double ipkBatas)).
<img width="537" height="281" alt="Screenshot 2026-06-02 at 15 13 11" src="https://github.com/user-attachments/assets/092eaf42-ffbd-433c-82e0-9383f41af433" />
<h6> Menambahkan method method add(Mahasiswa data).
<img width="453" height="135" alt="Screenshot 2026-06-02 at 15 13 34" src="https://github.com/user-attachments/assets/96869229-dd94-40d2-a7c5-711f32466ef4" />
<h6> Menambahkan method traversePreOrder().
<img width="433" height="182" alt="Screenshot 2026-06-02 at 15 13 46" src="https://github.com/user-attachments/assets/b48f9c50-093e-4e9f-8d92-70c91e4c50aa" />
<h6> Hasil Runningan <br>
  <br>
<img width="447" height="304" alt="Screenshot 2026-06-02 at 15 14 10" src="https://github.com/user-attachments/assets/e92a259c-659d-4f94-9f22-e6dd162583f4" />
