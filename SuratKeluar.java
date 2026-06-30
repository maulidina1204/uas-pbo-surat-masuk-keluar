/**
 * Class Surat
 * Dokumentasi oleh Muhammad Fahmi
 */
public class SuratKeluar extends Surat {

    private String tujuan;

    public SuratKeluar(String nomorSurat, String tanggal, String perihal, String tujuan) {

        super(nomorSurat, tanggal, perihal);
        this.tujuan = tujuan;

    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}