public class Surat {

    protected String nomorSurat;
    protected String tanggal;
    protected String perihal;

    public Surat(String nomorSurat, String tanggal, String perihal) {
        this.nomorSurat = nomorSurat;
        this.tanggal = tanggal;
        this.perihal = perihal;
    }

    public String getNomorSurat() {
        return nomorSurat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getPerihal() {
        return perihal;
    }

    public void setNomorSurat(String nomorSurat) {
        this.nomorSurat = nomorSurat;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setPerihal(String perihal) {
        this.perihal = perihal;
    }
}