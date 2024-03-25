/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23_106_modul1.soal.pkg1;

/**
 *
 * @author pinokio
 */
class manusia {
//class manusia
    String nama;
    int umur;
    String alamat;

    void berjalan(String lokasi) {
        String jalan = lokasi;
        System.out.println(nama +" berjalan "+ jalan);
    }
// lokasi, melintas = parameter
    void berlari(String melintasi) {
        String lari = melintasi;
        System.out.println(nama +" berlari "+ lari);
    }
}
