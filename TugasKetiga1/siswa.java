/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKetiga1;

/**
 *
 * @author Huawei
 */
class siswa extends kelas implements kegiatan, ekstrakurikuler, lomba {
    sma s;
    kelas kls;

    public siswa(String nama, String jenjang, String namaKelas, String diKelas, int diBangun) {
        super(nama, jenjang);
        this.s= s;
        this.kls= kls;
    }
    
    @Override
    public void belajar() {
        System.out.print("Dia sedang belajar Biologi");
    }

    @Override
    public void menyanyi() {
        System.out.println("Dia mengikuti ekstrakurikuler Paduan Suara");
    }

    @Override
    public void berlari() {
        System.out.println("Dia mengikuti lomba lari");
    }

    @Override
    void nomorStatistik() {
        System.out.println(20502727);
    }

    @Override
    void tingkatKelas() {
        System.out.println(12);
    }

    @Override
    void lokasi() {
        System.out.println("Mojokerto");
    }

}
