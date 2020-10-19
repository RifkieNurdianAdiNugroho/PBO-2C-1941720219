
package utspbo;

public class DemoKuis {
    public static void main(String[] args) {
        SepedaMotor honda=new SepedaMotor("Vario", "Honda");
        
        System.out.println(honda.getMerekMotor());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        
        System.out.println();
        SepedaMotor Yamaha=new SepedaMotor("Nmax", "Yamaha");
        System.out.println(Yamaha.getMerekMotor());
        System.out.println(Yamaha.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        
    }
}
