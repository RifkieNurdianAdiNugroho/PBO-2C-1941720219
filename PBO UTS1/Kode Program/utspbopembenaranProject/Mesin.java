
package utspbopembenaranProject;

    public class Mesin {

    public String merek;
    public double kecepatan = 0;

    public Mesin() {
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if (getMerek().equalsIgnoreCase("yamaha")) {
            System.out.println("" + (kecepatan += 15) + (" km/h"));
        } else {
            System.out.println("" + (kecepatan += 10) + (" km/h"));
        }
    }

    public void kurangiKecepatan() {
        if (getMerek().equalsIgnoreCase("yamaha")) {
            System.out.println("" + (kecepatan -= 10) + (" km/h"));
        } else {
            System.out.println("" + (kecepatan -= 5) + (" km/h"));
        }
    }
}
