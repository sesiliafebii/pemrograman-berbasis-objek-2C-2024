/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyewaan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan yang akan diinput: ");
        int jumlahKendaraan = input.nextInt();

        Kendaraan[] daftarKendaraan = new Kendaraan[jumlahKendaraan];

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nMasukkan data kendaraan ke-" + (i + 1));
            System.out.print("Jenis Kendaraan (Mobil/Motor): ");
            String jenis = input.next();
            System.out.print("Merek: ");
            String merek = input.next();
            System.out.print("Model: ");
            String model = input.next();
            System.out.print("Status (T = Tersedia, D = Disewakan):");
            char status ;
            do {
                System.out.println("Status(T = Tersedia, D = Disewakan): ");
                status = input.next().charAt(0);
                if (status != 'T' && status != 'D'){
                    System.out.println("Status tidak valid silahkan masukkan T atau D ");
                }
            }while (status != 'T' && status !='D');
            System.out.print("Tahun Kendaraan: ");
            int tahun = input.nextInt();

            if (jenis.equalsIgnoreCase("Mobil")) {
                daftarKendaraan[i] = new PenyewaanMobil(merek, model, status, tahun);
            } else if (jenis.equalsIgnoreCase("Motor")) {
                daftarKendaraan[i] = new PenyewaanMotor(merek, model, status, tahun);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }
        System.out.println("\nDaftar Kendaraan yang Telah Disewakan:");
        for (Kendaraan kendaraan : daftarKendaraan) {
            if (kendaraan != null && kendaraan.status == 'D') {
                System.out.println("Jenis: " + kendaraan.jenis + ", Merek: " + kendaraan.merek +
                        ", Model: " + kendaraan.model + ", Tahun: " + kendaraan.tahun);
            }
        }
    }

    private static String toLowerCase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}