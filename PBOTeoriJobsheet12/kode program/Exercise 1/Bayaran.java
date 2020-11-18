
package pbo_teori_poliformismejs12;

public class Bayaran {
    public int hitungBayaran(Pegawai pg){
        int uang = pg.getGaji();
        
        if (pg instanceof Manajer) {
            uang += ((Manajer)pg).getTunjngan();
        }
        else if (pg instanceof Manajer) {
            uang +=((Programmer)pg).getBonus();
            
        }
        return uang;
    }
}
