/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKetiga1;

/**
 *
 * @author Huawei
 */
public class Main {

    public static void main(String[] args) {
        siswa s = new siswa("SMA 1 Sooko", "SMA", "12", "12 MIPA 1", 1984);

        s.tampilkanProfil();
        System.out.print("Nomor Statistik : ");
        s.nomorStatistik();
        s.diBangun();
        System.out.print("Berlokasi di    : ");
        s.lokasi();
        System.out.println();

        System.out.println("Nama Siswa  : Dinda Ayu Assegaf");
        s.diKelas();
        System.out.println();

        System.out.println("Kegiatannya di dalam maupun luar sekolah: ");
        s.belajar();
        System.out.print(" kelas ");
        s.tingkatKelas();
        s.berlari();
        s.menyanyi();

    }
}
