
package pertemuan.pkg2;


public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int disc(){
        int disc;
        disc = (int) (diskon * 100 );
        return disc;
    }
    public int hitungHargaJual(){
        int hargaJual;
        hargaJual = (int) (hargaDasar - (hargaDasar*diskon/100));
        return hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon      : "+disc()+"%");
        System.out.println("Harga Jual  : "+hitungHargaJual());
    }
}
