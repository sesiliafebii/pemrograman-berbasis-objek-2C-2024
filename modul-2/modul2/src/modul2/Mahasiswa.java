/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

/**
 *
 * @author Sesilia Febi
 */
public class Mahasiswa {
    String Nama, NIM, Jurusan, Alamat,Prodi;
    
//konstruktor
    public Mahasiswa(String Nama, String NIM, String Jurusan, String Alamat, String Prodi){
        this.Nama=Nama;
        this.NIM=NIM;
        this.Jurusan=Jurusan;
        this.Alamat=Alamat;
        this.Prodi=Prodi;    
    }
    
     public String getNama(){
        return Nama;
    }
      public String getNIM(){
        return NIM;
    }
       public String getJurusan(){
        return Jurusan;
    }
        public String getAlamat(){
        return Alamat;
    }
        public String getProdi(){
        return Prodi;
    }
        
 //Setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }
     public void setNIM(String NIM){
        this.NIM = NIM;
    }
     public void setJurusan(String Jurusan){
        this.Jurusan = Jurusan;
    }
     public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
     public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }
    
    public static void main(String[] args) {
        Mahasiswa siswa = new Mahasiswa("sesilia febi", "230441100040", "Teknik Informaika", "Lamongan","Sistem Informasi");
        System.out.println("Nama: " + siswa.getNama());
        System.out.println("NIM: " + siswa.getNIM());
        System.out.println("Jurusan: " + siswa.getJurusan());
        System.out.println("Alamat: " + siswa.getAlamat());
        System.out.println("Prodi:"+siswa.getProdi());
    }
    
}
