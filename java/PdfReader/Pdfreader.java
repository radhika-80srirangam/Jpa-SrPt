package PdfReader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class Pdfreader {

	public static void main(String[] args) {
		
		try {
			
			PDDocument document = PDDocument.load(new File ("D:\\App Development.pdf"));
			PDFTextStripper pdftext = new PDFTextStripper();
			String pdftextdata = pdftext.getText(document);
			System.out.println(pdftextdata);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
