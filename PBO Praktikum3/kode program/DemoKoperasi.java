
package motorencapsulation;
import java.util.Scanner;
public class DemoKoperasi {
    public static void main(String[] args){
        TesKoperasi donny = new TesKoperasi("111333444", "Donny", 5000000);
        Scanner rifki = new Scanner(System.in);
        int r, y;
        
            System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjam());

        System.out.print("\nMasukan Jumlah Pinjaman: ");
        y = rifki.nextInt();
        donny.getJumlahPinjam();

        if (donny.getJumlahPinjam() < donny.getLimitPinjam()) {
            donny.pinjam(y);
            System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjam());

            System.out.print("\nMasukan jumlah angsuran: ");
            r = rifki.nextInt();
            donny.angsur(r);
            System.out.println("\nJumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        } else {
            System.out.println("Pinjaman melibihi batas!!!");
        }
         
        System.out.println("\nMeminjam Uang 10.000.000. . .");
        donny.pinjam(5000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());

        System.out.print("\nMasukan jumlah angsuran: ");
        r = rifki.nextInt();
        donny.angsur(r);
        System.out.println("\nMeminjam uang 4.000.000. . .");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran 100.000");
        donny.angsur(100000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
   }
        
//        System.out.println("Nama Anggota: " + donny.getNama());
//        System.out.println("Limit Pinjaman: " + donny.getLimitPinjam());
//        
//        System.out.println("\nMeminjam Uang 10.000.000. . .");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMeminjam uang 4.000.000. . .");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
//        
        
    }

