
package TugasJS10;

public class Keledai extends Binatang implements Karnivora, Herbivora {
   public String suara;
   public String WarnaBulu;
   
   public void Keledai(String nama,int jmlKaki,String suara,String warnaBulu){
       this.Keledai(nama, jmlKaki, suara, warnaBulu);
   }
   public void Binatang(String nama,int jmlKaki){
       this.Binatang(nama, jmlKaki);
   }
  
    @Override
    public String nama() {
        System.out.println("Namanya: Gulali");
       return suara;
    }

    @Override
  public int jmlKaki() {
        System.out.println("Jumlah Kaki: 4 kaki");
       return 4;
    }

    @Override
    public void Makan() {
        System.out.println("Makanan: Tumbuhan");    
    }

    void WarnaBulu() {
        System.out.println("Warna Bulu: Abu-Abu");
    }
    
    void Suara(){
        System.out.println("Suara: Hehehe");
    }
    void Jenis(){
        System.out.println("Jenis: Herbivora");
    }
}
    

