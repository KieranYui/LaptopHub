# LaptopHub

Program Java berbasis teks (CLI) untuk simulasi pelayanan dan transaksi penjualan di toko laptop. Semua menu, input, dan struk berjalan di terminal tanpa GUI.

Dibuat untuk tugas kuliah TBP semester 1.

## Fitur

Ada empat menu utama yang bisa dipilih berulang kali sampai pengguna menyatakan keluar.

| Menu | Isi |
|---|---|
| 1. Pembelian Laptop | Pilih unit laptop, jumlah, data pembeli, metode bayar, lalu cetak struk |
| 2. Pembelian Sparepart | Tambah RAM atau SSD berkali-kali, lalu cetak struk gabungan |
| 3. Servis Laptop | Daftarkan sampai 15 unit laptop, hitung estimasi biaya, cetak bukti penerimaan |
| 4. Pembelian Aksesoris | Beli beberapa macam aksesoris sekaligus, hitung total dan kembalian |

## Daftar Harga

### Laptop

| No | Produk | Harga | Stok |
|---|---|---|---|
| 1 | ASUS ROG STRIX G15 | Rp 15.000.000 | 5 |
| 2 | LOQ 15 IRX10 | Rp 23.000.000 | 8 |
| 3 | ACER NITRO LITE 15 | Rp 14.200.000 | 4 |

### Sparepart

RAM:

| Kapasitas | Harga |
|---|---|
| 8GB | Rp 1.500.000 |
| 16GB | Rp 2.600.000 |
| 32GB | Rp 6.100.000 |

SSD:

| Kapasitas | Harga |
|---|---|
| 256GB | Rp 900.000 |
| 512GB | Rp 1.800.000 |
| 1TB | Rp 2.200.000 |

### Servis

| Jenis | Tarif per hari | Lama pengerjaan | Biaya part |
|---|---|---|---|
| Ringan | Rp 40.000 | 3 hari | Rp 0 |
| Sedang | Rp 50.000 | 7 hari | Rp 1.000.000 |
| Berat | Rp 60.000 | 14 hari | Rp 2.000.000 |

Estimasi biaya dihitung dengan rumus `(tarif x lama hari) + biaya part`.

### Aksesoris

| No | Produk | Harga |
|---|---|---|
| 1 | Mouse Wireless Logitech M220 | Rp 175.000 |
| 2 | Keyboard Mechanical | Rp 350.000 |
| 3 | Headset Gaming | Rp 250.000 |
| 4 | Cooling Pad Gaming | Rp 120.000 |

## Cara Menjalankan

Butuh JDK. Sudah diuji dengan JDK 22, tapi kode ini tidak memakai fitur baru jadi JDK 17 ke atas aman.

Kelas ini memakai `package TBP`, tapi nama folder repo tidak harus `TBP`. Cukup arahkan hasil kompilasi ke folder `TBP` dengan opsi `-d .`, lalu jalankan dari folder repo.

```bash
git clone https://github.com/KieranYui/sistem-penjualan-laptop.git
cd sistem-penjualan-laptop

javac -d . Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop.java
java -cp . TBP.Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop
```

Opsi `-d .` membuat `javac` menyimpan `.class` ke `TBP/`, mengikuti nama package di dalam berkas sumber. Tanpa opsi itu, `javac` menaruh `.class` di folder saat ini dan `java` gagal menemukan kelas `TBP.Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop`.

Kalau `javac` tidak ada di PATH, pakai path lengkap JDK-nya:

```bash
/path/ke/jdk/bin/javac -d . Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop.java
/path/ke/jdk/bin/java -cp . TBP.Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop
```

Pengguna NetBeans cukup membuka project lalu tekan Run, karena kelas ini sudah punya `main`.

## Struktur Berkas

```
sistem-penjualan-laptop/
├── README.md
├── .gitignore
└── Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop.java
```

Setelah dikompilasi, `javac -d .` menambahkan folder `TBP/` berisi berkas `.class`. Folder itu diabaikan Git lewat `.gitignore`.

Seluruh logika ada di satu berkas: input, validasi, perhitungan, dan tampilan struk.

## Alur Program

1. Program masuk ke perulangan utama dan menampilkan menu 1 sampai 4.
2. Angka pilihan dibaca, lalu `switch` mengarahkan ke menu yang sesuai.
3. Setiap menu membaca input, menghitung total, dan mencetak struk.
4. Setiap menu menanyakan `Apakah Anda Ingin keluar? [Ya / Tidak]`.
5. Perulangan berhenti kalau jawabannya bukan `Tidak`, lalu menampilkan `SELESAI!!!`.

## Catatan Teknis

- Input dibaca lewat `BufferedReader` dan `InputStreamReader`, bukan `Scanner`.
- Data unit servis disimpan di array paralel dengan kapasitas 15 unit: `unitMerk`, `unitSerial`, `unitKeluhan`, `unitJenis`, `unitBiaya`, `unitHari`.
- Menu servis memvalidasi jumlah unit, nama, telepon, keluhan, dan jenis servis. Input kosong atau jenis servis yang tidak dikenal akan ditanya ulang.
- Nomor servis dibuat dari rumus `10000 + ((nomorTransaksi * 7919) % 90000)` lalu diberi awalan `LPH-`.
- Semua kesalahan input yang tidak tertangani ditangkap satu blok `try-catch` di `main`, lalu program menampilkan `Data yang diinput SALAH!!` dan berhenti.

## Author

Lihat komentar `@author` di dalam berkas sumber.
