
package Tugas;

public class OverridingMain {
        public static void main(String[] args) {
            OverridingManusia M = new OverridingManusia();
            OverridingManusia D = new OverridingDosen();
            OverridingManusia Ma = new OverridingMahasiswa();
            
            System.out.println("************");
            M.bernafas();
            M.makan();
            System.out.println("************");
            D.bernafas();
            D.makan();
            System.out.println("************");
            Ma.bernafas();
            Ma.makan();
        }
    }

