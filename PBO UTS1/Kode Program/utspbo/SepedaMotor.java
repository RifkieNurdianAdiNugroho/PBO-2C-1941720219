
package utspbo;

public class SepedaMotor  {
      Mesin mesin;
    private String merekMotor;
    
    public SepedaMotor(String merekMotor, String merekMesin){
        this.merekMotor = merekMotor;
        this.mesin = mesin;
    }
    public void setMerekMotor(String merekMesin){
        this.merekMotor = merekMotor;
    }
    public String getMerekMotor(){
        return merekMotor;
    }
    public Mesin getMerekMesin(){
        return mesin;
    }
    public void tambahKecepatanMotor(){
        
    }
    public void kurangiKecepatanMotor(){
        
    }
    
}

