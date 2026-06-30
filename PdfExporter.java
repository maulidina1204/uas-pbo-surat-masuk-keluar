/**
 * Dikerjakan oleh dinda (maulidina1204)
 */
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class PdfExporter {

    public static void exportPDF(String isi) {

        try {

            PDDocument document = new PDDocument();

            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream content =
                    new PDPageContentStream(document, page);

            content.beginText();

            content.setFont(PDType1Font.HELVETICA, 12);

            content.newLineAtOffset(50, 750);

            String[] baris = isi.split("\n");

            for (String s : baris) {

                content.showText(s);
                content.newLineAtOffset(0, -18);

            }

            content.endText();

            content.close();

            document.save("LaporanSurat.pdf");

            System.out.println("Lokasi: " + System.getProperty("user.dir"));

            document.close();

            System.out.println("PDF berhasil dibuat.");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}