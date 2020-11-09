
package TugasJS10;

public class Gorilla extends Binatang implements Karnivora, Herbivora {
   public String suara;
   public String WarnaBulu;
   
   public void Gorilla(String nama,int jmlKaki,String suara,String warnaBulu){
       this.Gorilla(nama, jmlKaki, suara, warnaBulu);
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
        System.out.println("Makanan: Daging + Tumbuhan");    
    }

    void WarnaBulu() {
        System.out.println("Warna Bulu: Hitam Manis");
    }
    
    void Suara(){
        System.out.println("Suara: Haauumm Hauumm");
    }
    void Jenis(){
        System.out.println("Jenis: Karnivora + Herbivora");
    }
    

    
}
