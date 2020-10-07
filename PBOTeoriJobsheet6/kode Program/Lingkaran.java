
package Teorijobsheet6;

public class Lingkaran extends BangunDatar {

    public float r;
    public float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran = "+luas);
        return luas;
    }
    public float keliling(){
        float keliling = (float) (2 * Math.PI * r *r);
        System.out.println("Keliling Lingkaran = "+keliling);
        return keliling;
    }
}


