
package pertemuan.pkg2;
public class Lingkaran {
     public double phi;
     public double r;
    
    public double hitungLuas(){
        double Luas =0.5*phi*r*r;
        System.out.println("Luas = " + Luas);
            return Luas;
    }
    
    public double hitungKeliling(){
        double Keliling = 2*phi*r;
        System.out.println("Keliling = " + Keliling);
            return Keliling;
    }
}
