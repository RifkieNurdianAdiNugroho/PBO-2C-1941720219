
package Kamar;


public class KamarDemoMain {
    public static void main(String[] args) {
        Kamar kmr0=new Kamar();
        Kamar kmr1=new Kamar();
        Kamar kmr2=new Kamar();
        KamarMandi kmrM1=new KamarMandi();
        KamarMandi kmrM2=new KamarMandi();
        KamarTidur kmrT1=new KamarTidur();
        KamarTidur kmrT2=new KamarTidur();
        Jendela jndl1=new Jendela();
        Jendela jndl2=new Jendela();
        Botol btl1=new Botol();
        Botol btl2=new Botol();
        
        kmr0.setTipe("Kamar");
        kmr0.setIsi("Kasur,Lemari,Kipas");
        kmr0.cetakStatus();
       
        kmr1.setTipe("Anak");
        kmr1.setIsi("Mainan,Kasur,Kipas");
        kmr1.cetakStatus();
        
        kmr2.setTipe("Ortu");
        kmr2.setIsi("Lemari,Kasur,Kipas");
        kmr2.cetakStatus();
        
        kmrM1.setTipe("Anak");
        kmrM1.setIsi("Sabun,Shampo,Sikat Gigi");
        kmrM1.setbakMandi(1);
        kmrM1.tambahpanjangbak(3);
        kmrM1.tambahLebarbak(2);
        kmrM1.cetakStatus();
        
        kmrM2.setTipe("Ortu");
        kmrM2.setIsi("Sabun,Shampo,Sikat gigi");
        kmrM2.setbakMandi(1);
        kmrM2.tambahpanjangbak(3);
        kmrM2.tambahpanjangbak(1);
        kmrM2.tambahLebarbak(2);
        kmrM2.cetakStatus();
        
        kmrT1.setTipe("Anak");
        kmrT1.setIsi("Mainan,Kipas,Lampu");
        kmrT1.setKasur("Kasur Springbed");
        kmrT1.cetakStatus();
        
        kmrT2.setTipe("Orang Tua");
        kmrT2.setIsi("Kipas,Lampu");
        kmrT2.setKasur("Kasur Springbed");
        kmrT2.cetakStatus();
        
        jndl1.Jenis("Besi");
        jndl1.isi("Tralis ulir");
        jndl1.tambahBerat(5);
        jndl1.tambahBerat(2);
        jndl1.tambahkekuatan(10);
        jndl1.kurangkekuatan(1);
        jndl1.cetakStatus();
        
        jndl2.Jenis("Besi");
        jndl2.isi("Tralis minimalis");
        jndl2.tambahBerat(4);
        jndl2.tambahBerat(2);
        jndl2.kurangBerat(1);
        jndl2.tambahkekuatan(7);
        jndl2.kurangkekuatan(1);
        jndl2.cetakStatus();
        
        btl1.Jenis("Anak");
        btl1.isiTambah(120);
        btl1.isiTambah(2);
        btl1.isiKurang(1);
        btl1.tambahBerat(120);
        btl1.tambahkekuatan(70);
        btl1.cetakStatus();
        
        btl2.Jenis("Ortu");
        btl2.isiTambah(210);
        btl2.isiTambah(10);
        btl2.tambahBerat(250);
        btl2.tambahkekuatan(50);
        btl2.cetakStatus();
                }
}
