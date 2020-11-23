
package kuispbo2;

public class Majalah extends MediaInformasi {
    
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
    }
    public void reputasi(){
        System.out.println("Majalah memiliki: " + this.jmlHalaman + "Halaman ");
        System.out.println("maka jumlah halaman apabila dihitung covernya juga maka jumlah halaman majalah tersebut: "+ (this.jmlHalaman+2)+"Halaman");
        System.out.println("Penerbit majalah ini bereputasi!");
    }

}
