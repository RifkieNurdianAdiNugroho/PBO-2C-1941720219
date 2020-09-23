package Tugas;
public class Ruangrapat {
    private String kode;
    public Ruangrapat(String kode) {
        this.kode = kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public String info(){
        String info = "";
        info += "Kode: " + this.kode + "\n";
        return info;
    }
}
