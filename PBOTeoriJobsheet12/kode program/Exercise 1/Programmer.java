
package pbo_teori_poliformismejs12;

public class Programmer extends Pegawai {
    private int bonus;
    
    public Programmer(int bonus){
        this.bonus =bonus;
    }
    public Programmer( String nama,int bonus, int gaji){
        super(nama,gaji);
        this.bonus = bonus;
    }
    public int getBonus(){
        return bonus;
    }
    public int getGaji(){
        return gaji;
    }
}
