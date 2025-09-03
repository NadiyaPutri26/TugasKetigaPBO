/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKetiga1;

/**
 *
 * @author Huawei
 */
abstract class sma extends sekolah {
    
    int tahunDiBangun;

    public sma(String nama, String jenjang) {
        super(nama, jenjang);
        this.tahunDiBangun= tahunDiBangun;
    }
    
    void diBangun(){
        System.out.println("Tahun   : 1984");
    }
    
    abstract void lokasi();
}
