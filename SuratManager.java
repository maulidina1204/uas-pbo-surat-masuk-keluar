import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SuratManager {

    private ArrayList<Surat> daftarSurat;

    public SuratManager() {
        daftarSurat = new ArrayList<>();
    }

    // Menambah data surat
    public void tambahSurat(Surat surat) {
        daftarSurat.add(surat);
    }

    // Menampilkan semua data surat
    public void tampilkanSemuaSurat() {

        System.out.println("\n========== DAFTAR SURAT ==========\n");

        for (Surat surat : daftarSurat) {

            System.out.println("Nomor Surat : " + surat.getNomorSurat());
            System.out.println("Tanggal      : " + surat.getTanggal());
            System.out.println("Perihal      : " + surat.getPerihal());

            if (surat instanceof SuratMasuk) {
                SuratMasuk sm = (SuratMasuk) surat;
                System.out.println("Pengirim     : " + sm.getPengirim());
            } else if (surat instanceof SuratKeluar) {
                SuratKeluar sk = (SuratKeluar) surat;
                System.out.println("Tujuan       : " + sk.getTujuan());
            }

            System.out.println("-------------------------------------------");
        }
    }

    // Sorting berdasarkan tanggal
    public void sortTanggal() {

        Collections.sort(
                daftarSurat,
                Comparator.comparing(Surat::getTanggal));

    }
public String tampilkanData() {

    StringBuilder hasil = new StringBuilder();

    hasil.append("==============================\n");
    hasil.append("        DAFTAR SURAT\n");
    hasil.append("==============================\n\n");

    for (Surat surat : daftarSurat) {

        hasil.append("Nomor Surat : ")
             .append(surat.getNomorSurat())
             .append("\n");

        hasil.append("Tanggal      : ")
             .append(surat.getTanggal())
             .append("\n");

        hasil.append("Perihal      : ")
             .append(surat.getPerihal())
             .append("\n");

        if (surat instanceof SuratMasuk) {

            SuratMasuk sm = (SuratMasuk) surat;

            hasil.append("Pengirim     : ")
                 .append(sm.getPengirim())
                 .append("\n");

        } else {

            SuratKeluar sk = (SuratKeluar) surat;

            hasil.append("Tujuan       : ")
                 .append(sk.getTujuan())
                 .append("\n");
        }

        hasil.append("---------------------------------------------\n\n");
    }

    return hasil.toString();

}
public String tampilkanSuratMasuk() {

    StringBuilder hasil = new StringBuilder();

    hasil.append("============= SURAT MASUK =============\n\n");

    for (Surat surat : daftarSurat) {

        if (surat instanceof SuratMasuk) {

            SuratMasuk sm = (SuratMasuk) surat;

            hasil.append("Nomor Surat : ").append(sm.getNomorSurat()).append("\n");
            hasil.append("Tanggal      : ").append(sm.getTanggal()).append("\n");
            hasil.append("Perihal      : ").append(sm.getPerihal()).append("\n");
            hasil.append("Pengirim     : ").append(sm.getPengirim()).append("\n");
            hasil.append("--------------------------------------------\n\n");
        }
    }

    return hasil.toString();
}
public String tampilkanSuratKeluar() {

    StringBuilder hasil = new StringBuilder();

    hasil.append("============ SURAT KELUAR ============\n\n");

    for (Surat surat : daftarSurat) {

        if (surat instanceof SuratKeluar) {

            SuratKeluar sk = (SuratKeluar) surat;

            hasil.append("Nomor Surat : ").append(sk.getNomorSurat()).append("\n");
            hasil.append("Tanggal      : ").append(sk.getTanggal()).append("\n");
            hasil.append("Perihal      : ").append(sk.getPerihal()).append("\n");
            hasil.append("Tujuan       : ").append(sk.getTujuan()).append("\n");
            hasil.append("--------------------------------------------\n\n");
        }
    }

    return hasil.toString();
}
}