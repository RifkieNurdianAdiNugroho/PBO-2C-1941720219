
package pbo_teori_poliformismejs12;

public class TestBayaran {
    public static void main(String[] args) {
        Manajer jer = new Manajer("Agus",50, 850);
        Programmer game = new Programmer("Budi",30, 630);
        Bayaran hr = new Bayaran();
        System.out.println("Bayaran Manajer: " + hr.hitungBayaran(jer));
        System.out.println("Bayaran Programmer: " + hr.hitungBayaran(game));
    }
}
