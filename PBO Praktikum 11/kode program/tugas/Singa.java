
package TugasJS10;

public class Singa extends Binatang implements Karnivora, Herbivora {
   public String suara;
   public String WarnaBulu;
   
   public void Singa(String nama,int jmlKaki,String suara,String warnaBulu){
       this.Singa(nama, jmlKaki, suara, warnaBulu);
   }
   public void Binatang(String nama,int jmlKaki){
       this.Binatang(nama, jmlKaki);
   }
  
    @Override
    public String nama() {
        System.out.println("Nama: CingAcing");
       return suara;
    }

    @Override
    public int jmlKaki() {
        System.out.println("Jumlah Kaki: 4 kaki");
       return 4;
    }

    @Override
    public void Makan() {
        System.out.println("Makanan: Daging");    
    }

    void WarnaBulu() {
        System.out.println("Warna Bulu: Coklat");
    }
    
    void Suara(){
        System.out.println("Suara: Roarrr");
    }
    void Jenis(){
        System.out.println("Jenis: Karnivora");
    }
    
}
