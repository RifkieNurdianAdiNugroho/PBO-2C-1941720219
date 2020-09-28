package kuispbo;
public class Pria extends Manusia{
    private Manusia Manusia;
    private Istri Wanitaistri;
    public int umur;
    
     public Pria(String nama, int umur,boolean dewasa) {
        super(nama,umur,dewasa);
    }
     public Pria(){
         
     }
    public void setWanitaIstri(String wanitaistri) {
        this.Wanitaistri = Wanitaistri;
    }
    public Istri getWanitaIstri() {
        return Wanitaistri;
    }
    public void Istri(String wanitaistri){
        this.Wanitaistri = Wanitaistri; 
    }
    public void setManusia(Manusia Manusia){
        this.Manusia = Manusia;
    }
    public Manusia getManusia(){
        return Manusia;
    }
      public void setumur(int umur){
        this.umur= umur;
    }
    public int getumur(){
        if(umur >= 22){
             System.out.println("Dewasa/Siap menikah");
    } else if(umur <= 22)
            System.out.println("Pria ini masih Kuliah!");
        return umur;
    }
       public String info(){
        String info = "";
        info +="Nama : " + this.Manusia +"\n";
        info +="Kategori : " +this.Wanitaistri +"\n";
        return info();
       }
    }


