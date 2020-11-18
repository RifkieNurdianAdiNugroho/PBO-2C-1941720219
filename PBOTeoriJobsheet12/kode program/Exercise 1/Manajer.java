
package pbo_teori_poliformismejs12;


public class Manajer extends Pegawai{
    private int tunjangan;
    
    public Manajer(int tunjangan){
        this.tunjangan =  tunjangan;
    }
    public Manajer(String nama,int tunjangaan,int gaji){
        super(nama,gaji);
        this.tunjangan = tunjangan;
    }
    public int getTunjngan(){
        return tunjangan;
    }
    public int getGaji(){
        return gaji;
    }
}
