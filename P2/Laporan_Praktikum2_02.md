# Laporan Praktikum ASD Jobsheet 2
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E
    
## Percobaan 1
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/ba51c711-bc41-4b7e-9d36-026a3d529cb6" />
  <h6> Pertanyaan 
    
  1. Dua karakteristik utama Class atau Objek adalah Atribut dan Method.
  2. Atribut yang dimiliki oleh Class Mahasiswa_02 ada 4 <br>
     Atribut meliputi -> nama, nim, kelas, ipk
  3. Method yang dimiliki oleh Class Mahasiswa_02 ada 4 <br>
     Method meliputi -> tampilkanInformasi(), ubahLelas(), UpdateIPK(), nilaiKinerja()
  4.  <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/09f5717b-8af6-4063-846e-6ad5cc51d441" />
  5. Cara kerja method nilaiKerja() adalah <br>
       -> Membaca nilai ipk yang dimiliki objek <br>
       -> Membandingkan nilai tersebut dengan beberapa kriteria menggunakan percabangan <br>
       -> return sebuah String yang berisi kategori kinerja mahasiswa. <br>
     Kriteria yang digunakan adalah percabangan dieksekusi dari atas ke bawah. Jika satu kondisi terpenuhi, maka kondisi berikutnya tidak akan diperiksa. <br>
     Method ini me-return sebuah nilai bertipe String <br>
       -> "Kinerja sangat baik" <br>
       -> "Kinerja baik" <br>
       -> "Kinerja cukup" <br>
       -> "Kinerja kurang"

## Percobaan 2
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/8133434e-1a87-4ad4-b01c-357a5cb5231d" />
  <h6> Pertanyaan

  1. Baris yang berhubungan dengan konstruktor adalah -> Mahasiswa_02 mhs1 = new Mahasiswa_02() <br>
     new Mahasiswa_02() menunjukkan pemanggilan konstruktor tanpa parameter (konstruktor default).
  2. Untuk mengakses atribut, kita pakai tanda titik (.) setelah nama objek, <br>
     dan untuk mengakses method, kita juga gunakan tanda titik (.) setelah nama objek.
  3. Perbedaan output terjadi karena method tampilkanInformasi() selalu membaca nilai atribut saat itu, jika atribut objek diubah antara dua pemanggilan, hasil output juga akan berbeda.

## Percobaan 3
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/6dd0e940-f774-4e43-bd77-463d2c7ca097" />
  <h6> Pertanyaan

  1. Baris kode yang digunakan untuk mendeklarasikan konstruktor berparameter adalah -> public Mahasiswa_02 (String nm, String nim, String kls, double ipk).
  2. Yang dilakukan pada baris progam tersebut adalah Membuat sebuah objek Mahasiswa menggunakan konstruktor berparameter, lalu menyimpannya ke dalam variabel mhs2.
  3. Jika kostruktor default dihapus, maka progam akan error saat compile karena tidak ada konstruktor yang sesuai dengan parameter kosong
     <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/dc52cd52-0829-428e-a540-39c954cdb444" />
  4. Tidak, method di dalam Mahasiswa_02 tidak harus diakses secara berurutan, yang penting adalah state objek saat method dipanggil, karena method akan menggunakan nilai atribut yang ada pada saat itu.
  5. <img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/031ab34c-6536-4ac4-ac31-6059424cacd3" />

## Latihan Praktikum


      


  
