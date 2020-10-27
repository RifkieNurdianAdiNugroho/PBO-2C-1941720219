
package Tugas;

public class Overloading_main {

    public static void main(String[] args) {
        OverloadingSegitiga triangle = new OverloadingSegitiga();
        System.out.println(triangle.totalSudut(12));
        System.out.println(triangle.totalSudut(12, 57));
        System.out.println(triangle.keliling(14, 30));
        System.out.println(triangle.keliling(12, 21, 30));

    }
}
