
package motorencapsulation;

public class TesKoperasi {
       private String noKTP;
    private String nama;
    private int saldo;
    private int limitPinjam = 5000000;
    private int jumlahPinjam;

    public TesKoperasi(String noKTP, String nama, int saldo) {
        noKTP = noKTP;
        nama = nama;
        saldo = saldo;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimitPinjam() {
        return limitPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setNoKTP(String noKTP) {
        noKTP = noKTP;
    }

    public void setNama(String nama) {
        nama = nama;
    }

    public void setSaldo(int saldo) {
        saldo = saldo;
    }

    public void setLimitPinjam(int limitPinjam) {
        limitPinjam = limitPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        jumlahPinjam = jumlahPinjam;
    }

    
    
    public int pinjam(int pinjam){
        if (pinjam < limitPinjam){
          jumlahPinjam += pinjam;
        }
        else{
            System.out.println("Pinjaman melibihi batas!!!");
        }  
        return jumlahPinjam;
    }
    
    public int angsur(int angsur){
        jumlahPinjam -= angsur;
    return jumlahPinjam;
    }
}
