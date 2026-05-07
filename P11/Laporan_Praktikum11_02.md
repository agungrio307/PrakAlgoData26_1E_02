# Laporan Praktikum ASD Jobsheet 11
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode Mahasiswa02 <br>
<br>
<img width="656" height="420" alt="Screenshot 2026-05-05 at 08 44 21" src="https://github.com/user-attachments/assets/bff9d152-86ef-4916-884b-35772253d606" />
<h6> Kode NodeMahasiswa02 <br>
<br>
<img width="564" height="603" alt="Screenshot 2026-05-05 at 08 44 40" src="https://github.com/user-attachments/assets/a34e65de-b318-4821-a67a-77e4d6c624d8" />
<img width="609" height="684" alt="Screenshot 2026-05-05 at 08 44 58" src="https://github.com/user-attachments/assets/b1502b41-fea3-426a-a0c8-03d88917c2f8" />
<img width="529" height="319" alt="Screenshot 2026-05-05 at 08 45 11" src="https://github.com/user-attachments/assets/b5deb906-c92a-44c5-b763-68b576a96555" />
<h6> Kode SLLMain02 <br>
<br>
<img width="752" height="464" alt="Screenshot 2026-05-05 at 08 45 23" src="https://github.com/user-attachments/assets/58062e45-6b29-4ea8-835c-2ff2d1dcce9f" />

<h6> Pertanyaan 

1. Pesan “Linked List Kosong” muncul karena saat print() dipanggil, nilai head masih null (belum ada data). Akibatnya isEmpty() bernilai true dan program menampilkan kondisi list kosong.
2. Variabel temp secara umum digunakan sebagai penunjuk (pointer) sementara untuk menelusuri (traversal) node dalam linked list. <br>
   Kegunaannya: <br>
   -> Menyimpan posisi node saat ini tanpa mengubah head <br>
   -> Membantu berpindah dari satu node ke node berikutnya (temp = temp.next) <br>
   -> Digunakan untuk mencari, menyisipkan, atau menampilkan data <br>
   Jadi, temp berfungsi sebagai variabel bantu agar proses manipulasi linked list bisa dilakukan tanpa merusak struktur awal list.
3. <img width="604" height="671" alt="image" src="https://github.com/user-attachments/assets/e37afcea-399b-4b7b-9a94-d71d1ecec2a0" />

## Percobaan 2
<h6> Menambahkan kode pada NodeMahasiswa02 <br>
<br>
<img width="686" height="627" alt="Screenshot 2026-05-05 at 09 28 06" src="https://github.com/user-attachments/assets/57b93fe3-ecc1-4c24-a578-d7a7b3f0bdbd" />
<img width="691" height="650" alt="Screenshot 2026-05-05 at 09 28 21" src="https://github.com/user-attachments/assets/f0244382-ed12-4dd6-a304-6e19e8d8baf7" />
<img width="436" height="283" alt="Screenshot 2026-05-05 at 09 28 31" src="https://github.com/user-attachments/assets/aee2adce-763f-41ee-bab6-b4eb9db1968c" />
<h6> Modifikasi kode SLLMain02 <br>
<br>
<img width="822" height="307" alt="Screenshot 2026-05-05 at 09 29 16" src="https://github.com/user-attachments/assets/c4acd5c7-46bf-4c5e-b8ce-205c31cda52a" />
<h6> Hasil Runningan <br>
<br>
<img width="493" height="442" alt="Screenshot 2026-05-05 at 09 29 30" src="https://github.com/user-attachments/assets/05a6ec19-b63d-4b55-bd79-54f10a4bda00" />

<h6> Pertanyaan 

1. Pada method remove, linked list dicek satu per satu menggunakan while. Jika node yang sesuai ditemukan lalu dihapus, maka proses pencarian tidak perlu dilanjutkan lagi. Karena itu digunakan break.
2. Kode berikut digunakan untuk menghapus node tertentu pada single linked list dan memperbarui tail jika node terakhir terhapus. <br>
   -> temp adalah node sebelum node yang akan dihapus. <br>
   -> temp.next adalah node yang ingin dihapus. <br>
   -> temp.next.next adalah node setelahnya.

## Tugas Praktikum 1
<h6> Kode mhs02 <br>
<br>
<img width="505" height="334" alt="Screenshot 2026-05-07 at 10 08 13" src="https://github.com/user-attachments/assets/102a9266-9c03-43e9-b2b2-1f1fafc307d7" />
<h6> Kode NodeAntrian02 <br>
<br>
<img width="493" height="222" alt="Screenshot 2026-05-07 at 10 09 24" src="https://github.com/user-attachments/assets/90d739bc-6b03-4ba9-b9a6-bdb3867121e2" />
<h6> Kode AntrianLayananKemahasiswaan02 <br>
<br>
<img width="517" height="459" alt="Screenshot 2026-05-07 at 10 10 30" src="https://github.com/user-attachments/assets/8f6a8894-f1e9-42ec-9fbf-4076572f5bae" />
<img width="563" height="604" alt="Screenshot 2026-05-07 at 10 10 49" src="https://github.com/user-attachments/assets/a9a4c576-d340-46de-ad33-f1161a761744" />
<img width="556" height="680" alt="Screenshot 2026-05-07 at 10 11 24" src="https://github.com/user-attachments/assets/1e696556-d5b0-4f80-aa09-730dc550149e" />
<h6> Kode MainLayananKemahasiswaan02 <br>
<br>
<img width="722" height="764" alt="Screenshot 2026-05-07 at 10 12 57" src="https://github.com/user-attachments/assets/5e5394f9-8ba5-46ad-b26f-05c1b52a87d4" />
<img width="529" height="640" alt="Screenshot 2026-05-07 at 10 13 16" src="https://github.com/user-attachments/assets/3959f9f5-9dc3-48a1-8890-5d37d0cbf83a" />
<h6> Hasil Runningan <br>
<br>
<img width="289" height="498" alt="Screenshot 2026-05-07 at 10 14 14" src="https://github.com/user-attachments/assets/c23cca4c-2c4c-40c1-8726-e18f99aba3d4" />
<img width="296" height="656" alt="Screenshot 2026-05-07 at 10 14 38" src="https://github.com/user-attachments/assets/3fb86e50-3ebd-4bd8-a55b-1f243ba026bc" />
<img width="295" height="628" alt="Screenshot 2026-05-07 at 10 15 02" src="https://github.com/user-attachments/assets/1176ff68-a3ca-425b-b843-5648b456675f" />
<img width="307" height="541" alt="Screenshot 2026-05-07 at 10 15 19" src="https://github.com/user-attachments/assets/4a34fe14-07c1-4a6f-8595-379e454c4557" />
<img width="450" height="346" alt="Screenshot 2026-05-07 at 10 15 35" src="https://github.com/user-attachments/assets/26eca3e1-2725-4fa4-97c9-42302b03354e" />









