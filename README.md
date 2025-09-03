# TugasKetigaPBO
# Praktikum Pertemuan Ketiga Pemrograman Berbasis Objek

Dalam praktikum ini, kami mempelajari tentang penggunaan abstract, interface, overloading dan overriding. 

# Abstract dan Interface
1. Abstract adalah sebuah konsep dalam PBO yang menyembunyikan detail implementasi dan hanya menampilkan bagian atau fitur pentingnya saja
   Seperti dalam praktikum ini:
   
   abstract class sekolah { ...} --> sebagai superclass
   abstract class sma extends sekolah { ... } --> inheretance dari class abstract sekolah
   abstract class kelas extends sma { ... } --> inheritance dari class abstract sma

   Adapun class abstract itu memiliki constructor di dalamnya, seperti berikut:
   abstract class kelas extends sma{
    
    String namaKelas;

    public kelas(String nama, String jenjang) {
        super(nama, jenjang);
        this.namaKelas= namaKelas;
    }
    ... }

   baris public kelas (...){...} --> constructor dalam class abstract kelas
3. Interface adalah sebuah konsep yang mewarisi method dari class lain namun mengisi dan memanggil methodnya itu di class yang mengimplementasi.
   Seperti dalam praktikum ini:
   
   public interface ekstrakurikuler { ... }
   public interface kegiatan { ... }
   public interface lomba { ... }

   baris code di atas adalah atribut yang akan diwariskan ke subclass nanti nya
   Interface sendiri tidak memiliki constructor namun dia memiliki atribut, seperti berikut:
   public interface lomba {
    
    void berlari();
}

baris void berlari(); --> atribut dalam interface lomba
# Perbedaan dan Persamaan Abstract dan Interface
1. Perbedaan: abstract implementasinya menggunakan extends, sedangkan interface implementasinya menggunakan implements
2. Persamaan: sama-sama memiliki method yang di implementasikan

# Overloading
Sebuah konsep dimana nama method yang ada di dalamnya sama namun memiliki parameter yang berbeda dan di class yang sama

# Overriding
Sebuah konsep dimana nama method yang ada di dalamnya sama, parameternya sama, namun berada di class yang berbeda/ class turunan (inheritance)

# Catatan
Konsep overloading dan Overriding itu berbeda dengan konsep implementasi method dari interface dan class abstract
