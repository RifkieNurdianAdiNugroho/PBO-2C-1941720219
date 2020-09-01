package Kamar;
public class Botol {
     private String Jenis;
    private int berat,kekuatan,isi;    
    public void Jenis(String newValue){
        Jenis=newValue;
    }
    public void isiTambah(int increment){
        isi=isi+increment;
    }
    public void isiKurang(int decrement){
        isi=isi-decrement;
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
        System.out.println("Jenis minuman untuk: "+ Jenis);
        System.out.println("Isi AIR(ukuran mili): "+isi);
        System.out.println("Berat benda: "+ berat);
        System.out.println("Ketahanan benda: "+ kekuatan);
    }
}
