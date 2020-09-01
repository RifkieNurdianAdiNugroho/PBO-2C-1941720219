
package Kamar;

public class KamarMandi extends Kamar {
    private int bakMandi;
    private int lebarbak,panjangbak;
    public void setbakMandi(int newValue){
        bakMandi=newValue;
    }
    public void tambahpanjangbak(int increment){
    panjangbak=panjangbak+increment;
}
public void kurangpanjangbak(int decrement){
    panjangbak=panjangbak-decrement;
}
public void tambahLebarbak(int increment){
    lebarbak=lebarbak+increment;
}
public void kuranglebarbak(int decrement){
    lebarbak=lebarbak-decrement;
}
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("bakMandi: "+bakMandi);
        System.out.println("Panjang Bak mandi: "+panjangbak);
        System.out.println("Lebar Bak mandi: "+lebarbak);
    }
    
}
