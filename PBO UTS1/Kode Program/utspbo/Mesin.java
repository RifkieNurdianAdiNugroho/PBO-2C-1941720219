
package utspbo;

public class Mesin extends SepedaMotor {
    
     private int kecepatan =0;
    private boolean menyala= false;
    public void nyalakanMesin(){
        menyala= true;
    }
      public Mesin(String merekMotor, String merekMesin) {
        super(merekMotor, merekMesin);
        mesin = mesin;
      }
    public void getKecepatan(String vario){
        if (menyala == true) {
            kecepatan += 50;
        }
       
    }
        public void setKecepatan(String Nmax){
        if (menyala == true) {
            kecepatan += 50;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off! \n");
        }
    }

    public void printStatus(){
        if (menyala == true) {
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan "+ kecepatan+"/n");
    }
}
