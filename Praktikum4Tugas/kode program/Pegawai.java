package Tugas;
public class Pegawai {
    private int nik;
    private String nama;

    public Pegawai(int nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }
    public void setNik(int nik) {
        this.nik = nik;
    }
    public int getNik() {
        return nik;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    } 
    public String info(){
        String info = "";
        info += "NIK: " + this.nik + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
