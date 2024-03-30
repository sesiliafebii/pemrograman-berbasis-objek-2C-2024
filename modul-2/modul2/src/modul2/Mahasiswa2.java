/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author Sesilia Febi
 */
public class Mahasiswa2 {
    String Nama;
    String NIM;
    String JurusanProdi;
    String Alamat;
    String []ukm; // atribut menyimpan ukm
    static String universitas="Trunojoyo Madura";
    
    public Mahasiswa2(String nama, String nim, String jurusanProdi, String alamat){
        this.Nama= nama;
        this.NIM= nim;
        this.JurusanProdi= jurusanProdi;
        this.Alamat= alamat;
    }
    
    //getter dan setter untuk atribut non static  
    public void setNama(String nama){
        Nama=nama;
    }
    
    public void setNIM(String nim){
        NIM=nim;
    }
    
    public void setJurusanProdi(String jurusanprodi){
        JurusanProdi=jurusanprodi;
    }
    
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
    
    public void setUkm(String[] Ukm) {
        ukm =Ukm;
    }
    
    void showOutput(){
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan/Prodi: " + JurusanProdi);
        System.out.println("Alamat: " + Alamat);    
    
    }

 
    public static String getUniversitas() {
        return universitas;
    }

    //getter dan setter untuk atribut static univ
    public static void setUniversitas(String universitas) {
        Mahasiswa2.universitas = universitas;
    }

    //getter dan setter untuk atribut ukm
    public String[] getUkm() {
        return ukm;
    }

     // Method static untuk menampilkan nilai atribut static universitas
    public static void Universitas() {
        System.out.println("Universitas: " + universitas);
    }
    
    public static void main(String[] args) {
        System.out.println("Universitas: " + universitas);
        Mahasiswa2.setUniversitas("Trunojoyo Madura");
        
        //membuat object mahasiswa
        Mahasiswa2 siswa = new Mahasiswa2("Sesilia Febi", "230441100040", "Sistem Informasi","Lamongan");

        //menambah ukm
        String[] ukm = {"Pramuka", "Paduan Suara"};
        siswa.setUkm(ukm);
        siswa.showOutput();
        System.out.println("UKM:");
        for (String namaUKM : siswa.getUkm()) {
            System.out.println("- " + namaUKM);
        }
        
//        Mahasiswa2.Universitas();


    }
}
