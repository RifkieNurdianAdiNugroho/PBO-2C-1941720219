package Kamar;
public class Jendela {
      private String Jenis,isi;
    private int berat,kekuatan;
    public void Jenis(String newValue){
        Jenis=newValue;
    }
    public void isi(String newValue){
        isi=newValue;
    }
    public void tambahBerat(int increment){
        berat=berat+increment;
    }
        public void kurangBerat(int decrement){
        berat=berat-decrement;
        }
        public void tambahkekuatan(int increment){
        kekuatan=kekuatan+increment;
    }
    public void kurangkekuatan(int decrement){
        kekuatan=kekuatan-decrement;
    }
    public void cetakStatus(){
        System.out.println("Jenis: "+ Jenis);
        System.out.println("Isi Jari-Jari: "+isi);
        System.out.println("Berat(KG): "+ berat);
        System.out.println("Kekuatan: "+ kekuatan);
    }
}
