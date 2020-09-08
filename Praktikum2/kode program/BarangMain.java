
package pertemuan.pkg2;

public class BarangMain {
     public static void main(String args[]){
        Barang bar1 = new Barang();
        Barang bar2 = new Barang();
         System.out.println("========================");  
        bar1.kode="OPPO A9";
        bar1.namaBarang = "HP OPPO";
        bar1.hargaDasar=5000000;
        bar1.diskon = 0.1f;
        bar1.tampilData();
         System.out.println("========================");
        bar2.kode="ASUS ZEPHYRUS";
        bar2.namaBarang="Laptop";
        bar2.hargaDasar=26000000;
        bar2.diskon=0.5f;
        bar2.tampilData();
         System.out.println("========================");
    }
}
