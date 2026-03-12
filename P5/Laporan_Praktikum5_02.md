# Laporan Praktikum ASD Jobsheet 3
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode Faktorial <br>
<br>
<img width="410" height="404" alt="image" src="https://github.com/user-attachments/assets/7707767e-43fe-499e-a91e-4a7316552789" />
<h6> Kode MainFaktorial <br>
<br>
<img width="806" height="307" alt="image" src="https://github.com/user-attachments/assets/23d6b8be-3b74-46f4-90db-2131b56669ff" />
<h6> Hasil Runningan <br>
  <br>
<img width="450" height="134" alt="image" src="https://github.com/user-attachments/assets/8b283e2d-127a-43b4-949e-ed47ffcc2a71" />

<h6> Pertanyaan

1. if <br>
   -> Bagian if digunakan sebagai kondisi dasar (base case) yang menentukan kapan rekursi berhenti, yaitu saat n = 1 sehingga nilai yang dikembalikan adalah 1. <br>
   else <br>
   -> Bagian else digunakan untuk proses rekursi, yaitu menghitung faktorial dengan cara mengalikan n dengan hasil pemanggilan fungsi faktorial dari n-1 hingga mencapai kondisi pada if.
2. Iya. <br>
   Perulangan pada method faktorialBF() tidak harus menggunakan for, tetapi juga bisa menggunakan while atau do-while karena keduanya sama sama digunakan untuk melakukan perulangan sampai kondisi tertentu terpenuhi. <br>
   int faktorialBF(int n) { int fakto = 1; int i = 1; while (i <= n) { fakto = fakto * i; i++; } return fakto; }
3. Perbedaan nya terletak di cara menghitung nya, <br>
   -> fakto *= i; digunakan untuk menghitung faktorial dengan perulangan. <br>
      berarti nilai fakto dikalikan dengan i lalu hasilnya disimpan kembali ke dalam fakto. <br>
   -> int fakto = n * faktorialDC(n-1) pernyataan ini menghitung faktorial dengan cara memanggil fungsi itu sendiri menggunakan nilai yang lebih kecil (n-1) sampai mencapai kondisi dasar. <br>
   Jadi perbedaannya adalah yang pertama menggunakan perulangan, sedangkan yang kedua menggunakan rekursi.
4. -> faktorialBF() menghitung faktorial menggunakan perulangan (loop) dengan mengalikan angka dari 1 sampai n secara langsung. <br>
   -> faktorialDC() menghitung faktorial menggunakan rekursi, yaitu memanggil method yang sama dengan nilai n-1 hingga mencapai kondisi dasar (n = 1).

## Percobaan 2
<h6> Kode Pangkat <br>
  <br>
<img width="554" height="549" alt="image" src="https://github.com/user-attachments/assets/0ef78034-2759-4eac-9b98-950c5fdfc11b" />
<br> Kode MainPangkat <br>
<br>
<img width="793" height="576" alt="image" src="https://github.com/user-attachments/assets/18a8ec3e-8cf9-45bb-973c-b36a27cda05b" />
<h6> Hasil Runningan <br>
<br>
<img width="454" height="304" alt="image" src="https://github.com/user-attachments/assets/e2a7dc17-8f1b-408d-b027-bb19f08ccbee" />

<h6> Pertanyaan

1. PangkatBF() <br>
   -> Menghitung pangkat menggunakan perulangan (loop). <br>
   -> Nilai basis dikalikan dengan dirinya sendiri sebanyak n kali. <br>
   -> Prosesnya dilakukan secara berurutan dari awal sampai akhir. <br>
   PangkatDC() <br>
   -> Menghitung pangkat menggunakan rekursi dengan konsep Divide and Conquer. <br>
   -> Nilai pangkat dipecah menjadi n/2 lalu memanggil method yang sama. <br>
   -> Jika n ganjil dikalikan lagi dengan a, jika n genap cukup mengalikan hasil rekursi.
2. Ada. <br>
   return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
3. Menurut saya, method pangkatBF() tidak harus memiliki parameter karena pada class Pangkat sudah terdapat atribut nilai dan pangkat yang menyimpan data basis dan pangkat. <br>
   int pangkatBF() { int hasil = 1; for (int i = 0; i < pangkat; i++) { hasil = hasil * nilai; } return hasil; }
4. -> pangkatBF(), perhitungan dilakukan langsung dan berurutan dari awal sampai akhir. <br>
   -> pangkatDC(), perhitungan dilakukan dengan membagi masalah lalu menggabungkan hasilnya.

## Percobaan 3
<h6> kode Sum <br>
<br>
<img width="459" height="511" alt="image" src="https://github.com/user-attachments/assets/0d97b587-4c3c-4de0-9d8f-3be23e1d2ddb" />
<h6> Kode MainSum <br>
<br>
<img width="835" height="380" alt="image" src="https://github.com/user-attachments/assets/2cd8623f-0d2d-4ec3-8eba-f090fc2ce0d9" />
<h6> Hasil Runningan <br>
<br>
<img width="453" height="206" alt="image" src="https://github.com/user-attachments/assets/8cc40e19-94e9-4673-a6e4-d6c503f76c7f" />

<h6> Pertanyaan 

1. Variabel mid digunakan untuk menentukan titik tengah array agar data dapat dibagi menjadi dua bagian dalam proses.
2. double lsum = totalDC(arr, l, mid); <br>
   -> menghitung jumlah elemen pada bagian kiri array dari indeks l sampai mid <br>
   double rsum = totalDC(arr, mid+1, r); <br>
   -> menghitung jumlah elemen pada bagian kanan array dari indeks mid+1 sampai r.
3. Penjumlahan lsum + rsum diperlukan untuk menggabungkan hasil penjumlahan dari bagian kiri dan kanan array yang sebelumnya terbagi.
4. Hanya ada satu elemen pada array tersebut, sehingga nilai elemen itu langsung dikembalikan tanpa pembagian lagi.
5. Kesimpulannya, membagi array menjadi dua bagian menggunakan nilai tengah (mid), kemudian menghitung jumlah masing-masing bagian secara rekursif hingga mencapai base case (satu elemen). <br>
   Setelah itu, hasil dari bagian kiri (lsum) dan kanan (rsum) dijumlahkan kembali untuk mendapatkan total keseluruhan elemen dalam array.

## latihan Praktikum 1
<h6> Kode DaftarNilaiMHS <br>
<br>
<img width="422" height="768" alt="image" src="https://github.com/user-attachments/assets/1c352139-cc66-4546-b7fa-af9b08636782" />
<img width="436" height="173" alt="image" src="https://github.com/user-attachments/assets/29d64a47-5278-4df8-988a-51b5a6ffb7e6" />
<h6> Kode MainNilai <br>
<br>
<img width="751" height="562" alt="image" src="https://github.com/user-attachments/assets/8472d2a3-370e-4712-aa1b-b6853098fe68" />
<h6> Hasil Runningan <br>
<br>
<img width="449" height="511" alt="image" src="https://github.com/user-attachments/assets/9e10106a-33ce-423f-a64b-c410a284e507" />

