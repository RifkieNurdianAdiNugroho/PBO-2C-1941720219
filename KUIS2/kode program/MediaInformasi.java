package kuispbo2;

public abstract class MediaInformasi implements Penerbit {

    public int jmlHalaman;
    public int tahunSekarang;

    public int getTahunSekarang(int tahun) {
        this.tahunSekarang= tahun;
        return tahunSekarang;
    }

    void setJMLHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

    @Override
    public void reputasi() {
        System.out.println("Reputasi");
    }
    @Override
    public void alamatPenerbit(String alamat){
        System.out.println("Alamat Penerbit: "+alamat);
    }
    @Override
    public void tahunBerdiri(int tahun){
        System.out.println("Penerbit ini berdiri pada tahun " + tahun + " jadi penerbit ini sekarang berusia :" + (tahunSekarang - tahun)+ "tahun");
    }

}
