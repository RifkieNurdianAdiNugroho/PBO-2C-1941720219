
package Teorijobsheet6;

public class Segitiga extends BangunDatar {

    public float alas;
    public float tinggi;
    public float miring;

    public float luas() {
        float luas = (float) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga = " + luas);
        return luas;
    }

    public float keliling() {
        miring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        float keliling = alas * tinggi * miring;
        System.out.println("Keliling Segitiga = " + keliling);
        return keliling;

    }
}
