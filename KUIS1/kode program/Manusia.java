/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo;

public class Manusia {
     public String nama;
    public int umur;
    private boolean dewasa;
    
    public Manusia(String nama, int umur, boolean dewasa) {
        this.nama = nama;
        this.umur = umur;
        this.dewasa = dewasa;
    }
public Manusia(){
    
}
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
    
    public void setDewasa(boolean dewasa) {
        this.dewasa = dewasa;
    }

    public boolean getDewasa() {
        return dewasa;
    }
    public String info(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.umur + "\n";
        info += "Dewasa: " + this.dewasa+ "\n";
        return info;
    }
}
