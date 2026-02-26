# Laporan Praktikum ASD Jobsheet 3
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode Mahasiswa02 <br>
  <br>
<img width="374" height="188" alt="image" src="https://github.com/user-attachments/assets/4a075b4e-221b-4684-b94d-5b6d26e3352f" />
  
<h6> Kode MahasiswaDemo02 <br>
<br>
<img width="545" height="464" alt="image" src="https://github.com/user-attachments/assets/ff27ade0-66ef-4c21-8d8e-eba5c0497b6f" />
<img width="616" height="356" alt="image" src="https://github.com/user-attachments/assets/ca4522d0-e624-415d-9a3a-f050f0639d49" />

<h6> Hasil Runningan <br>
<br>
<img width="341" height="344" alt="image" src="https://github.com/user-attachments/assets/832f3d44-7bbf-404d-91ba-d2962a1953a1" />

<h6> Pertanyaan 

1. Tidak, class yang akan dibuat array of object tidak harus selalu memiliki atribut dan sekaligus method. <br>
   Class adalah blueprint untuk membuat objek, jadi class cukup memiliki struktur saja agar bisa dibuat objek, meskipun: <br>
   -> Hanya punya atribut <br>
   -> Hanya punya method <br>
   -> Bahkan kosong pun tetap bisa dibuat objek
2. Kode itu membuat sebuah array yang dapat menampung 3 object bertipe Mahasiswa02. <br>
   -> Mahasiswa02[] <br>
       Artinya kita mendeklarasikan array yang berisi object Mahasiswa02. <br>
   -> arrayOfMahasiswa <br>
       Nama variabel array-nya. <br>
   -> new Mahasiswa02[3] <br>
       Artinya => Membuat array dengan 3 slot
3. Class Mahasiswa02 tidak memiliki konstruktor yang dituliskan secara eksplisit. Namun, Java secara otomatis menyediakan default constructor (konstruktor tanpa parameter). Oleh karena itu, pemanggilan new Mahasiswa02() tetap dapat dilakukan meskipun konstruktor tidak didefinisikan secara manual.
4. -> arrayOfMahasiswa[0] = new Mahasiswa02(); <br>
       Baris ini: - Membuat object baru dari class Mahasiswa02 <br>
                  - Menyimpannya ke dalam index ke-0 dari array arrayOfMahasiswa <br>
   -> Mengisi atribut object <br>
       Digunakan untuk: - Mengisi nilai atribut nim <br>
                        - Mengisi nilai atribut nama <br>
                        - Mengisi nilai atribut kelas <br>
                        - Mengisi nilai atribut ipk 
5. Class Mahasiswa02 dan MahasiswaDemo02 dipisahkan karena memiliki tugas dan fungsi yang berbeda dalam konsep OOP (Object Oriented Programming). <br>
    -> Class Mahasiswa02 berfungsi sebagai model / blueprint. <br>
    -> Class MahasiswaDemo02 berfungsi sebagai class eksekusi (driver class).

## Percobaan 2
<h6> Kode MahasiswaDemo02 Modifikasi <br>
  <br>
<img width="645" height="516" alt="image" src="https://github.com/user-attachments/assets/f8dcd8ca-ab9b-4949-b016-3585769bde31" />
<img width="646" height="224" alt="image" src="https://github.com/user-attachments/assets/6988f0cd-c80d-4c7e-a2c5-749278022f1d" />
<h6> Hasil Runningan <br>
<br>
<img width="346" height="604" alt="image" src="https://github.com/user-attachments/assets/d54bb1bb-c1d1-4118-ad5d-e8ecf86c533b" />
<img width="347" height="131" alt="image" src="https://github.com/user-attachments/assets/b191170c-81ea-4ea4-9e94-9740f378c514" />

<h6> Pertanyaan 

1. <h6> Kode Mahasiswa02 Modifikasi CetakInfo <br>
  <br>
   <img width="612" height="331" alt="image" src="https://github.com/user-attachments/assets/9a5414da-8bc2-45a0-88b2-d1aa3e26e4d7" />
   <h6> Kode MahasiswaDemo02 Modifikasi KodeProgam <br>
  <br>
   <img width="652" height="633" alt="image" src="https://github.com/user-attachments/assets/706e1e37-9b5f-4c48-96fb-283eb471f65a" />
2. Karena kode tersebut menyebabkan error karena array of object hanya membuat tempat penyimpanan (array), sedangkan object di dalamnya masih bernilai null. Jika atribut langsung diakses tanpa menginisialisasi object dengan new, maka akan terjadi NullPointerException.

## Percobaan 3
<h6> Kode Matakuliah02 <br>
  <br>
<img width="663" height="317" alt="image" src="https://github.com/user-attachments/assets/7b657478-6200-42fc-925c-4ff889e4e9f8" />
<h6> Kode Matakuliah02 <br>
  <br>
<img width="698" height="541" alt="image" src="https://github.com/user-attachments/assets/88f81960-41eb-491a-bb07-1c8039e5b452" />
<img width="702" height="229" alt="image" src="https://github.com/user-attachments/assets/c9907181-3a41-4769-aa82-f9d9c6deee46" />
<h6> Hasil Runningan <br>
<br>
<img width="318" height="388" alt="image" src="https://github.com/user-attachments/assets/1f4fc4a2-e6e0-47d6-9150-028faa27f9a4" />
<img width="350" height="325" alt="image" src="https://github.com/user-attachments/assets/09b9d274-29f9-495a-8dfa-c18236095f07" />

<h6> Pertanyaan

1. Ya, suatu class bisa memiliki lebih dari 1 constructor. <br>
   <h6> contoh constructor lengkap <br>
   <img width="631" height="130" alt="image" src="https://github.com/user-attachments/assets/a149afcd-152e-4889-a96c-b118df6aab81" />
   <h6> contoh constructor tanpa jumlahJam <br>
   <img width="486" height="132" alt="image" src="https://github.com/user-attachments/assets/bc2fe899-c9e5-465f-89a3-0f70e37f315b" />
   <h6> contoh constructor tanpa parameter <br>
   <img width="267" height="151" alt="image" src="https://github.com/user-attachments/assets/bd50e760-5503-4d95-a2e9-aa377fea8427" />

