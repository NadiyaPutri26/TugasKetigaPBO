# TugasKetigaPBO
# Praktikum Pertemuan Ketiga Pemrograman Berbasis Objek

Dalam praktikum ini, kami mempelajari tentang penggunaan _abstract, interface, overloading_ dan _overriding_. 

# _Abstract_ dan _Interface_
1. _Abstract_ adalah sebuah konsep dalam PBO yang menyembunyikan detail implementasi dan hanya menampilkan bagian atau fitur pentingnya saja
   Seperti dalam praktikum ini:
   
  **abstract class sekolah { ...}** --> sebagai _superclass_
   **abstract class sma extends sekolah { ... }** --> _inheretance_ dari _class abstract_ "sekolah"
   **abstract class kelas extends sma { ... }** --> _inheritance_ dari _class abstract_ "sma"

   Adapun _class abstract_ itu memiliki _constructor_ di dalamnya, seperti berikut:
   **abstract class kelas extends sma{**
    
   **String namaKelas;
   **
    public kelas(String nama, String jenjang) {
        super(nama, jenjang);
        this.namaKelas= namaKelas;
    }
    ... }**

   baris **public kelas (...){...}** --> _constructor_ dalam _class abstract_ "kelas"
3. _Interface_ adalah sebuah konsep yang mewarisi _method_ dari class lain namun mengisi dan memanggil methodnya itu di class yang mengimplementasi.
   Seperti dalam praktikum ini:
   
   **public interface ekstrakurikuler { ... }
   public interface kegiatan { ... }
   public interface lomba { ... }**

   baris code di atas adalah atribut yang akan diwariskan ke _subclass_ nanti nya
   _Interface_ sendiri tidak memiliki _constructor_ namun dia memiliki atribut, seperti berikut:
  **public interface lomba {**
   **void berlari();**
**}**

baris **void berlari();** --> atribut dalam _interface_ lomba
# Perbedaan dan Persamaan Abstract dan Interface
1. Perbedaan: _abstract_ implementasinya menggunakan extends, sedangkan interface implementasinya menggunakan implements

   Seperti baris _code_ berikut:
  **class siswa extends kelas implements kegiatan, ekstrakurikuler, lomba { ... }** --> "siswa" dan "kelas" itu adalah abstract class yang saling terhubung melalui _inheritance_ dan diimplementasikan menggunakan _extends_. "kegiatan", "ekstrakurikuler", "lomba" --> masuk dalam _interface_ dan di implementasikan menggunakan _implements_
   
3. Persamaan: sama-sama memiliki method yang di implementasikan

   Seperti baris _code _ berikut:
   a. _abstract_ --> **abstract class sma extends sekolah { ...
   void diBangun(){
        System.out.println("Tahun   : 1984");
    ...}**
   b. _interface_ --> **public interface lomba {
    void berlari();
}**
# Overloading
Sebuah konsep dimana nama _method_ yang ada di dalamnya sama namun memiliki parameter yang berbeda dan di _class_ yang sama

Seperti baris _code_ berikut:
**public void info(String namaProdi) {
        System.out.println("Himpunan Mahasiswa: " + namaProdi);
    }
public void info(int jumlahAnggota) {
        System.out.println("Jumlah anggota: " + jumlahAnggota);
    }
public void info(int jumlahStruktur, String pembagianStruktur) {
        System.out.println("Jumlah Struktur: " + jumlahStruktur
                + "\nPembagian Struktur: " + pembagianStruktur);
    }**
# Overriding
Sebuah konsep dimana nama _method_ yang ada di dalamnya sama, parameternya sama, namun berada di _class_ yang berbeda/ _class_ turunan (_inheritance_)

Seperti bari _code_ berikut:
**@Override
    public void info(int jumlahStruktur, String pembagianStruktur) {
        super.info(jumlahStruktur, pembagianStruktur); 
    }
@Override
    public void info(int jumlahAnggota) {
        super.info(jumlahAnggota); 
    }
@Override
    public void info(String namaProdi) {
        super.info(namaProdi); 
    }**
# Kesimpulan
1. _Abstract_ --> menyediakan kerangka dasar yang harus diimplementasikan oleh _subclass_
2. _Interface_ --> menyediakan _method_ yang harus diimplementasikan oleh _subclass_
3. _Overriding_ --> ketika _subclass_ mendefinisikan kembali _method_ yang sudah ada di _superclass_ untuk mengubah atau menambahkan fungsionalitas baru
4. _Overloading_ --> memungkinkan pengguna menggunakan _method_ yang sama di _class_ yang sama, namun dengan parameter yang berbeda

Semoga penjelasan diatas dapat membantu memahami materi dalam praktikum pertemuan 3 mata kuliah Pemrograman Berorientasi Objek ini.
