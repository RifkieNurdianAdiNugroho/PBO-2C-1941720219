/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

public class Istri extends Manusia{
    private Pria suami;
    private Manusia Anak;
    public int umur;


    public Istri(String nama, int umur, boolean dewasa) {
        super(nama, umur, dewasa);
    }
    public Istri(){
        
    }
    public void Istri(Pria suami,Manusia anak) {
        this.suami = suami;
        this.Anak = anak;
    }
    public void setSuami(Pria suami) {
        this.suami =suami;
    }
    public Pria getSuami(){
        return suami;
    }
      public void setAnak(Manusia anak){
        this.Anak = anak;
    }
    public Manusia getAnak(){
        return Anak;
    }
     public void setumur(int umur){
        this.umur= umur;
    }
    public int getumur(){
        if(umur >= 20){
             System.out.println("Siap menikah");
    } else if(umur <= 20)
            System.out.println("Wanita ini masih Kuliah!");
        return umur;
    }
       public String info(){
        String info = "";
        info +="Nama : " +this.suami +"\n";
        info +="Kategori : " +this.umur +"\n";
         info +="Anak : " +this.Anak +"\n";
        return info();
       }
}
