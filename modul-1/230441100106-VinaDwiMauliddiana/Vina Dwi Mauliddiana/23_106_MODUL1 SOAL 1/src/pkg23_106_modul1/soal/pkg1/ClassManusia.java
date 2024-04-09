/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_106_modul1.soal.pkg1;

/**
 *
 * @author pinokio
 */
public class ClassManusia{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia();
        orang1.nama = "Vina";
        orang1.umur = 19 ;
        orang1.alamat = "Jombang";
        //membuat object pada class manusia
        //manggil method
        orang1.berjalan("di jombang");
        orang1.berlari("melintasi desa");
        // Menampilkan method nama, umur, dan alamat
        System.out.println("Nama :"+orang1.nama);
        System.out.println("Umur :"+orang1.umur);
        System.out.println("Alamat :"+orang1.alamat); 
    }
    
}
