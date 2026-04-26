# Laporan Praktikum ASD Jobsheet 5
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode Mahasiswa02 <br>
<br>
<img width="478" height="371" alt="image" src="https://github.com/user-attachments/assets/d2caf367-f93f-4ad3-b1f5-5967e0424c26" />
<h6> Kode StackTugasMahasiswa02 <br>
<br>
<img width="683" height="698" alt="image" src="https://github.com/user-attachments/assets/d251d41d-a6d8-4698-b333-56b8854e687d" />
<img width="739" height="487" alt="image" src="https://github.com/user-attachments/assets/ca9904e0-2a41-4e4c-b398-3e0e1d0f74bd" />
<h6> Kode MahasiswaDemo02 <br>
<br>
<img width="800" height="763" alt="image" src="https://github.com/user-attachments/assets/d03b3cc2-cc47-4448-81d0-c708894522d0" />
<img width="743" height="316" alt="image" src="https://github.com/user-attachments/assets/a5f6d66d-3cfd-499b-8d97-fd9aa28cef5d" />
<h6> Hasil Runningan <br>
<br>
<img width="285" height="646" alt="image" src="https://github.com/user-attachments/assets/eb6ad2a5-25f8-465b-8274-d49b26e6a506" />
<img width="343" height="612" alt="image" src="https://github.com/user-attachments/assets/da8072cf-6763-4256-822d-cec159098c3b" />

<h6> Pertanyaan

1. <img width="739" height="142" alt="image" src="https://github.com/user-attachments/assets/d922c2d5-9df5-41b9-8e0b-9e98f94c6f05" />
2. Jumlah data tugas mahasiswa yang bisa ditampung dalam Stack itu ditentukan oleh kapasitas (size) yang di-set saat membuat objek stack. <br>
   Potongan kode yang membuktikan: <br>
   Mahasiswa02[] stack; <br>
   int size; <br>

   StackTugasMahasiswa02(int size) { <br>
       this.size = size; <br>
       stack = new Mahasiswa02[size]; <br>
       top = -1; <br>
   }
3. Pengecekan !isFull() di method push() itu wajib supaya kamu tidak memasukkan data melebihi kapasitas array, Karena stack yang dipakai array dengan ukuran tetap <br>
   Kalau kondisi if (!isFull()) dihapus, Ini langsung melewati batas array dan Program akan error dengan bertuliskan ArrayIndexOutOfBoundsException.
5. Modifikasi pada kode StackTugasMahasiswa02 <br>
   <img width="562" height="152" alt="Screenshot 2026-04-26 at 16 22 21" src="https://github.com/user-attachments/assets/efc53cf4-ae72-49bf-9a81-2d97fb6bb447" />
   Modifikasi pada kode MahasiswaDemo02 <br>
   <img width="797" height="760" alt="Screenshot 2026-04-26 at 16 24 33" src="https://github.com/user-attachments/assets/cfe8f82b-38e3-4424-8b64-a27ad60023ff" />
   <img width="773" height="435" alt="Screenshot 2026-04-26 at 16 26 01" src="https://github.com/user-attachments/assets/e26543d5-320f-4764-be4e-72f42d1b13fd" />

## Percobaan 2
<h6> Menambahkan method konversiDesimalKeBiner pada kode StackTugasMahasiswa02 <br>
<br>
<img width="518" height="262" alt="image" src="https://github.com/user-attachments/assets/861076e4-0373-465c-a095-424a306f1057" />
<h6> Membuat class baru dengan nama StackKonversi02 <br>
<br>
<img width="433" height="762" alt="image" src="https://github.com/user-attachments/assets/26eede12-2e14-4cd7-96ce-0b84b2df4f34" />
<h6> Hasil Runningan <br>
<br>
<img width="351" height="544" alt="image" src="https://github.com/user-attachments/assets/d9e34d3a-b4ee-4018-ac7a-1e1a4285bd78" />

<h6> Pertanyaan 

1. Method konversiDesimalKeBiner(int nilai) bekerja dengan konsep stack (LIFO – Last In First Out) untuk membalik urutan sisa hasil pembagian. <br>
   Alur kerja: <br>
   -> Inisialisasi Stack <br>
      Membuat stack khusus untuk menyimpan sisa pembagian (0 atau 1). <br>
      Ukuran 32 cukup untuk menampung hasil biner dari integer. <br>
   -> Proses Konversi (Desimal → Sisa Bagi 2) <br>
      Menghasilkan digit biner dari belakang ke depan, jadi perlu stack untuk membalik urutan.
   -> Ambil dari Stack (Membalik Urutan) <br>
      Karena stack itu LIFO, Data terakhir masuk akan keluar dulu <br>
      Ini membuat urutan jadi benar (MSB → LSB) <br>
   -> Return Hasil <br>
      String biner berisi hasil konversi angka desimal ke biner
2. Kalau mengganti kondisi perulangan dari while (nilai > 0) menjadi while (kode != 0), <br>
   Hasilnya tergantung, apakah variabel kode itu sama dengan nilai atau tidak. <br>
   Kalau di method kamu tidak ada variabel kode, maka program akan error (compile error) karena Java tidak mengenal variabel kode. <br>
   Tapi jika diubah semua nilai jadi kode, maka while (kode != 0) Hasilnya sama persis dengan while (nilai > 0). <br>
   Karena:
   Proses pembagian selalu => kode = kode / 2; <br>
   Nilai akan terus mengecil => 10 → 5 → 2 → 1 → 0 <br>
   Dan loop berhenti saat kode = 0 <br>
   Jadi, tidak ada perbedaan output <br>
   > 0 → berhenti saat 0 <br>
   != 0 → juga berhenti saat 0

## Latihan Praktikum 1
<h6> Kode Surat02 <br>
<br>
<img width="744" height="553" alt="image" src="https://github.com/user-attachments/assets/139df669-abf9-46ce-bcf7-310020a6e346" />
<h6> Kode StackSurat02 <br>
<br>
<img width="538" height="764" alt="image" src="https://github.com/user-attachments/assets/9321ea48-027f-48ef-860a-6fc22e2d57f8" />
<img width="537" height="337" alt="image" src="https://github.com/user-attachments/assets/586b8ea1-2960-4a18-bb92-8dd0bb764fe6" />
<h6> Kode SuratDemo02 <br>
<br>
<img width="619" height="709" alt="image" src="https://github.com/user-attachments/assets/201d9ef5-5e6b-4299-88fc-03c479fa5ef0" />
<img width="590" height="565" alt="image" src="https://github.com/user-attachments/assets/742a7793-4604-40d3-b017-64664a714ffa" />
<h6> Hasil Runningan <br>
<br>
<img width="225" height="665" alt="image" src="https://github.com/user-attachments/assets/09abd3e6-b1a9-42ce-bd73-b32a36c79fc1" />
<img width="348" height="666" alt="image" src="https://github.com/user-attachments/assets/33270759-6e3b-4aae-91d0-423313b523c9" />
