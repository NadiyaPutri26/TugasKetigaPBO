/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasKetiga2;

/**
 *
 * @author Huawei
 */
public class MainHima {

    public static void main(String[] args) {

        System.out.println("Ini contoh override:");
        System.out.println();
        Hima h = new Hima();
        h.tugas();

        tugasHima hm = new tugasHima();
        hm.tugas();

        System.out.println();
        System.out.println("Ini contoh overload:");
        System.out.println();
        HimpunanMahasiswa hmsi = new HimpunanMahasiswa();
        hmsi.info("Sistem Informasi");
        hmsi.info(60);
        hmsi.info(13, "\n1. Ketua Hima \n2. Wakil Hima \n3. Sekretaris 1 "
                + "\n4. Sekretaris 2 \n5. Bendahara 1 \n6. Bendahara 2 "
                + "\n7. Pengembangan Akademik \n8. Penegmbangan Minat dan Bakat "
                + "\n9. Manajemen Sumber Daya Manusia \n10. Kerohanian Keagamaan Islam "
                + "\n11. Hubungan Masyarakat \n12. Komunikasi dan Informasi \n13. Pengembangan Bisnis");
    }
}
