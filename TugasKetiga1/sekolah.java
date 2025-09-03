/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKetiga1;

/**
 *
 * @author Huawei
 */
abstract class sekolah {
    
    String nama;
    String jenjang;
    
    sekolah(String nama, String jenjang){
        this.nama= nama;
        this.jenjang= jenjang;
    }
    
    void tampilkanProfil(){
        System.out.println("Nama    : " +nama);
        System.out.println("Jenjang : "+ jenjang);
    }   
    
    abstract void nomorStatistik();
}
