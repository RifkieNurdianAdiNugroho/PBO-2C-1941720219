
package pbo_teori_poliformismejs12;

public class TesElektronik {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tvjadul = new TelevisiJadul("DVI", 0);
        TelevisiModern tvmodern = new TelevisiModern("HDMI", 0);

        indro.nyalakanPerangkat(tvjadul);
        indro.nyalakanPerangkat(tvmodern);
    }
    }
        

