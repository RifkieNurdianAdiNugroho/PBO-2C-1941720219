package Tugas;
public class Direktur {
    private int nip;
    private String nama;
    public Direktur(int nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    public void setNip(int nip) {
        this.nip = nip;
    }
    public int getNip() {
        return nip;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    public String info(){
        String info = "";
        info += "NIP: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
    
}
