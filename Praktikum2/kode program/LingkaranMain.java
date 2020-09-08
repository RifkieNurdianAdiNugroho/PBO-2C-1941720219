
package pertemuan.pkg2;

public class LingkaranMain {
     public static void main(String args[]){
        Lingkaran lingkaran0 = new Lingkaran();
        Lingkaran lingkaran1 = new Lingkaran();
         System.out.println("++++++++++++++++++++++++++++++");
        lingkaran0.phi = 3.14;
        lingkaran0.r = 7;
        lingkaran0.hitungLuas();
        lingkaran0.hitungKeliling();
         System.out.println("+++++++++++++++++++++++++++++++");
        lingkaran1.phi=21/7;
        lingkaran1.r = 9;
        lingkaran1.hitungLuas();
        lingkaran1.hitungKeliling();
         System.out.println("+++++++++++++++++++++++++++++++");
    }
}
