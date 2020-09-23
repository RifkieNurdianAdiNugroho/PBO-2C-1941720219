package Tugas;
public class Project {
    private String kode;
    private String nama;
    private Pegawai pegawai;
    private Direktur direktur;
    private Ruangrapat ruangrapat;
    
    public Project(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public Pegawai getKaryawan() {
        return pegawai;
    }
    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public Direktur getDirektur() {
        return direktur;
    }
    public void setDirektur(Direktur direktur) {
        this.direktur = direktur;
    }
    public Ruangrapat getRuangrapat() {
        return ruangrapat;
    }
    public void setRuangrapat(Ruangrapat ruangrapat) {
        this.ruangrapat = ruangrapat;
    }
    public void info(){
        System.out.println("Kode Project: " + kode);
        System.out.println("Nama Project: " + nama);
        System.out.println("Direktur: " + this.direktur.info());
        System.out.println("Pegawai: " + this.pegawai.info());
        System.out.println("Ruang Rapat: " + this.ruangrapat.info());
    }
}
