package motorencapsulation;
public class Motor {
    private int kecepatan =0;
    private boolean kontakOn= false;
    public void nyalakanMesin(){
        kontakOn= true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true) {
            kecepatan += 50;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin off! \n");
        }
    }
    public void kurangKecepatan(){
        if (kontakOn == true) {
            kecepatan =5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak off");
        }
        System.out.println("Kecepatan "+ kecepatan+"/n");
    }
    
}
