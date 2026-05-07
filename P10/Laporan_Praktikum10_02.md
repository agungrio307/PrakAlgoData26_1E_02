# Laporan Praktikum ASD Jobsheet 10
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode queue02 <br>
<br>
<img width="549" height="732" alt="Screenshot 2026-04-29 at 23 03 19" src="https://github.com/user-attachments/assets/0af16ad7-9b2f-4e2c-b0f6-16d4283ab7fa" />
<img width="538" height="435" alt="Screenshot 2026-04-29 at 23 03 40" src="https://github.com/user-attachments/assets/40ab7eef-4d2e-4352-85d5-ec2029cbeda6" />
<img width="486" height="696" alt="Screenshot 2026-04-29 at 23 03 53" src="https://github.com/user-attachments/assets/4feb928c-fa30-4e7c-8c2f-1470f9523983" />
<h6> Kode QueueMain02 <br>
<br>
<img width="704" height="705" alt="Screenshot 2026-04-29 at 23 05 24" src="https://github.com/user-attachments/assets/213f06bb-b58b-4f34-98fa-1b77d4c0f16b" />
<img width="727" height="213" alt="Screenshot 2026-04-29 at 23 05 32" src="https://github.com/user-attachments/assets/2b9f23bb-72ac-4316-8ed4-7defe062484f" />
<h6> Hasil Runningan <br>
<br>
<img width="354" height="597" alt="Screenshot 2026-04-29 at 23 06 11" src="https://github.com/user-attachments/assets/37387490-3307-4ef0-a9e2-fbb6049d9180" />

<h6> Pertanyaan

1. size = 0 <br>
   → Ini menunjukkan jumlah elemen dalam queue = 0 (belum ada data sama sekali). <br>
   front = -1 dan rear = -1 <br>
   → Ini sebagai penanda bahwa queue belum punya posisi elemen (belum ada indeks yang valid).
2. Maksud dari kode tersebut adalah mengembalikan posisi rear ke awal array (index 0) ketika sudah mencapai indeks terakhir. <br>
   Fungsinya: <br>
   - Mencegah error (ArrayIndexOutOfBounds) <br>
   - Membuat queue jadi efisien
3. Maksud dari kode tersebut adalah untuk mengembalikan posisi front ke awal array (index 0) ketika sudah berada di indeks terakhir. <br>
   Fungsinya: <br>
   - Menghindari index keluar dari array <br>
   - Menjaga konsep antrian melingkar <br>
   - Memungkinkan penggunaan ulang slot kosong di depan
4. karena elemen pertama dalam queue belum tentu ada di index 0.
5. Maksud dari kode tersebut adalah menggeser indeks i ke posisi berikutnya secara melingkar (circular).
6. if (IsFull()) { <br>
    System.out.println("Queue sudah penuh"); <br>
   }
7. Modifikasi bagian overflow
   <img width="465" height="87" alt="Screenshot 2026-04-29 at 23 23 32" src="https://github.com/user-attachments/assets/fd1788af-ce5c-499a-a79e-d27c4c2d02b5" />
   Modifikasi bagian underflow
   <img width="474" height="97" alt="Screenshot 2026-04-29 at 23 23 23" src="https://github.com/user-attachments/assets/f26e4d20-28ae-4154-b4d9-7cf88083cb9c" />

## Percobaan 2
<h6> Kode Mahasiswa02 <br>
<br>
<img width="646" height="366" alt="Screenshot 2026-04-29 at 23 56 01" src="https://github.com/user-attachments/assets/0fb1f5d5-be3a-4f61-a099-598a7e36090e" />
<h6> Kode AntrianLayanan02 <br>
<br>
<img width="374" height="609" alt="Screenshot 2026-04-29 at 23 57 17" src="https://github.com/user-attachments/assets/9ab7249b-f020-448d-b9c6-ffa5cb6b406c" />
<img width="699" height="590" alt="Screenshot 2026-04-29 at 23 57 32" src="https://github.com/user-attachments/assets/3b805740-f2cf-419f-bcd5-721036fcfee1" />
<img width="566" height="359" alt="Screenshot 2026-04-29 at 23 57 42" src="https://github.com/user-attachments/assets/c31e6825-00d2-49ea-878b-86c594923f61" />
<h6> Kode LayananAkademikSIAKAD02 <br>
<br>
<img width="649" height="763" alt="Screenshot 2026-04-29 at 23 58 49" src="https://github.com/user-attachments/assets/a4823749-d551-423c-8ec7-1ecbdeac8989" />
<img width="755" height="370" alt="Screenshot 2026-04-29 at 23 59 04" src="https://github.com/user-attachments/assets/c84640a9-a4fe-4a6a-88cd-86d48f7ac99c" />
<h6> Hasil Runningan <br>
<br>
<img width="289" height="646" alt="Screenshot 2026-04-29 at 23 59 59" src="https://github.com/user-attachments/assets/063dfae9-0007-42a6-aec9-de2e4ad02953" />
<img width="344" height="597" alt="Screenshot 2026-04-30 at 00 00 12" src="https://github.com/user-attachments/assets/9c8bb275-f94c-4464-97a7-31e3c6d5aa19" />

<h6> Pertanyaan

1. Modifikasi pada class AntrianLayanan02
   <img width="539" height="174" alt="Screenshot 2026-04-30 at 00 02 04" src="https://github.com/user-attachments/assets/418c218f-449c-4a64-9dcb-de7fd77cbaa3" />
   Modifikasi pada Class LayananAkademikSIAKAD02
   <img width="631" height="336" alt="Screenshot 2026-04-30 at 00 03 16" src="https://github.com/user-attachments/assets/9e6c219e-cbf4-47e3-8988-a0c35a8989e5" />
   <img width="755" height="318" alt="Screenshot 2026-04-30 at 00 04 16" src="https://github.com/user-attachments/assets/1af3e87a-db37-44a5-9b18-fc76b8461c44" />

## Tugas Praktikum 1
<h6> Kode Mahasiswa02 <br>
<br>
<img width="646" height="366" alt="Screenshot 2026-04-29 at 23 56 01" src="https://github.com/user-attachments/assets/8857ed32-d2dc-477c-8a15-1b240770875c" />
<h6> Kode AntrianKRS02 <br>
<br>
<img width="481" height="762" alt="Screenshot 2026-04-30 at 08 38 42" src="https://github.com/user-attachments/assets/b73e453f-3bb6-427c-9cd9-e3f02d16f620" />
<img width="549" height="712" alt="Screenshot 2026-04-30 at 08 38 59" src="https://github.com/user-attachments/assets/eabffbb7-cf2e-47f8-baaf-b2cdd7102436" />
<img width="651" height="399" alt="Screenshot 2026-04-30 at 08 39 25" src="https://github.com/user-attachments/assets/bfb11e81-0378-4b49-bab5-55bde37d4e8b" />
<h6> KodeMainKRS02 <br>
<br>
<img width="629" height="764" alt="Screenshot 2026-04-30 at 08 39 40" src="https://github.com/user-attachments/assets/1c13bc67-18cf-4b19-a7f3-28d88ffb514a" />
<img width="422" height="657" alt="Screenshot 2026-04-30 at 08 39 56" src="https://github.com/user-attachments/assets/5bf72e5e-ed90-44d7-af7c-b9f9a4f5a6d2" />
<h6> Hasil Runningan <br>
<br>
<img width="188" height="576" alt="Screenshot 2026-04-30 at 08 41 49" src="https://github.com/user-attachments/assets/dcb3fa97-64ca-44e2-b914-bf6e41ec684d" />
<img width="211" height="506" alt="Screenshot 2026-04-30 at 08 42 10" src="https://github.com/user-attachments/assets/29663732-54a4-4a3f-8d55-c205953cfa94" />
<img width="234" height="671" alt="Screenshot 2026-04-30 at 08 42 24" src="https://github.com/user-attachments/assets/c84c189b-eace-44f8-8909-f166d3c125ca" />
<img width="191" height="610" alt="Screenshot 2026-04-30 at 08 42 38" src="https://github.com/user-attachments/assets/92c2c89b-db47-442e-a42c-9f3617b53049" />
<img width="187" height="593" alt="Screenshot 2026-04-30 at 08 42 51" src="https://github.com/user-attachments/assets/60501992-8bfd-4209-9fbf-3331c97dc894" />
