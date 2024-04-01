/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23_106_modul1.soal.pkg2;

import java.util.Scanner;
//buat baca input e pengguna
/**
 *
 * @author pinokio
 */
public class SOAL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        System.out.println("-----Data Mahasiswa-----");
        //ouput buat pengguna memasukkan data mahasiswa
        Scanner mahasiswa = new java.util.Scanner(System.in);
        //buat objek scanner mahasiswa, gunanya untuk membaca inputan dari pengguna
         
    
        System.out.print("Nama Mahasiswa : ");
        String Nama;
        Nama = mahasiswa.nextLine();
        
        System.out.print(" NIM :");
        int Nim;
        Nim = mahasiswa.nextInt();
        
        mahasiswa.nextLine(); // Mengonsumsi newline yang tersisa setelah nextInt()
        
        System.out.print("Prodi Mahasiswa :");
        String Prodi;
        Prodi = mahasiswa.nextLine();
        
        
        System.out.print("Semester Mahasiswa  :");
        int Semester ;
        Semester = mahasiswa.nextInt();
        
        mahasiswa.nextLine(); // Mengonsumsi newline yang tersisa setelah nextInt()
        
        System.out.print("Alamat Mahasiswa  :");
        String Alamat;
        Alamat = mahasiswa.nextLine();
    
        //buat menyimpan mulai dari variabel nama, nim, jurusan, dan alamat
        //nexLine buat masukkan tipe data string dan menyimpan ke variabel nama, jurusan, dan alamat
        //nextInt buat masukkan tipe data int dan menyimpan ke variabel nim
        
        //nampilkan Data Mahasiswa
        System.out.println("-----Data Mahasiswa Terbaru ");
        System.out.println("Nama : "+Nama);
        System.out.println("NIM : "+Nim);
        System.out.println("Jurusan : "+Prodi);
        System.out.println("Semester : "+Semester);
        System.out.println("Alamat : "+Alamat);
    }
    
}
