package koperasigettersetter;
public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;
    
    Anggota(String nama, String alamat){
        nama= nama;
        alamat= alamat;
        simpanan= 0;
    }    
    public void setNama(String nama){
        nama = nama;
    }
    public void setAlamat(String alamat){
        alamat= alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor(float uang){
        simpanan += uang;
    }
    public void pinjam(float uang){
        simpanan -= uang;
    }
}
