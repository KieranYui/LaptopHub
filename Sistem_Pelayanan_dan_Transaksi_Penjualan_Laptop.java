/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TBP;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Sistem_Pelayanan_dan_Transaksi_Penjualan_Laptop {
    public static void main(String[] args){
        try{
            BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
            
            // Tipe data untuk case 1
            int pilihan,pilihanLaptop,jumlah1,harga1,total1,uang1,kembalian1;
            String keluar = "",nama,telepon1,metodeBayar;
            String namaLaptop = "";
            
            //Tipe data untuk case 2
            String[] Menu2 = {"RAM", "SSD"};
            String[] struk2 = new String[100];
            int jumlahBarang = 0;
            int totalPembayaran = 0;
            String jawab2;
            
            //Tipe data untuk case 3
            int kapasitas = 15;
            int jumlahUnit = 0;
            int nomorTransaksi = 1;
            int jumlah3 = 0;
            
            //Tipe data case 4
            String telepon4,nama4;
            int aksesoris4,kembalian4,tb = 0,uang;
            String metode4;
            
            
            do{
            
            System.out.println("        SELAMAT DATANG DI LAPTOPHUB      ");
            System.out.println("=========================================");
            System.out.println("|1. Pembelian Laptop                    |");
            System.out.println("|2. Pembelian Sparepart                 |");
            System.out.println("|3. Servis Laptop                       |");
            System.out.println("|4. Pembelian Aksesoris                 |");
            System.out.println("=========================================");
            System.out.print("Masukkan Pilihan Menu [1 s/d 4] : ");
            
            pilihan = Integer.parseInt(input.readLine());
            System.out.println();
            
            switch(pilihan)
            {
                case 1 :
                    System.out.println("=================================");
                    System.out.println("       MENU PEMBELIAN LAPTOP     ");
                    System.out.println("=================================");  
                    System.out.println("Daftar Laptop Tersedia: ");
                    System.out.println("1. ASUS  ROG STRIX G15 - Rp 15.000.000 (Stok: 5) ");
                    System.out.println("2. LOQ 15 IRX10        - Rp 23.000.000 (Stok: 8) ");
                    System.out.println("3. ACER NITRO LITE 15  - Rp 14.200.000 (Stok: 4) ");
                    System.out.println();
                    
                    System.out.print("Pilih nomor laptop yang ingin dibeli (1 s/d 3) : ");
                    pilihanLaptop = Integer.parseInt(input.readLine());
                    
                    
                    switch(pilihanLaptop){
                        case 1 :
                            namaLaptop = "ASUS ROG STRIX G15";
                            harga1 = 15000000;
                            break;
                            
                        case 2 :
                            namaLaptop = "LOQ 15 IRX10";
                            harga1 = 23000000;
                            break;
                            
                        case 3 :
                            namaLaptop = "ACER NITRO LITE 15";
                            harga1 = 14200000;
                            break;
                            
                        default:
                            namaLaptop = "";
                            harga1 = 0;
                            System.out.println("Pilihan Laptop Tidak Tersedia!");
                            break;
                    }
                    
                    if (harga1 !=0){
                    System.out.print("Masukkan jumlah unit yang ingin dibeli: ");
                    jumlah1 = Integer.parseInt(input.readLine());
                    
                    total1 = harga1 * jumlah1;
                    
                    System.out.println();
                    System.out.println("--- DATA PEMBELI ---");
                    
                    System.out.print("Masukkan Nama Lengkap : ");
                    nama = input.readLine();
                    
                    System.out.print("Masukkan Nomor Telepon : ");
                    telepon1 = input.readLine();
                    
                    System.out.print("Uang dibayar : Rp ");
                    uang1 = Integer.parseInt(input.readLine());
                    
                    kembalian1 = uang1 - total1;
                    System.out.print  ("Metode Pembayaran : ");
                    metodeBayar = input.readLine();
                    
                    System.out.println();
                    System.out.println("============================================");
                    System.out.println("-----------------------------------------");
                    System.out.println("            STRUK PEMBELIAN              ");
                    System.out.println("-----------------------------------------");
                    System.out.println("Nama Pembeli : " + nama);
                    System.out.println("No. Telepon  : " + telepon1);
                    System.out.println("Laptop Yang Dipilih : " + namaLaptop);
                    System.out.println("Harga Satuan : Rp "+ harga1);
                    System.out.println("Jumlah Beli  : " + jumlah1 + " Unit");
                    System.out.println("-----------------------------------------");
                    System.out.println("Total Harga : Rp " + total1);
                    System.out.println("Metode Pembayaran : " + metodeBayar);                   
                    System.out.println("Uang Dibayar : Rp " + uang1);
                    System.out.println("Uang Kembalian : Rp " + kembalian1);
                    System.out.println("-----------------------------------------");
                    System.out.println("Terima Kasih telah berbelanja di LaptopHub!");
                    System.out.println("============================================");
                    
                    System.out.println();
                    System.out.println("Apakah Anda Ingin keluar? [Ya / Tidak]");
                    keluar = input.readLine();
                    break;
                    }
                    break;
                    
                case 2 :
                    do{
                    System.out.println("=== MENU PERANGKAT KOMPUTER ===");

                    for (int i=0;i<2;i++){
                    System.out.println((i+1)+". "+Menu2[i]);
                    }
                    System.out.print("Pilih menu perangkat 1/2: ");
                    int pilih = Integer.parseInt(input.readLine());

                    switch (pilih){
                        case 1:
                            int totalharga = 0;
                            String tambahRAM;

                            do{
                                System.out.println("= Pilihan RAM =");
                                System.out.println("1. 8GB");
                                System.out.println("2. 16GB");
                                System.out.println("3. 32GB");
                                System.out.print("Pilih kapasitas RAM 1/3: ");

                                int pilihRAM = Integer.parseInt(input.readLine());
                                int harga = 0;
                                String namaRAM = "";

                                switch (pilihRAM){
                                    case 1:
                                        namaRAM = "RAM 8GB";
                                        harga= 1500000;
                                        break;
                                    case 2:
                                        namaRAM= "RAM 16GB";
                                        harga = 2600000;
                                        break;
                                    case 3:
                                        namaRAM = "RAM 32GB";
                                        harga = 6100000;
                                        break;
                                    default:
                                        System.out.println("Kapasitas Belum Tersedia");
                                }
                                if (harga>0) {
                                totalharga = totalharga+harga;
                                totalPembayaran = totalPembayaran+harga;

                                if (jumlahBarang<100) {
                                    struk2[jumlahBarang] = namaRAM+" : Rp. "+harga;
                                    jumlahBarang++;
                                }
                                System.out.println("Menambahkan "+namaRAM+" (Rp. " + harga + ")");
                                System.out.println("Subtotal sementara: Rp. " + totalharga);
                                }
                                System.out.print("Apakah ingin menambah RAM lagi? [Ya/Tidak]: ");
                                tambahRAM = input.readLine();
                                } 
                                while (tambahRAM.equalsIgnoreCase("Ya"));
                                System.out.println("TOTAL KESELURUHAN PEMBAYARAN RAM: Rp. "+ totalharga);
                                break;

                        case 2:
                            int totalhargaSSD = 0;
                            String tambahSSD;

                            do{
                                System.out.println("= Pilihan SSD =");
                                System.out.println("1. 256GB");
                                System.out.println("2. 512GB");
                                System.out.println("3. 1TB");
                                System.out.print("Pilih kapasitas SSD 1/3: ");

                                int pilihSSD = Integer.parseInt(input.readLine());
                                int hargaSSD = 0;
                                String namaSSD = "";

                                switch (pilihSSD) {
                                    case 1:
                                        namaSSD = "SSD 256GB";
                                        hargaSSD = 900000;
                                        break;
                                    case 2:
                                        namaSSD = "SSD 512GB";
                                        hargaSSD = 1800000;
                                        break;
                                    case 3:
                                        namaSSD = "SSD 1TB";
                                        hargaSSD = 2200000;
                                        break;
                                    default:
                                        System.out.println("Kapasitas Belum Tersedia");
                                }
                                if (hargaSSD>0){
                                    totalhargaSSD = totalhargaSSD+hargaSSD;
                                    totalPembayaran = totalPembayaran+hargaSSD;

                                    if (jumlahBarang<100){
                                        struk2[jumlahBarang] =namaSSD+" : Rp. "+hargaSSD;
                                        jumlahBarang++;
                                    }
                                    System.out.println("Menambahkan "+namaSSD+" (Rp. "+hargaSSD+")");
                                    System.out.println("Subtotal sementara: Rp. "+totalhargaSSD);
                                }
                                System.out.print("Apakah ingin menambah SSD lagi? [Ya/Tidak]: ");
                                tambahSSD = input.readLine();
                                }
                                while (tambahSSD.equalsIgnoreCase("Ya"));

                                System.out.println("TOTAL KESELURUHAN PEMBAYARAN SSD: Rp. "+totalhargaSSD);
                                break;
                                }
                            System.out.print("Apakah ingin memilih yang lain? [Ya/Tidak]: ");
                            jawab2 =input.readLine();
                            }
                            while (jawab2.equalsIgnoreCase("Ya"));
        
                            System.out.print("Masukkan nama pembeli: ");
                            String namaPembeli =input.readLine();
                            System.out.print("Masukkan nomor HP: ");
                            String nomorHP =input.readLine();

                             System.out.println("============= STRUK BELANJA ==============");
                            System.out.println("Nama Pembeli: "+namaPembeli);
                            System.out.println("Nomor HP: "+nomorHP);

                            for (int i=0;i<jumlahBarang;i++) {
                            System.out.println(struk2[i]);
                            }
                            System.out.println("TOTAL PEMBAYARAN: Rp. "+totalPembayaran);
                            System.out.println("Terima Kasih Sudah Berbelanja di LaptopHUB");
                            System.out.println("==========================================");
                            
                            System.out.println();
                            System.out.println("Apakah Anda Ingin keluar? [Ya / Tidak]");
                            keluar = input.readLine();
                            break;      
                    
                case 3 :
                    System.out.println("==================================================");
                    System.out.println("              MENU SERVIS LAPTOP");
                    System.out.println("==================================================");
                    // [FLOW] prompt 36 - input 37 - validasi 40
                    System.out.print("Servis berapa laptop? (1 s/d " + (kapasitas - jumlahUnit) + "): ");
                    String jumlahStr = input.readLine().trim();
                    boolean jumlahValid = false;
                    while (jumlahValid == false) {
                        jumlahValid = true;
                        try {
                            jumlah3 = Integer.parseInt(jumlahStr);
                            if (jumlah3 < 1) {
                                jumlahValid = false;
                                System.out.println("Minimal servis 1 laptop!");
                            }
                            if (jumlah3 > kapasitas - jumlahUnit) {
                                jumlahValid = false;
                                System.out.println("Maaf, kapasitas hanya bisa menampung "
                                        + (kapasitas - jumlahUnit) + " unit!");
                            }
                        } catch (Exception e) {
                            jumlahValid = false;
                            System.out.println("Input tidak valid! Masukkan angka.");
                        }
                        if (jumlahValid == false) {
                            System.out.print("Servis berapa laptop? (1 s/d " + (kapasitas - jumlahUnit) + "): ");
                            jumlahStr = input.readLine().trim();
                            }
                        }
                    System.out.println();
                    // [FLOW] nama 64-66
                    System.out.println("--- DATA PEMILIK LAPTOP ---");
                    System.out.print("Masukkan Nama Pelanggan        : ");
                    String nama3 = input.readLine().trim();
                    while (nama3.equalsIgnoreCase("")) {
                        System.out.println("Nama tidak boleh kosong! Silakan isi nama klien.");
                        System.out.print("Masukkan Nama Pelanggan        : ");
                        nama3 = input.readLine().trim();
                    }
                    // [INPUT] telepon 74 - struk 172
                    System.out.print("Masukkan Nomor Telepon         : ");
                    String telepon3 = input.readLine().trim();
                    while (telepon3.equalsIgnoreCase("")) {
                        System.out.println("Nomor Telepon tidak boleh kosong! Silakan isi nomor telepon klien.");
                        System.out.print("Masukkan nomor telepon  : ");
                        telepon3 = input.readLine().trim();
                    }
                    System.out.println();
                    System.out.println("--- DETAIL UNIT & KERUSAKAN ---");
                    System.out.println("(Masukkan data untuk " + jumlah3 + " laptop)");
                    // [BACKEND] katalog+array - isi 154-160 baca 176-188
                    String[] jenisServisArr = { "Ringan", "Sedang", "Berat" };
                    int[][] dataServis = {
                            { 40000, 3, 0 },
                            { 50000, 7, 1000000 },
                            { 60000, 14, 2000000 }
                    };
                    int jumlahServis = 3;
                    String[] unitMerk = new String[kapasitas];
                    String[] unitSerial = new String[kapasitas];
                    String[] unitKeluhan = new String[kapasitas];
                    String[] unitJenis = new String[kapasitas];
                    long[] unitBiaya = new long[kapasitas];
                    int[] unitHari = new int[kapasitas];
                    // [ITERATION] per unit - input, cek jenis, hitung, simpan
                    for (int u = 0; u < jumlah3; u++) {
                        System.out.println();
                        System.out.println("--- Laptop ke-" + (u + 1) + " dari " + jumlah3 + " ---");
                        System.out.print("Masukkan Merk & Seri Laptop    : ");
                        String merk = input.readLine().trim();
                        while (merk.equalsIgnoreCase("")) {
                            System.out.println("Merk laptop tidak boleh kosong! Silakan isi merk laptop klien.");
                            System.out.print("Masukkan Merk & Seri Laptop    : ");
                            merk = input.readLine().trim();
                        }
                        System.out.print("Masukkan Nomor Serial (SN)     : ");
                        String serial = input.readLine().trim();
                        System.out.print("Deskripsi Keluhan Laptop       : ");
                        String keluhan = input.readLine().trim();
                        while (keluhan.equalsIgnoreCase("")) {
                            System.out.println("Keluhan tidak boleh kosong! Ceritakan kerusakan laptop klien.");
                            System.out.print("Deskripsi Keluhan Laptop       : ");
                            keluhan = input.readLine().trim();
                        }
                        System.out.print("Jenis Servis (Ringan/Sedang/Berat): ");
                        String jenisServis = input.readLine().trim();
                        int hari = 0;
                        int tarif = 0;
                        int part = 0;
                        int ketemuIndex = 0;
                        boolean ketemu = false;
                        while (ketemu == false) {
                            for (int i = 0; i < jumlahServis; i++) {
                                if (jenisServis.equalsIgnoreCase(jenisServisArr[i])) {
                                    tarif = dataServis[i][0];
                                    hari = dataServis[i][1];
                                    part = dataServis[i][2];
                                    ketemuIndex = i;
                                    ketemu = true;
                                }
                            }
                            if (ketemu == false) {
                                System.out.println("Maaf, jenis servis " + jenisServis + " tidak tersedia");
                                System.out.print("Jenis Servis (Ringan/Sedang/Berat): ");
                                jenisServis = input.readLine().trim();
                            }
                        }
                        long biaya = ((long) tarif * hari) + part;
                        if (jenisServis.equalsIgnoreCase("Ringan")) {
                            // [OUTPUT] detail jenis - tampilan saja
                            System.out.println("Detail Servis Ringan:");
                            System.out.println(" - Pemeriksaan dasar dan pembaruan sistem/aplikasi.");
                            System.out.println(" - Pembersihan software atau instalasi aplikasi atas persetujuan pelanggan.");
                            System.out.println(" - Tidak termasuk penggantian komponen.");
                        } else if (jenisServis.equalsIgnoreCase("Sedang")) {
                            System.out.println("Detail Servis Sedang:");
                            System.out.println(" - Diagnosis dan servis modul kompatibel: keyboard, RAM, atau layar.");
                            System.out.println(" - Tindakan mengikuti hasil pemeriksaan.");
                            System.out.println(" - Biaya dan ketersediaan sparepart dikonfirmasi terpisah.");
                        } else {
                            System.out.println("Detail Servis Berat:");
                            System.out.println(" - Diagnosis komponen utama atau motherboard.");
                            System.out.println(" - Perbaikan tingkat komponen atau penggantian motherboard hanya dilakukan");
                            System.out.println("   setelah pemeriksaan, estimasi, dan persetujuan pelanggan.");
                        }
                        // [BACKEND] simpan unit - dibaca struk 176
                        unitMerk[jumlahUnit] = merk;
                        unitSerial[jumlahUnit] = serial;
                        unitKeluhan[jumlahUnit] = keluhan;
                        unitJenis[jumlahUnit] = jenisServisArr[ketemuIndex];
                        unitBiaya[jumlahUnit] = biaya;
                        unitHari[jumlahUnit] = hari;
                        jumlahUnit = jumlahUnit + 1;
                    }
                    // [BACKEND] nomor bon - tampil 170
                    int kodeBon = 10000 + ((nomorTransaksi * 7919) % 90000);
                    String nomorServis = "LPH-" + kodeBon;
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    // [OUTPUT] struk 168-188
                    System.out.println("              BUKTI PENERIMAAN SERVIS");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nomor Servis    : " + nomorServis);
                    System.out.println("Nama Pelanggan  : " + nama3);
                    System.out.println("No. Telepon     : " + telepon3);
                    System.out.println("Jumlah Unit     : " + jumlah3);
                    System.out.println("--------------------------------------------------");
                    long totalBiaya = 0;
                    for (int i = 0; i < jumlahUnit; i++) {
                        System.out.println("LAPTOP " + (i + 1));
                        System.out.println("  Merk & Seri : " + unitMerk[i]);
                        System.out.println("  No. Seri    : " + unitSerial[i]);
                        System.out.println("  Keluhan     : " + unitKeluhan[i]);
                        System.out.println("  Jenis       : " + unitJenis[i]);
                        System.out.println("  Biaya       : Rp " + unitBiaya[i]);
                        System.out.println("  Pengerjaan  : " + unitHari[i] + " Hari");
                        System.out.println("--------------------------------------------------");
                        totalBiaya = totalBiaya + unitBiaya[i];
                    }
                    System.out.println("--------------------------------------------------");
                    System.out.println("TOTAL ESTIMASI  : Rp " + totalBiaya);
                    System.out.println("--------------------------------------------------");
                    System.out.println("Simpan bukti ini untuk pengambilan laptop Anda!");
                    System.out.println("--------------------------------------------------");
                    System.out.println("TERIMA KASIH TELAH MEMPERCAYAKAN SERVIS DI LAPTOPHUB");
                    System.out.println("==================================================");
                    
                    System.out.println();
                    System.out.println("Apakah Anda Ingin keluar? [Ya / Tidak]");
                    keluar = input.readLine();
                    break;
                    
                case 4 :
                    
                    System.out.println("|==================================================|");
                    System.out.println("|               MENU AKSESORIS LAPTOP              |");
                    System.out.println("|==================================================|");
                    System.out.println("|1. Mouse Wireless Logitech M220 - Rp175000        |");
                    System.out.println("|2. Keyboard Mechanical - Rp350000                 |");
                    System.out.println("|3. Headset Gaming - Rp250000                      |");
                    System.out.println("|4. Cooling Pad Gaming - Rp120000                  ");
                    System.out.println("|==================================================|");
            
                    System.out.print("Masukkan Nama Pembeli : ");
                    nama4 = input.readLine();
            
                    System.out.print("Masukkan No. Telepon : ");
                    telepon4 =input.readLine();
            
                    System.out.print("Banyak macam aksesoris yang dibeli : ");
                    aksesoris4 = Integer.parseInt(input.readLine());
            
                    int [] pilihan4 = new int [aksesoris4];
                    int [] banyak = new int [aksesoris4];
                    int [] total = new int [aksesoris4];
                    String [] namaAks = new String [aksesoris4];
                    int [] harga4 = new int [aksesoris4];
                
                    for (int i =0;i <aksesoris4;i++){   
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("|                 DATA PEMBELIAN "+(i+1)+"                 |");
                    System.out.println("|--------------------------------------------------|");
                    System.out.print("Masukkan pilihan (1 s/d 4) untuk aksesoris ke "+(i+1)+" : ");
                    pilihan4[i] = Integer.parseInt(input.readLine());
                
                    switch (pilihan4[i]){
                        case 1 : 
                            namaAks[i] = "Mouse Wireless Logitech M220" ;
                            harga4[i] = 175000;
                            break;
                    
                        case 2 :
                            namaAks[i] = "Keyboard Mechanical" ;
                            harga4[i] = 350000;
                            break;
                    
                        case 3 : 
                            namaAks[i] = "Headset Gaming" ;
                            harga4 [i]= 250000;
                            break;
                    
                        case 4 :
                            namaAks[i] = "Cooling Pad Gaming" ;
                            harga4[i] = 120000;
                            break;
                    
                        default :
                            namaAks[i] = "";
                            harga4[i] = 0;
                            break;
                        
                        }
                        System.out.print("Masukkan jumlah beli "+(i+1)+" : ");
                        banyak[i] = Integer.parseInt(input.readLine());
            
                        total[i] = harga4 [i] * banyak [i];
                    
                        System.out.println("harga barang yang harus dibayar  : "+total[i]);
            
                        tb = tb + total[i];
            
                        }
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("total yang harus dibayar : "+tb);
            
                        System.out.print("Metode Pembayaran : ");
                        metode4 = input.readLine();
            
                        System.out.print("Uang yang dibayar : ");
                        uang = Integer.parseInt(input.readLine());
            
                        kembalian4 =uang-tb;
            
                        System.out.println("Jumlah kembalian : "+kembalian4);
            
                        System.out.println();
                        System.out.println("|==================================================|");
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("            STRUK PEMBELIAN              ");
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("Nama Pembeli : " + nama4);
                        System.out.println("No. Telepon  : " + telepon4);
                        for (int i =0;i <aksesoris4;i++){
                        System.out.println("Aksesoris Yang Dipilih : "+namaAks[i] );
                        System.out.println("Harga Satuan : Rp "+ harga4[i]);
                        System.out.println("Jumlah Beli  : " + banyak[i] + " Unit");
                        }
                        System.out.println("Total Harga : Rp " + tb);
                        System.out.println("Metode Pembayaran : "+metode4);
                        System.out.println("Uang Dibayar : Rp " + uang);
                        System.out.println("Uang Kembalian : Rp " + kembalian4);
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("Terima Kasih telah berbelanja di LaptopHub!");
                        System.out.println("|==================================================|");
            
                        System.out.println();
                        System.out.println("Apakah Anda Ingin keluar? [Ya / Tidak]");
                        keluar = input.readLine();
                        break;
            
            }
            }while
            (keluar.equalsIgnoreCase("Tidak"));
             System.out.println("SELESAI!!!");
            
            }
        catch (Exception ie){
            System.out.println("Data yang diinput SALAH!!");
        }
    }
}

    