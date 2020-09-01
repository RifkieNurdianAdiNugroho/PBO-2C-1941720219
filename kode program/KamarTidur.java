
package Kamar;

public class KamarTidur extends Kamar {
    private String Kasur;
    public void setKasur(String newValue){
        Kasur=newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Kasur: "+Kasur);
    }
}
