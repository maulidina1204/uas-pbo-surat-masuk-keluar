public class SuratMasuk extends Surat {

    private String pengirim;

    public SuratMasuk(String nomorSurat, String tanggal, String perihal, String pengirim) {

        super(nomorSurat, tanggal, perihal);
        this.pengirim = pengirim;

    }

    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }
}