# Laporan Praktikum ASD Jobsheet 12
  <h4> Nama: Agung Satrio Gusti
  <h4> NIM: 254107020228
  <h4> Kelas: TI-1E

## Percobaan 1
<h6> Kode Mahasiswa02 <br>
<br>
<img width="620" height="427" alt="Screenshot 2026-05-16 at 13 36 46" src="https://github.com/user-attachments/assets/38267239-a025-4a46-91ba-645c7e2383e4" />
<h6> Kode Node02 <br>
<br>
<img width="419" height="264" alt="Screenshot 2026-05-16 at 13 37 02" src="https://github.com/user-attachments/assets/1aa8ee29-70ff-4176-9a6b-b950b12eed70" />
<h6> Kode DoubleLinkedList02 <br>
<br>
<img width="508" height="702" alt="Screenshot 2026-05-16 at 13 37 18" src="https://github.com/user-attachments/assets/bb38a1e6-97d5-4bfe-b132-deb609c4f49e" />
<img width="672" height="757" alt="Screenshot 2026-05-16 at 13 37 52" src="https://github.com/user-attachments/assets/5b3d4f0b-9da2-41cd-9e33-ff57fd42b2cc" />
<img width="547" height="542" alt="Screenshot 2026-05-16 at 13 38 16" src="https://github.com/user-attachments/assets/8b5c39b2-2291-4c48-abaf-b4d43a2dd1fe" />
<h6> Kode DoubleLinkedListMain02 <br>
<br>
<img width="638" height="796" alt="Screenshot 2026-05-16 at 13 38 46" src="https://github.com/user-attachments/assets/14051a3a-64b2-49ae-b69b-21ed8e625333" />
<img width="587" height="611" alt="Screenshot 2026-05-16 at 13 39 03" src="https://github.com/user-attachments/assets/2370d09a-d59f-4030-8b8e-d1f72e92b25e" />
<h6> Hasil Runningan <br>
<br>
<img width="344" height="758" alt="Screenshot 2026-05-16 at 13 39 14" src="https://github.com/user-attachments/assets/91d17c81-19e8-4b40-8904-6d90c7f19005" />
<img width="348" height="163" alt="Screenshot 2026-05-16 at 13 39 41" src="https://github.com/user-attachments/assets/c280fee2-7eb6-4ed1-9b5d-a1c6bd74a71f" />

<h6> Pertanyaan 

1. Single Linked List lebih sederhana dan hemat memori karena hanya memiliki satu pointer. <br>
   Double Linked List lebih fleksibel dalam traversal dan manipulasi data karena memiliki pointer ke node sebelumnya dan berikutnya, tetapi membutuhkan memori lebih banyak.
2. next → menghubungkan node ke node berikutnya dan digunakan untuk traversal maju. <br>
   prev → menghubungkan node ke node sebelumnya dan digunakan untuk traversal mundur.
3. Konstruktor pada DoubleLinkedList02 berfungsi untuk: <br>
   → menginisialisasi linked list dalam keadaan kosong, <br>
   → mengatur nilai awal head dan tail menjadi null, <br>
   → serta menyiapkan struktur linked list sebelum dilakukan operasi penambahan, penghapusan, atau traversal node.
4. head dan tail harus menunjuk node yang sama saat linked list kosong karena node pertama yang ditambahkan merupakan: <br>
   → awal linked list, <br>
   → sekaligus akhir linked list.
5. <img width="528" height="255" alt="image" src="https://github.com/user-attachments/assets/0a7427e6-3aa4-4a84-a672-c1a34c814bff" />
6. <img width="518" height="230" alt="image" src="https://github.com/user-attachments/assets/6de7bfd0-fc14-435d-9ad0-2df02432b9f0" />

## Percobaan 2
<h6> Modifikasi kode DoubleLinkedList02 <br>
<h6> Menambahkan method removeFirst() <br>
  <br>
<img width="483" height="366" alt="Screenshot 2026-05-16 at 14 43 38" src="https://github.com/user-attachments/assets/16a5ff1f-f2e4-42b7-a19b-6c155e186f47" />
<h6> Menambahkan method removeLast() <br>
<br>
<img width="484" height="352" alt="Screenshot 2026-05-16 at 14 43 49" src="https://github.com/user-attachments/assets/e8e7383f-4165-441a-adc7-0643116fe340" />
<h6> Hasil Runningan <br>
<br>
<img width="308" height="459" alt="Screenshot 2026-05-16 at 14 43 04" src="https://github.com/user-attachments/assets/97fa7a72-7f45-4b90-baaa-6afae270ad86" />
<img width="355" height="166" alt="Screenshot 2026-05-16 at 14 43 14" src="https://github.com/user-attachments/assets/16894083-da5d-4189-85c1-141c0ed7cc6f" />

<h6> Pertanyaan 

1. head = head.next; → memindahkan head ke node kedua (menghapus akses ke node pertama) <br>
   head.prev = null; → memastikan node baru head benar-benar menjadi awal list
2. method removeFirst() <br>
   <img width="483" height="366" alt="Screenshot 2026-05-16 at 14 43 38" src="https://github.com/user-attachments/assets/1a3ac82d-8222-40f5-8db8-025efe50bd26" />
   method removeLast() <br>
   <img width="484" height="352" alt="Screenshot 2026-05-16 at 14 43 49" src="https://github.com/user-attachments/assets/7da8f0f5-b1c6-4c75-9f42-a203d5656cae" />

## Tugas Praktikum
<h6> Kode DoubleLinkedList02 <br>
<br>
<img width="777" height="784" alt="Screenshot 2026-05-16 at 15 23 08" src="https://github.com/user-attachments/assets/956666be-6af7-4d4d-9fe2-3a16018ad175" />
<img width="783" height="477" alt="Screenshot 2026-05-16 at 15 23 31" src="https://github.com/user-attachments/assets/b3b0074f-6840-4202-adb6-6fb170f9780b" />
<img width="658" height="746" alt="Screenshot 2026-05-16 at 15 23 55" src="https://github.com/user-attachments/assets/23a68188-13d3-4ed6-8610-0dce4e2e8412" />
<img width="533" height="441" alt="Screenshot 2026-05-16 at 15 24 25" src="https://github.com/user-attachments/assets/338a1ae1-60f3-4979-81f8-143aead00000" />
<img width="694" height="601" alt="Screenshot 2026-05-16 at 15 24 46" src="https://github.com/user-attachments/assets/11dbe8da-a738-4138-aed7-5a454802e368" />
<img width="710" height="744" alt="Screenshot 2026-05-16 at 15 25 09" src="https://github.com/user-attachments/assets/03b08dcc-c7d1-4dc6-9b22-f67c61a41d04" />
<img width="747" height="745" alt="Screenshot 2026-05-16 at 15 25 28" src="https://github.com/user-attachments/assets/0aa59071-c07f-4476-b465-af37208d3c8f" />
<img width="635" height="763" alt="Screenshot 2026-05-16 at 15 26 05" src="https://github.com/user-attachments/assets/6718e3c8-ea0b-4803-8f46-f4c61f648a37" />
<h6> Kode DoubleLinkedListMain02 <br>
<br>
<img width="636" height="817" alt="Screenshot 2026-05-16 at 16 16 43" src="https://github.com/user-attachments/assets/dbbdb5a6-3922-4964-bce5-7abaa346f4e8" />
<img width="586" height="716" alt="Screenshot 2026-05-16 at 16 16 58" src="https://github.com/user-attachments/assets/30fcb0b5-962d-4533-ba7e-c58e042d0d27" />
<img width="612" height="629" alt="Screenshot 2026-05-16 at 16 17 16" src="https://github.com/user-attachments/assets/65541104-2a40-4fa0-8662-4aa8e7dc4f4c" />
<h6> Hasil Runningan <br>
<br>
<img width="332" height="670" alt="Screenshot 2026-05-16 at 16 17 23" src="https://github.com/user-attachments/assets/de01b1e6-1c90-447f-a2f6-444d81d74992" />
<img width="329" height="555" alt="Screenshot 2026-05-16 at 16 17 49" src="https://github.com/user-attachments/assets/6f21966a-6275-40ba-beb2-c03ac452d4bd" />
<img width="316" height="585" alt="Screenshot 2026-05-16 at 16 18 06" src="https://github.com/user-attachments/assets/6aeb9043-5b95-4795-a383-3d1db8c960bd" />
<img width="313" height="623" alt="Screenshot 2026-05-16 at 16 18 23" src="https://github.com/user-attachments/assets/2e7c6943-be2f-4949-bd09-af5780b068aa" />
<img width="322" height="614" alt="Screenshot 2026-05-16 at 16 18 38" src="https://github.com/user-attachments/assets/0db5a89e-7a30-4065-9008-0104e401c1a3" />
<img width="348" height="262" alt="Screenshot 2026-05-16 at 16 18 48" src="https://github.com/user-attachments/assets/d55ebb4d-9481-44f8-8fd9-67d2b01fd2eb" />

