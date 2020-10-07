package Teorijobsheet6;
public class Main {
    public static void main(String[] args) {
        BangunDatar bg = new BangunDatar();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 7;
        pp.lebar = 5;
        
        Lingkaran l = new Lingkaran();
        l.r = 22;
        
        Segitiga sg = new Segitiga();
        sg.alas = 6;
        sg.tinggi = 7;
        sg.miring = 9;
        
        bg.luas();
        bg.keliling();
        
        pp.luas();
        pp.keliling();
        
        l.luas();
        l.keliling();
        
        sg.luas();
        sg.keliling();
    }
}
    

