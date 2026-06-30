/**
 * Dikerjakan oleh dinda (maulidina1204)
 */
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JTextArea area;
    private SuratManager manager;

    public MainFrame() {

        manager = new SuratManager();

        // =========================
        // DATA DUMMY
        // =========================

        manager.tambahSurat(new SuratMasuk(
                "SM001",
                "2026-06-22",
                "Undangan Rapat Evaluasi Semester",
                "PT Mayora Indah Tbk"));

        manager.tambahSurat(new SuratKeluar(
                "SK001",
                "2026-06-20",
                "Balasan Kerja Sama Penelitian",
                "Universitas Brawijaya"));

        manager.tambahSurat(new SuratMasuk(
                "SM002",
                "2026-06-25",
                "Undangan Seminar Teknologi Informasi",
                "PT Paragon Technology and Innovation"));

        manager.tambahSurat(new SuratKeluar(
                "SK002",
                "2026-06-24",
                "Pengiriman Dokumen Akademik",
                "PT Telkom Indonesia"));

        manager.tambahSurat(new SuratMasuk(
                "SM003",
                "2026-06-18",
                "Permohonan Kerja Sama Penelitian",
                "Universitas Indonesia"));

        manager.tambahSurat(new SuratKeluar(
                "SK003",
                "2026-06-28",
                "Undangan Sosialisasi Program Magang",
                "Universitas Gadjah Mada"));

        // =========================
        // FRAME
        // =========================

        setTitle("Aplikasi Arsip Surat");
        setSize(1000, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // =========================
        // PANEL ATAS
        // =========================

        JPanel panelAtas = new JPanel(new GridLayout(3,1));

        JLabel judul = new JLabel(
                "APLIKASI ARSIP SURAT",
                SwingConstants.CENTER);                                 

        judul.setFont(new Font(
                "Times New Roman",
                Font.BOLD,
                24));

        JLabel subjudul = new JLabel(
                "PEMROGRAMAN BERBASIS OBJEK",
                SwingConstants.CENTER);

        subjudul.setFont(new Font(
                "Times New Roman",
                Font.BOLD,
                16));

        JPanel panelTombol = new JPanel();

        JButton btnTampil = new JButton("Tampilkan Data");
        JButton btnSort = new JButton("Sort Tanggal");
        JButton btnMasuk = new JButton("Filter Surat Masuk");
        JButton btnKeluar = new JButton("Filter Surat Keluar");
        JButton btnPdf = new JButton("Export PDF");

        Dimension ukuran = new Dimension(170,35);

        btnTampil.setPreferredSize(ukuran);
        btnSort.setPreferredSize(ukuran);
        btnMasuk.setPreferredSize(ukuran);
        btnKeluar.setPreferredSize(ukuran);
        btnPdf.setPreferredSize(ukuran);

        panelTombol.add(btnTampil);
        panelTombol.add(btnSort);
        panelTombol.add(btnMasuk);
        panelTombol.add(btnKeluar);
        panelTombol.add(btnPdf);

        panelAtas.add(judul);
        panelAtas.add(subjudul);
        panelAtas.add(panelTombol);

        // =========================
        // TEXT AREA
        // =========================

        area = new JTextArea();

        area.setEditable(false);

        area.setFont(new Font(
                "Times New Roman",
                Font.PLAIN,
                16));

        JScrollPane scrollPane = new JScrollPane(area);

        add(panelAtas, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // =========================
        // ACTION BUTTON
        // =========================

        btnTampil.addActionListener(e -> {
            area.setText(manager.tampilkanData());
        });

        btnSort.addActionListener(e -> {
            manager.sortTanggal();
            area.setText(manager.tampilkanData());
        });

        btnMasuk.addActionListener(e -> {
            area.setText(manager.tampilkanSuratMasuk());
        });

        btnKeluar.addActionListener(e -> {
            area.setText(manager.tampilkanSuratKeluar());
        });

      btnPdf.addActionListener(e -> {

    System.out.println("Tombol PDF diklik");

    PdfExporter.exportPDF(area.getText());

    JOptionPane.showMessageDialog(
            this,
            "PDF berhasil disimpan");

});

    }

}