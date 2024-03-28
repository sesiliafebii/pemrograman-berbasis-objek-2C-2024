package com.mycompany.tugas2;
import java.util.Scanner;
public class Tugas2 {
    int nim;
    String nama,prodi,alamat;
    Scanner input = new Scanner(System.in);
    
    
    void biodata(){
        System.out.print("Nama mahasiswa:");
        nama = input.nextLine();
        System.out.print("Nim mahasiswa:");
        nim = input.nextInt ();
        input.nextLine();
        System.out.print("Prodi mahasiswa:");
        prodi = input.nextLine();
        System.out.print("Alamat mahasiswa:");
        alamat = input.nextLine();
    }
    void hasil(){
        System.out.println("==========================");
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nim mahasiswa: " + nim);
        System.out.println("Prodi mahasiswa: " + prodi);
        System.out.println("Alamat mahasiswa: " + alamat);
    }
    public static void main(String[] args) {
        Tugas2 mahasiswa = new Tugas2();
        mahasiswa.biodata();
        mahasiswa.hasil();
    }
}
