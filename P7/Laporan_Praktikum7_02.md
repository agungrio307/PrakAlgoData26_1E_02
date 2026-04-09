# Laporan Praktikum ASD Jobsheet 6
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Menambahkan method sequentialSearching pada class MahasiswaBerprestasi02 <br>
  <br>
<img width="496" height="698" alt="Screenshot 2026-04-09 at 06 14 20" src="https://github.com/user-attachments/assets/70d74d73-0be1-4908-8bc3-3ae3eb4ceffc" />
<img width="504" height="661" alt="Screenshot 2026-04-09 at 06 15 05" src="https://github.com/user-attachments/assets/04814ae1-3e6b-40d7-bb7c-c4f3ca4f1214" />
<img width="789" height="352" alt="Screenshot 2026-04-09 at 06 15 31" src="https://github.com/user-attachments/assets/c1411a53-4c54-433c-beb0-12d74df708be" />
<h6> Menambahkan kode program untuk melakukan pencarian data pada class class MahasiswaDemo02 <br>
  <br>
<img width="621" height="714" alt="Screenshot 2026-04-09 at 06 17 49" src="https://github.com/user-attachments/assets/f72e5561-d1e0-4ade-8479-945942b57eeb" />
<img width="760" height="410" alt="Screenshot 2026-04-09 at 06 18 21" src="https://github.com/user-attachments/assets/53a6e2d9-7506-4c8a-b2cd-df02e3fca94e" />
<h6> Hasil Runningan <br>
<br>
<img width="233" height="704" alt="Screenshot 2026-04-09 at 06 20 26" src="https://github.com/user-attachments/assets/6398f7bf-9f07-4062-830a-e42832abeff5" />
<img width="404" height="249" alt="Screenshot 2026-04-09 at 06 21 47" src="https://github.com/user-attachments/assets/27543261-d027-4c87-9130-e56d39a25ddd" />

<h6> Pertanyaan

1. - Method tampilPosisi: <br>
     Output: index/posisi <br>
     Tujuan: Mengetahui lokasi data <br>
   - Method tampilDataSearch <br>
     Output: Detail mahasiswa <br>
     Tujuan: Mengetahui isi data <br>
2. break digunakan untuk keluar dari loop saat data sudah ditemukan, sehingga           pencarian berhenti tepat saat itu juga. <br>
   Penjelasan alurnya: <br>
   -> Program sedang melakukan pencarian (sequential searching) dalam array listMhs.     <br>
   -> Jika ditemukan data dengan ipk yang sama dengan nilai cari: <br>
      posisi diset ke indeks saat ini (j) <br>
      lalu break dijalankan
3. Fungsi variabel pos / posisi: <br>
   Variabel ini digunakan untuk menyimpan indeks (letak) data yang ditemukan dalam      array.
4. -> Perulangan dimulai dari indeks 0 sampai akhir array. <br>
   -> Ketika ditemukan data dengan IPK yang sama dengan nilai yang dicari (cari), maka:         <br>
   -> posisi diisi dengan indeks tersebut (posisi = j) <br>
   -> Program langsung keluar dari perulangan karena ada perintah break. <br>
      Jadi, jika terdapat lebih dari satu data dengan nilai yang sama, maka sequential          search hanya akan menampilkan data pertama yang ditemukan (data dengan indeks             paling kecil).
5. Jika perintah break dihapus, maka: <br>
   -> Perulangan tidak berhenti saat menemukan data pertama <br>
   -> Program akan terus mengecek semua elemen sampai akhir array <br>
   -> Setiap kali menemukan IPK yang sama, nilai posisi akan diupdate terus

## Percobaan 2
<h6> Menambahkan method findBinarySearch pada class MahasiswaBerprestasi02 <br>
<br>
<img width="501" height="699" alt="Screenshot 2026-04-09 at 12 43 53" src="https://github.com/user-attachments/assets/55513fdf-9162-46f8-9055-106846a34354" />
<img width="509" height="665" alt="Screenshot 2026-04-09 at 12 44 34" src="https://github.com/user-attachments/assets/b3901913-b224-4410-a9d6-7402d714705d" />
<img width="791" height="667" alt="Screenshot 2026-04-09 at 12 45 01" src="https://github.com/user-attachments/assets/fd0cd42a-0d13-4f74-9c34-a726a52484ff" />
<h6> Panggil method findBinarySearch terdapat pada class MahasiswaBerprestasi02 di kelas
MahasiswaDemo02 <br>
<br>
<img width="626" height="564" alt="Screenshot 2026-04-09 at 12 46 38" src="https://github.com/user-attachments/assets/41b2232e-38c9-4282-864d-feb5c7a1bee1" />
<img width="638" height="265" alt="Screenshot 2026-04-09 at 12 47 01" src="https://github.com/user-attachments/assets/ceb69058-9a61-4961-8f50-e086a601cb6f" />
<h6> Hasil Runningan <br>
<br>
<img width="232" height="712" alt="Screenshot 2026-04-09 at 12 48 33" src="https://github.com/user-attachments/assets/84047f1d-a8f9-452c-81aa-2d32dec296b5" />
<img width="450" height="272" alt="Screenshot 2026-04-09 at 12 48 56" src="https://github.com/user-attachments/assets/829aff42-da11-4103-9f67-1654b4781d11" />

<h6> Pertanyaan

1. return findBinarySearch(cari, left, mid - 1);   // bagian kiri <br>
   return findBinarySearch(cari, mid + 1, right);  // bagian kanan <br>
   Di sinilah proses divide sebenarnya terjadi, karena: <br>
   -> Data dipersempit hanya ke setengah bagian <br>
   -> Terus dibagi lagi sampai ketemu atau habis
2. Bagian kode yang merupakan conquer: <br>
   if (cari == listMhs[mid].ipk) { <br>
    return mid;   // ← CONQUER: data ditemukan <br>
    } <br>
    dan juga: <br>
    return -1;   // ← CONQUER: data tidak ditemukan <br>
3. -> Left (batas kiri) --> Menunjukkan indeks awal dari area pencarian. Artinya:               pencarian dimulai dari posisi left, Awalnya biasanya 0
   -> Right (batas kanan) --> Menunjukkan indeks akhir dari area pencarian. Artinya:            pencarian hanya sampai posisi right, Biasanya = jumlah data - 1
   -> Mid (titik tengah) --> Menentukan posisi tengah dari area pencarian. Fungsinya:           Membagi data menjadi dua bagian dan Menjadi patokan perbandingan
4. Program tetap bisa berjalan, tapi hasilnya bisa salah (khususnya binary search). <br>
   Karena binary search: <br>
	 •	Mengasumsikan data sudah terurut (ascending/descending) <br>
	 •	Prosesnya membagi data berdasarkan nilai tengah (mid) <br>
    Kalau data tidak urut: <br>
	 •	Perbandingan listMhs[mid].ipk > cari jadi tidak valid <br>
   •	Bisa: <br>
	 •	Data tidak ditemukan padahal ada <br>
	 •	Atau posisi salah
5. hasil binary search Tidak sesuai (bisa salah).
   jika ingin sesuai, yang harus diubah adalah arus perbandingan (<)
   else if (listMhs[mid].ipk < cari) { <br>
            return findBinarySearch(cari, left, mid - 1); // ke kiri <br>
        }
6. Binary search menyatakan data tidak ditemukan ketika: <br>
   •	left sudah melewati right (right < left) <br>
	 •	Artinya seluruh array sudah diperiksa <br>
	 •	Dan tidak ada yang cocok <br>
   Pencarian berhenti → return -1
7. modifikasi di kode MahasiswaBerprestasi02 <br>
<img width="509" height="702" alt="Screenshot 2026-04-09 at 13 12 21" src="https://github.com/user-attachments/assets/03bab455-f04d-46fa-af20-d70d2c56d2e2" />
<img width="500" height="660" alt="Screenshot 2026-04-09 at 13 13 26" src="https://github.com/user-attachments/assets/854fccd1-c524-4550-8597-ce5488d88ed4" />
<img width="789" height="659" alt="Screenshot 2026-04-09 at 13 13 51" src="https://github.com/user-attachments/assets/00c9aeb1-8d23-4d89-9b8c-640c0b1768ae" />
<br>
<br>
Modifikasi di kode MahasiswaDemo02 <br>
<img width="622" height="620" alt="Screenshot 2026-04-09 at 13 15 10" src="https://github.com/user-attachments/assets/6c31b840-99f1-41a6-a6fe-f0c316fc8793" />
<img width="638" height="265" alt="Screenshot 2026-04-09 at 12 47 01" src="https://github.com/user-attachments/assets/da744ea1-45d1-43e3-94ce-9d56e884be57" />

      
