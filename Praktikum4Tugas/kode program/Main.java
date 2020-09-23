package Tugas;
public class Main {
    public static void main(String[] args){
        
            Pegawai m = new Pegawai(1941720102, "Hamdah");
            Direktur d = new Direktur(12371037, "Zerka byan");
            Ruangrapat r = new Ruangrapat("Hall 2");
            Project k = new Project("Project Perumahan", "Denah Perumahan");
            k.setDirektur(d);
            k.setPegawai(m);
            k.setRuangrapat(r);
        
            k.info();

    }
}
