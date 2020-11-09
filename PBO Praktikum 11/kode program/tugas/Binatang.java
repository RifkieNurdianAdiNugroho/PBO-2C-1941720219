
package TugasJS10;

public abstract class Binatang implements Karnivora, Herbivora {
    public abstract String nama();
    public abstract int jmlKaki();
    
    public void Binatang(String nama, int jmlKaki){
        this.Binatang(nama, jmlKaki);
    }
    public void setNama(String nama){
        this.nama();
    }
    public void getNama(){
        return;
    }
    public void setKaki(int jmlKaki){
        this.jmlKaki();
    }
    public void getKaki(){
        return;
    }
    public void display(){
        System.out.println("Nama Hewan "+this.nama());
        System.out.println("Jumlah Kaki "+this.jmlKaki());
    }
}
