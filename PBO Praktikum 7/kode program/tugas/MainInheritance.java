
package Tugas;

import java.util.Scanner;

public class MainInheritance {
     public static void main(String[] args) {
        
        PC pc = new PC("ASUS", 6, 8, "Inter core i7", 17);
        pc.tampilPc();

        Mac mac = new Mac("MacBook", 4, 8, "Quad-core i5", "Polimer", "Private internet access");
        mac.tampilMac();

        Windows windows = new Windows("ACER", 5, 8, "Intel core i5", "Acer Aspire Series 2920", "Ai");
        windows.tampilWindows();
    }
}
