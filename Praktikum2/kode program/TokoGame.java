
package pertemuan.pkg2;

public class TokoGame {
      public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int durasi;
    
    public int totalHarga(){
            int total;
            total = durasi * harga;
            return total;
        }
    public void tampilData(){
        System.out.println("id Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Harga       : " + harga);
        System.out.println("DurasiPinjam: " + durasi);
        System.out.println("TotalHarga  : " + totalHarga());
    }
}
