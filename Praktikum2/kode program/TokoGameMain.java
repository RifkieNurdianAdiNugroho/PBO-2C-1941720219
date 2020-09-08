
package pertemuan.pkg2;

public class TokoGameMain {
     public static void main (String args[]){
        TokoGame pinjam1 = new TokoGame();
        TokoGame pinjam2 = new TokoGame();
         System.out.println("-------------------------------------");
        pinjam1.id = 1999;
        pinjam1.namaMember = "Rifkie Nurdian AdiNugroho";
        pinjam1.namaGame = "Call of duty Black Ops";
        pinjam1.harga = 5000;
        pinjam1.durasi = 12;
        pinjam1.tampilData();
         System.out.println("--------------------------------------");
        pinjam2.id = 1967;
        pinjam2.namaMember = "Joko Hartanto";
        pinjam2.namaGame= "Ghost of Tsushima";
        pinjam2.harga= 10000;
        pinjam2.durasi = 26;
        pinjam2.tampilData();
         System.out.println("--------------------------------------");
        
    }
}
