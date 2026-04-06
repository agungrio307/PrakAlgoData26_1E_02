# Laporan Praktikum ASD Jobsheet 5
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h4> A. SORTING – BUBBLE SORT
<h6> Kode Sorting02 <br>
<br>
<img width="436" height="645" alt="Screenshot 2026-04-06 at 07 50 41" src="https://github.com/user-attachments/assets/0f77c4bc-7d26-4668-9947-e520c7f64d0e" />
<h6> Kode SortingMain02 <br>
<br>
<img width="641" height="404" alt="Screenshot 2026-04-06 at 07 52 40" src="https://github.com/user-attachments/assets/1617442d-989f-40d2-bd1b-7d352cf5bd2a" />
<h6> Hasil Runningan <br>
<br>
<img width="444" height="161" alt="Screenshot 2026-04-06 at 07 54 28" src="https://github.com/user-attachments/assets/3dad3c41-2214-4258-99a3-3660318ecf89" />
<h4> B. SORTING – SELECTION SORT
<h6> Kode Sorting02 <br>
<br> 
<img width="450" height="762" alt="Screenshot 2026-04-06 at 22 05 46" src="https://github.com/user-attachments/assets/39b2bb0a-e1f6-4d3b-9b37-d615785ced04" />
<img width="396" height="142" alt="Screenshot 2026-04-06 at 22 06 33" src="https://github.com/user-attachments/assets/23627c0a-6d0f-4d53-b0dc-cdff9dc9d3fb" />
<h6> Kode SortingMain02 <br>
<br>
<img width="670" height="566" alt="Screenshot 2026-04-06 at 22 09 29" src="https://github.com/user-attachments/assets/40073617-0d74-45a1-b674-e80870aad103" />
<h6> Hasil Runningan <br>
<br>
<img width="362" height="186" alt="Screenshot 2026-04-06 at 22 10 17" src="https://github.com/user-attachments/assets/bccc92e6-dc98-4eec-a454-8a3c0fa0381b" />
<h4> C. SORTING – INSERTION SORT
<h6> Kode Sorting02 <br>
<br> 
<img width="450" height="762" alt="Screenshot 2026-04-06 at 22 05 46" src="https://github.com/user-attachments/assets/ae0b5645-545d-418c-9e71-a42f2e06df15" />
<img width="471" height="358" alt="Screenshot 2026-04-06 at 22 17 40" src="https://github.com/user-attachments/assets/df750db8-19bc-48cf-9ad7-3a0537592b9e" />
<h6> Kode SortingMain02 <br>
<br>
<img width="668" height="742" alt="Screenshot 2026-04-06 at 22 19 16" src="https://github.com/user-attachments/assets/0d97c5e0-319f-4fe3-bc39-1ad22e6d7014" />
<h6> Hasil Runningan <br>
<br>
<img width="370" height="255" alt="Screenshot 2026-04-06 at 22 20 06" src="https://github.com/user-attachments/assets/0f12a84c-dbc4-4ca4-8ce8-4e90cb3efe66" />

<h6> Pertanyaan

1. Kode tersebut berfungsi untuk: <br>
   Membandingkan dua elemen bersebelahan dan menukarnya jika tidak sesuai urutan        ascending, yang merupakan inti dari algoritma Bubble Sort.
2. Pada algoritma Selection Sort, bagian yang digunakan untuk mencari nilai minimum     ada di dalam loop berikut: <br>
   int min = i;
            for (int j = i + 1; j < jumData; j++) { <br>
                if (data[j] < data[min]) { <br>
                    min = j; <br>
                } <br>
            } <br>
3. -> j >= 0 <br>
      Memastikan indeks tidak keluar dari batas array (tidak ke kiri melebihi indeks       0). <br>
      Karena kita akan terus mundur ke kiri (j--), jadi harus dicek supaya tetap           valid. <br>
   -> data[j] > temp <br>
      Mengecek apakah nilai di sebelah kiri lebih besar dari nilai yang sedang             disisipkan (temp). <br>
      Kalau iya, berarti posisinya salah dan harus digeser ke kanan.
4. Perintah tersebut bertujuan untuk: <br>
   menempatkan nilai yang sedang diproses (temp) ke posisi yang benar setelah semua     elemen yang lebih besar digeser ke kanan.

## Percobaan 2
<h6> Kode Mahasiswa02 <br>
<br>
<img width="773" height="523" alt="Screenshot 2026-04-06 at 23 04 37" src="https://github.com/user-attachments/assets/4b73a96f-a991-49e1-a7be-0f5411c2de1b" />
<h6> Kode MahasiswaBerprestasi02 <br>
<br>
<img width="497" height="641" alt="Screenshot 2026-04-06 at 23 05 31" src="https://github.com/user-attachments/assets/504753aa-e46a-447b-b694-c15e24b8310d" />
<h6> Kode MahasiswaDemo02 <br>
<br>
<img width="711" height="486" alt="Screenshot 2026-04-06 at 23 06 21" src="https://github.com/user-attachments/assets/866ce266-9a71-4984-bd3b-d64582964e12" />
<h6> Hasil Runningan <br>
<br>
<img width="403" height="545" alt="Screenshot 2026-04-06 at 23 07 24" src="https://github.com/user-attachments/assets/837b1fa7-5d9a-447f-b707-aea7b3044b17" />
<img width="170" height="228" alt="Screenshot 2026-04-06 at 23 08 17" src="https://github.com/user-attachments/assets/e062043a-2474-4d11-a96a-c8448d367786" />

<h6> Pertanyaan

1. a. Syarat i < listMhs.length - 1 digunakan karena: <br>
      -> Setiap iterasi menempatkan satu elemen ke posisi final <br>
      -> Elemen terakhir tidak perlu dicek lagi <br>
      -> Menghindari iterasi yang tidak perlu (lebih efisien) <br>
   b. Syarat j < listMhs.length - i digunakan untuk: <br>
      -> Menghindari membandingkan elemen yang sudah pasti urut <br>
      -> Mengurangi jumlah perbandingan <br>
      -> Membuat Bubble Sort lebih efisien <br>
   c. Jumlah perulangan i akan berlangsung sebanyak 49 kali <br>
      Jumlah Tahap bubble sort yang ditempuh ada 49 tahap
2. Program yang dimodifikasi dari kode MahasiswaBerprestasi02 dan MahasiswaDemo02       <br>
   Modifikasi kode MahasiswaBerprestasi02 <br>
   <img width="495" height="707" alt="Screenshot 2026-04-06 at 23 38 31" src="https://github.com/user-attachments/assets/5c256860-5ba5-4d4d-b24f-6a8be34a1f30" />
   <br>
  Modifikasi kode MahasiswaDemo02 <br>
  <img width="721" height="769" alt="Screenshot 2026-04-06 at 23 36 34" src="https://github.com/user-attachments/assets/a2004b5f-40dc-4025-b09c-075f37df5787" />
