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

## Percobaan 3
<h6> Kode MahasiswaBerprestasi02 <br>
<br>
<img width="565" height="698" alt="Screenshot 2026-04-07 at 08 14 25" src="https://github.com/user-attachments/assets/1bd2b756-1c64-46db-93ce-41829c74934e" />
<img width="509" height="262" alt="Screenshot 2026-04-07 at 08 14 51" src="https://github.com/user-attachments/assets/c026ae3e-97b3-4a50-85b6-e88412c555cc" />
<h6> Kode MahasiswaDemo02 <br>
<br>
<img width="724" height="730" alt="Screenshot 2026-04-07 at 08 15 48" src="https://github.com/user-attachments/assets/bbd321a1-fb58-433d-afe2-2edf2982a6f8" />
<img width="754" height="111" alt="Screenshot 2026-04-07 at 08 16 15" src="https://github.com/user-attachments/assets/13193829-14b5-4255-97a3-827d2aecd229" />
<h6> Hasil Runningan <br>
<br>
<img width="242" height="552" alt="Screenshot 2026-04-07 at 08 18 41" src="https://github.com/user-attachments/assets/b71fa2dc-9286-44bd-b719-64eaa7810a54" />
<img width="427" height="521" alt="Screenshot 2026-04-07 at 08 19 20" src="https://github.com/user-attachments/assets/7822b6c8-d2e8-42cd-b1cc-13a0f68fba90" />
<img width="454" height="102" alt="Screenshot 2026-04-07 at 08 19 58" src="https://github.com/user-attachments/assets/5c17e2b2-b546-42c9-9afe-02016c58a372" />

<h6> Pertanyaan 

1. Proses ini digunakan untuk: <br>
   Mencari posisi (index) mahasiswa dengan IPK paling kecil dari bagian array yang      belum terurut. <br>
   Kode tersebut berfungsi untuk menentukan elemen dengan nilai IPK terkecil pada       setiap iterasi selection sort sebelum dilakukan pertukaran (swap).

## Percobaan 4
<h6> Kode MahasiswaBerprestasi <br>
<br>
<img width="570" height="701" alt="Screenshot 2026-04-08 at 09 39 18" src="https://github.com/user-attachments/assets/8f4c8034-b1ff-46ea-a6f9-de598beec453" />
<img width="515" height="482" alt="Screenshot 2026-04-08 at 09 40 14" src="https://github.com/user-attachments/assets/6eb8f09a-1a3b-4742-95f8-60e3b9cfb4d3" />
<h6> Kode MahasiswaDemo02 <br>
<br>
<img width="726" height="728" alt="Screenshot 2026-04-08 at 09 41 18" src="https://github.com/user-attachments/assets/193faabb-3032-4d27-92fa-334fc40ec19e" />
<img width="760" height="178" alt="Screenshot 2026-04-08 at 09 41 36" src="https://github.com/user-attachments/assets/23e309de-af12-4e1d-a0a3-0dc216c0d2c5" />
<h6> Hasil Runningan <br>
<br>
<img width="248" height="536" alt="Screenshot 2026-04-08 at 09 47 48" src="https://github.com/user-attachments/assets/6cbdad64-2c83-4fe1-ab20-80fc84138b37" />
<img width="425" height="439" alt="Screenshot 2026-04-08 at 09 48 25" src="https://github.com/user-attachments/assets/f46df31b-96a9-4b8a-a7f2-721515d414de" />
<img width="425" height="439" alt="Screenshot 2026-04-08 at 09 48 25" src="https://github.com/user-attachments/assets/76810137-f79a-40f9-987c-c6d5fa98566e" />

<h6> Pertanyaan


1. <img width="503" height="232" alt="Screenshot 2026-04-08 at 09 51 17" src="https://github.com/user-attachments/assets/caf06ba0-f9de-4df8-a4f6-e8815a0e91f5" />
Sebelumnya: listMhs[j-1].ipk > temp.ipk → ascending (kecil ke besar) <br>
Sekarang: listMhs[j-1].ipk < temp.ipk → descending (besar ke kecil)

## Latihan Praktikum 1
<h6> Kode Dosen02 <br>
<br>
<img width="757" height="431" alt="Screenshot 2026-04-08 at 12 57 47" src="https://github.com/user-attachments/assets/9e2b5e6c-bda7-4d00-981b-92bcd0e91212" />
<h6> Kode DataDosen02 <br>
<br>
<img width="535" height="622" alt="Screenshot 2026-04-08 at 12 59 20" src="https://github.com/user-attachments/assets/305a1293-00c4-4796-85e7-c761baa3736e" />
<img width="535" height="622" alt="Screenshot 2026-04-08 at 12 59 20" src="https://github.com/user-attachments/assets/f9cf6339-8e6a-4d40-b68f-d5c5ea7a5b6a" />
<h6> Kode MainDosen02 <br>
<br>
<img width="632" height="753" alt="Screenshot 2026-04-08 at 13 01 04" src="https://github.com/user-attachments/assets/528024de-6125-4c2e-ac88-f44fc3371c62" />
<img width="611" height="432" alt="Screenshot 2026-04-08 at 13 02 00" src="https://github.com/user-attachments/assets/af0fa4f1-1c98-477a-b34d-df2c9ff365ce" />
<h6> Hasil Runningan <br>
<br>
<img width="313" height="759" alt="Screenshot 2026-04-08 at 13 07 28" src="https://github.com/user-attachments/assets/74189adf-05e2-4b6a-b696-773ab52064bb" />
<img width="265" height="486" alt="Screenshot 2026-04-08 at 13 08 29" src="https://github.com/user-attachments/assets/6578839c-0b88-4543-b330-d9d34a4b9c8f" />
<img width="272" height="468" alt="Screenshot 2026-04-08 at 13 08 58" src="https://github.com/user-attachments/assets/dae81cd2-6b85-44b4-8fd0-b5034d2045ad" />
