
package Tugas;

public class Main {
     public static void main(String[] args) {
        Dosen dosen1 = new Dosen();
        dosen1.setNama("EkoDarmayandi SPd.,MMT.");
        dosen1.setSKS(12);
        
        Pegawai pegawai1 = new Pegawai();
        pegawai1.setNama("Kadek suryani");
        
        DaftarGaji daftar_gaji = new DaftarGaji(2);
        daftar_gaji.addPegawai(dosen1);
        daftar_gaji.addPegawai(pegawai1);
        daftar_gaji.printSemuaGaji();
    }    
}

