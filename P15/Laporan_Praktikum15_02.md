# Laporan Praktikum ASD Jobsheet 15
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode ContohList02 <br>
<br>
<img width="706" height="764" alt="Screenshot 2026-06-16 at 13 31 37" src="https://github.com/user-attachments/assets/e21eff41-2ab8-4120-b3d7-0f6b23d9bc2b" />
<h6> Hasil Runningan <br>
  <br>
<img width="443" height="145" alt="Screenshot 2026-06-16 at 13 32 59" src="https://github.com/user-attachments/assets/e96a5459-a229-4ad7-bc51-b787e5693b57" />

<h6> Pertanyaan

1. Semua jenis data dapat ditampung ke dalam ArrayList karena ArrayList dideklarasikan tanpa generic (List l = new ArrayList();), <br>
   sehingga elemen yang disimpan dianggap bertipe Object. Oleh karena itu, ArrayList dapat menyimpan berbagai jenis data seperti Integer dan String dalam satu list.
2. <img width="617" height="238" alt="image" src="https://github.com/user-attachments/assets/10668c1f-fdc3-4261-9ec9-07dd3dbaf6d6" />
3. <img width="344" height="17" alt="image" src="https://github.com/user-attachments/assets/70bee327-51df-4554-a2e6-0d5a0a9ecf6b" />
4. <img width="639" height="98" alt="image" src="https://github.com/user-attachments/assets/6aa66533-4abd-40be-be03-0e2a262c4a6a" />
5. <img width="440" height="178" alt="image" src="https://github.com/user-attachments/assets/61ab018e-509a-40a6-9797-d5876530e0f4" />
   Elemen 0: Mei-mei total elemen: 6 elemen terakhir: Al-Qarni <br>
   Names: [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni] 

## Percobaan 2
<h6> Kode LoopCollection <br>
<br>
<img width="582" height="797" alt="Screenshot 2026-06-17 at 12 03 34" src="https://github.com/user-attachments/assets/8b2a9375-6919-455e-beb8-5ac5f92e5de0" />
<img width="499" height="94" alt="Screenshot 2026-06-17 at 12 03 47" src="https://github.com/user-attachments/assets/27c91a60-0c18-4600-ad09-07b2d852d23f" />
<h6> Hasil Runningan <br>
<br>
<img width="326" height="136" alt="Screenshot 2026-06-17 at 12 04 02" src="https://github.com/user-attachments/assets/9d8a1da7-2500-4246-9250-240e98f4f813" />

<h6> Pertanyaan

1. `push(e)` | Method milik `Stack`, menambahkan elemen ke **paling atas** stack (akhir list), dan mengembalikan elemen yang ditambahkan. Merupakan operasi LIFO (Last In First Out). <br>
   `add(e)` | Method yang diwarisi dari `Vector`/`List`, menambahkan elemen ke **akhir** list. Perilakunya sama dengan `push()` dalam konteks Stack, namun `add()` mengembalikan `boolean`. <br>
   Dalam praktiknya pada `Stack`, kedua method menambahkan elemen di posisi yang sama (akhir), namun `push()` adalah idiom yang lebih tepat untuk Stack.
2. Setelah blok `while (!fruits.isEmpty())` pada baris 38-40, seluruh elemen stack telah di-`pop()` dan fruits menjadi **kosong**. <br>
   Jika baris 43-44 dihilangkan, maka Iterator (baris 46-49), stream forEach (baris 51-53), dan for-index (baris 55-57) tidak akan menampilkan output apapun karena tidak ada elemen tersisa di dalam `fruits`. <br>
   Program tetap berjalan tanpa error, hanya outputnya kosong.
3. Baris ini mengiterasi seluruh elemen di `fruits` menggunakan **Iterator** secara eksplisit: <br>
   - `fruits.iterator()` → membuat objek Iterator untuk fruits <br>
   - `it.hasNext()` → mengecek apakah masih ada elemen berikutnya <br>
   - `it.next()` → mengambil elemen berikutnya dan menggeser pointer <br>
   Iterator berguna ketika kita perlu melakukan operasi `remove()` saat iterasi berlangsung (untuk menghindari `ConcurrentModificationException`).
4. Yang terjadi: program **masih berjalan**, namun method-method khusus Stack seperti `push()`, `pop()`, `peek()`, `empty()` **tidak bisa diakses** langsung karena interface `List` tidak mendeklarasikan method tersebut. <br>
   Jika dideklarasikan sebagai `List<String> fruits = new ArrayList<>()`, maka baris `fruits.pop()` akan menyebabkan **compile-time error**. <br>
   Ini terjadi karena prinsip polimorfisme — tipe referensi (`List`) menentukan method apa yang bisa dipanggil, bukan tipe objek sebenarnya.
5. <img width="399" height="66" alt="image" src="https://github.com/user-attachments/assets/21b2f31a-4aa2-4a69-a32f-6d9785077f9f" />
6. <img width="192" height="92" alt="image" src="https://github.com/user-attachments/assets/a18ca53d-1412-442f-898f-40ceae817759" />

## Percobaan 3
<h6> Mahasiswa02 <br>
<br>
<img width="743" height="400" alt="Screenshot 2026-06-17 at 12 40 11" src="https://github.com/user-attachments/assets/6fd4f75b-b992-45b4-8b93-0e10197dfc2a" />
<h6> ListMahasiswa02 <br>
<br>
<img width="468" height="657" alt="Screenshot 2026-06-17 at 12 40 26" src="https://github.com/user-attachments/assets/66cf7838-1d57-424d-af66-d4f98f49dd22" />
<img width="951" height="316" alt="Screenshot 2026-06-17 at 12 40 40" src="https://github.com/user-attachments/assets/318a8b4e-4903-4830-97cb-e37901fbf6ae" />
<br> Hasil Runningan <br>
<br>
<img width="435" height="146" alt="Screenshot 2026-06-17 at 12 40 55" src="https://github.com/user-attachments/assets/508a413c-381f-4723-942a-1e3b8a4f8b58" />

<h6> Pertanyaan

1. Fungsi `tambah(Mahasiswa... mahasiswa)` menggunakan konsep **Varargs (Variable Arguments)** atau argumen tak terbatas. <br>
   Tanda `...` setelah tipe parameter menunjukkan bahwa method dapat menerima nol atau lebih argumen bertipe `Mahasiswa`. <br>
   Kelebihan varargs: <br>
   - Fleksibel: pemanggil bisa mengirim 1, 2, 3, atau berapa pun objek tanpa perlu membuat array manual <br>
   - Kode lebih bersih dan ringkas saat pemanggilan: `lm.tambah(m, m1, m2)` vs `lm.tambah(new Mahasiswa[]{m, m1, m2})` <br>
   - Kompatibel dengan passing array biasa sebagai argumen
2. <img width="547" height="148" alt="image" src="https://github.com/user-attachments/assets/5cb24568-4252-4493-988c-4abdff37d242" />
3. <img width="725" height="133" alt="image" src="https://github.com/user-attachments/assets/754330a9-746a-48ab-ab66-c37365d51983" />

## Tugas Praktikum
<h6> Kode Mahasiswa_tugas02 <br>
<br>
<img width="628" height="440" alt="Screenshot 2026-06-17 at 13 21 39" src="https://github.com/user-attachments/assets/e33a6691-e9fb-40fc-a827-a87380f0dfc9" />
<h6> Kode MataKuliah02 <br>
<br>
<img width="598" height="438" alt="Screenshot 2026-06-17 at 13 22 20" src="https://github.com/user-attachments/assets/03e38690-9ddb-4080-b561-f0af60906791" />
<h6> Kode Nilai02 <br>
<br>
<img width="705" height="586" alt="Screenshot 2026-06-17 at 13 22 40" src="https://github.com/user-attachments/assets/b32f97b3-7e53-4697-ab12-5385fd3a3e65" />
<h6> Kode SistemNilai02 <br>
<br>
<img width="923" height="726" alt="Screenshot 2026-06-17 at 13 23 10" src="https://github.com/user-attachments/assets/68b2ecae-859d-4979-a777-4b9726937f7b" />
<img width="702" height="648" alt="Screenshot 2026-06-17 at 13 23 48" src="https://github.com/user-attachments/assets/efb10417-6ea9-41ca-9286-5c2fecdc9310" />
<img width="745" height="638" alt="Screenshot 2026-06-17 at 13 24 26" src="https://github.com/user-attachments/assets/b6f7fa51-e4b4-4c40-8eaa-5d80cd415395" />
<img width="649" height="547" alt="Screenshot 2026-06-17 at 13 24 49" src="https://github.com/user-attachments/assets/ddcff9da-dd58-42ed-9dd6-76f72d487f36" />
<img width="664" height="760" alt="Screenshot 2026-06-17 at 13 25 08" src="https://github.com/user-attachments/assets/af27a647-baca-4d9b-83f2-8d08dd4b0013" />
<img width="834" height="741" alt="Screenshot 2026-06-17 at 13 25 34" src="https://github.com/user-attachments/assets/a1085c17-b698-42e2-8966-69468500a671" />
<img width="538" height="342" alt="Screenshot 2026-06-17 at 13 26 02" src="https://github.com/user-attachments/assets/392b7211-806f-4638-a96b-6882b8799a20" />
<img width="681" height="512" alt="Screenshot 2026-06-17 at 13 26 13" src="https://github.com/user-attachments/assets/94d2cafe-f7cf-44f7-a67d-ce0dc387216e" />
<h6> Hasil Runningan <br>
<br>
<img width="404" height="599" alt="Screenshot 2026-06-17 at 13 26 43" src="https://github.com/user-attachments/assets/a25e55fe-dd7f-47d1-bf18-2e6789b5186c" />
<img width="566" height="773" alt="Screenshot 2026-06-17 at 13 27 20" src="https://github.com/user-attachments/assets/8fe59095-0a03-47b0-8c00-9adc2a151033" />
<img width="576" height="356" alt="Screenshot 2026-06-17 at 13 27 48" src="https://github.com/user-attachments/assets/2867c619-1404-45f8-9e22-926d5ae80681" />
<img width="567" height="342" alt="Screenshot 2026-06-17 at 13 28 20" src="https://github.com/user-attachments/assets/b893d2c0-baf5-414a-8d1e-6fb137f8a519" />
<img width="569" height="340" alt="Screenshot 2026-06-17 at 13 28 47" src="https://github.com/user-attachments/assets/0ca587e6-9748-4fbf-83bf-3fefb06a84e2" />
<img width="571" height="536" alt="Screenshot 2026-06-17 at 13 29 07" src="https://github.com/user-attachments/assets/91b26537-be28-4e8c-96c8-b5504b8c3c9d" />



