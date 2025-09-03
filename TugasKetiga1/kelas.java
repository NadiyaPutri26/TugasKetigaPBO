/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKetiga1;

/**
 *
 * @author Huawei
 */
abstract class kelas extends sma{
    
    String namaKelas;

    public kelas(String nama, String jenjang) {
        super(nama, jenjang);
        this.namaKelas= namaKelas;
    }
    
    void diKelas(){
        System.out.println("Kelas   : 12 MIPA 1");
    }
    
    abstract void tingkatKelas();
}
