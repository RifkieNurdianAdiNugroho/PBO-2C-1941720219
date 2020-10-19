
package utspbopembenaranProject;

public class SepedaMotor extends Mesin{

     public Mesin mesin;
    public String merekSepeda;

    public SepedaMotor() {
    }
    
    public SepedaMotor(String merekSepeda, String merek) {
        super.merek = merekSepeda;
        this.merekSepeda = merek;
    }

    public void setMerekSepeda(String merek) {
        this.merekSepeda = merek;
    }

    public String getMerekSepeda() {
        return merekSepeda;
    }
    public String getMerek() {
        return super.getMerek(); 
    }
    public void tambahKecepatan(){
       super.tambahKecepatan();
    }
}

