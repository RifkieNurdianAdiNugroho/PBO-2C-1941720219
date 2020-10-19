
package utspbopembenaranProject;

public class DemoKuis {
    public static void main(String[] args) {
        SepedaMotor honda = new SepedaMotor("Vario", "Honda");
        System.out.println(honda.getMerekSepeda());
        System.out.println(honda.getMerek());
        honda.tambahKecepatan();
        honda.tambahKecepatan();
        honda.kurangiKecepatan();

        System.out.println("");

        SepedaMotor yamaha = new SepedaMotor("nMax", "Yamaha");
        System.out.println(yamaha.getMerekSepeda());
        System.out.println(yamaha.getMerek());
        yamaha.tambahKecepatan();
        yamaha.tambahKecepatan();
        yamaha.kurangiKecepatan();
    }
}
