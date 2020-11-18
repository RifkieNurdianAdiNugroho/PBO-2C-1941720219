
package pbo_teori_poliformismejs12;

public class Manusia {
    public void nyalakanPerangkat(Elektronik perangkat){
       int daya = perangkat.getVoltase();
        
        if(perangkat instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: " + ((TelevisiJadul) perangkat).getModelInput());
            daya = 200;
            System.out.println("Voltase televisi: " + daya);
        }
        else if(perangkat instanceof TelevisiModern){
            System.out.println("Nyalakan televisi Modern dengan input: " + ((TelevisiModern) perangkat).getModelInput());
            daya = 200;
            System.out.println("Voltase televisi: " + daya);
        }
        else{
            System.out.println("Salah input");
        }
    }
}
